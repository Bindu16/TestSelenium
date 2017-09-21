package javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class java_iofilestream {

public static void main (String[] args) throws FileNotFoundException
{
	FileInputStream x = new FileInputStream("D:\\Bindu\\Selenium\\src\\javaio\\12.Properties");
	
	FileOutputStream y = new FileOutputStream("D:\\test01.txt");
}

}
