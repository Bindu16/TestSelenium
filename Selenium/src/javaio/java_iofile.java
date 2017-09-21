package javaio;

import java.io.File;
import java.io.IOException;

public class java_iofile {

public static void main (String [] args) throws IOException
{
	File x = new File("D:\\A\\io.xls");
	
		if(!(x.exists()))
		{
			x.createNewFile();
		}
		
		if(x.exists())
		{
			System.out.println("File Exists");
		}

System.out.println(x.getAbsolutePath());

}
}
