package org.yantra.genericutility;

import java.util.Random;
/**
 * this class contains all reusable methods
 * @author Vamshi
 *
 */

public class javaUtility {
	/**
	 * this method is used to generate random number
	 * 
	 * 
	 */
	public int getRandomNum(){
	return new Random().nextInt(100);
	}
/*	public static void main(String[] args) {
		Random random=new  Random();	
		int data = random.nextInt(100);		// int data=new Random().nextInt(100);
		System.out.println(data);
	}
*/
	/** this method is used to print the statement in console
	 * @return 
	 * 
	 */
public  void printStatement(String statement) {
	System.out.println(statement);
}

/**	this method is used to convert from String to long
 * 
 * @param args
 */
public long ConvertStringToLong(String num) {
	return Long.parseLong(num); 
}

/**
 * 	this method is used to convert From String to integer
 * @param args
 * @return 
 */

public int ConvertStringtoIneger(String num) {
	return Integer.parseInt(num);
}

				/*public static void main(String[] args) 
				String s = "123.063";
				double v = Double.parseDouble(s);
				System.out.println(v);
				int a = Integer.parseInt(s);
				System.out.println(a);
				long ab = Long.parseLong(s);
				System.out.println(ab);	*/

	
}
	

