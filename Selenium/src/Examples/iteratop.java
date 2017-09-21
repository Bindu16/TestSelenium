package Examples;

import java.util.ArrayList;
import java.util.Iterator;


public class iteratop {

	public static void main(String[] args) {
		
		ArrayList <String> AL = new ArrayList <String>();
		AL.add("qa");
		AL.add("ws");
		AL.add("");
		
		// By using Iterator method
		
		Iterator <String> ITRT = AL.iterator();
		while(ITRT.hasNext())
		{
			String IT =ITRT.next();
			System.out.println(IT);
		}
		
		//By using for each loop
		/*for(String q:AL)
		{
			System.out.println(q);
		} */
		
	//By using for loop
		/*for(int i=0;i<AL.size();i++) 
		{
			System.out.println(AL.get(i));
		} */
	}
}
