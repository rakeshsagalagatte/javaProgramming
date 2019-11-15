import java.io.File;

public class FileAttribute {
    
     static void p(String s)
     {
       System.out.println(s);
     }

     public static void main(String args[])
     {
        File f = new File("../Part_B");
        p("File Name : " + f.getName());
        p("Path: " + f.getPath());
        p("Abs Path: " + f.getAbsolutePath());
        p("Parent: " + f.getParent());
        p(f.exists() ? "exits" : "does not exist");
        p(f.canWrite() ? "is Writeable" : "is not Writeable");
        p(f.canRead()? "is readable" : "is not readable");
        p("is " + (f.isDirectory() ? "Directory" : "not " + " a directory"));
        p(f.isFile() ? "is normal file" : "might be a named pipe");
        p(f.isAbsolute() ? " is absolute" : "is not absolute");
        p("File last modified : " + f.lastModified());
        p("File size: " + f.length() + " Bytes");
     }
}
