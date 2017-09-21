package sikuli;

import org.sikuli.script.App;
import org.sikuli.script.Screen;

public class calc {

	public static void main(String[] args) throws Exception
		{
		Screen X = new Screen();
		App.open("calc.exe");
		 
		X.click("C:\\Users\\Lab\\Desktop\\calc.sikuli\\calwindow");
		X.click("C:\\Users\\Lab\\Desktop\\calc.sikuli\\seven.png");
		X.click("C:\\Users\\Lab\\Desktop\\calc.sikuli\\mult.png");
		X.click("C:\\Users\\Lab\\Desktop\\calc.sikuli\\five.png");
		X.click("C:\\Users\\Lab\\Desktop\\calc.sikuli\\equal.png");
		Thread.sleep(1000);
		App.close("calc.exe");

	}

}
