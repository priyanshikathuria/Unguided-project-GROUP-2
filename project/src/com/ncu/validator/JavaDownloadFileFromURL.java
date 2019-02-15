package java.io;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.Exception;
import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Scanner;
import java.util.zip.ZipFile;
import java.nio.channels.FileChannel;
import jdk.internal.misc.SharedSecrets;
import jdk.internal.misc.JavaIOFileDescriptorAccess;
import sun.nio.ch.FileChannelImpl;

public class JavaDownloadFileFromURL {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the url:");
        String url = sc.nextLine();
        System.out.println("Enter the path:");
	String path=sc.nextLine();
        try {
 
           downloadUsingNIO(url, path);
            
            downloadUsingStream(url, path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void downloadUsingStream(String urlStr, String file) throws IOException{
        URL url = new URL(urlStr);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        FileOutputStream fis = new FileOutputStream(file);
        byte[] buffer = new byte[1024];
        int count=0;
        while((count = bis.read(buffer,0,1024)) != -1)
        {
            fis.write(buffer, 0, count);
        }
        fis.close();
        bis.close();
    }

    private static void downloadUsingNIO(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);
        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);}}
       