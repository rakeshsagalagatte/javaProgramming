import java.io.*;
class MyFiles
{
	public static void main(String args[]) throws IOException
	{
			if(args.length==0)
			{
					System.out.println("No file");
					System.exit(0);
			}
			else
			{	
					String data="";		
					try
					{
						File file = new File(args[0]);
						BufferedReader br = new BufferedReader(new FileReader(file)); 
				  		String st; 
						while ((st = br.readLine()) != null) 
						{
							data=data+st;
						}
						//System.out.println(data);
						byte buf[]=data.getBytes();
						OutputStream f1 = new FileOutputStream("file1.txt");
						OutputStream f2 = new FileOutputStream("file2.txt");
						OutputStream f3 = new FileOutputStream("file3.txt");
						for(int i=0;i<buf.length;i=i+2)
						{
							f1.write(buf[i]);
						}
						f1.close();
						System.out.println("Writing completed in file1.txt");
						f2.write(buf);
						f2.close();
						System.out.println("Writing completed in file2.txt");
						for(int i=(3*(buf.length))/4;i<buf.length;i++)
						{
							f3.write(buf[i]);
						}
						f3.close();
						System.out.println("Writing completed in file3.txt");
					}
					catch(FileNotFoundException e)
					{
						System.out.println("File Not found");
						System.exit(0);
					}
			}		
	}
}
