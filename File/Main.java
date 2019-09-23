import java.io.*;
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        String filename;
        Scanner s= new Scanner(System.in);
        filename=s.nextLine();
        File f= new File(filename);
        System.out.println("Name "+ f.getName());
        System.out.println("Path "+ f.getAbsolutePath());
        System.out.println("Read "+ f.canRead());
        System.out.println("Write "+ f.canWrite());
        System.out.println("file "+ f.isFile());
        System.out.println("Directory "+ f.isDirectory());
        System.out.println("last modified"+ f.lastModified());
        System.out.println("length "+ f.length());
        System.out.println("exists "+ f.exists());
    }
}