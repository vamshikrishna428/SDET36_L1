package practise;

import java.util.Random;

public class Excercise {

	public static void main(String[] args) {

		Random random=new Random();
		int rn = random.nextInt(100);
		String name = "vamshi_'skrishna";
	/*	String[] name1 = name.split("k");	*/
		String vj = name.substring(0, name.lastIndexOf("'s"));
		System.out.println(vj);
	/*	String xyz = name.substring(0, name.indexOf("k"))+rn;
		String b = name.substring(name.indexOf("k"));
		String abc = xyz.concat(b);
		
		// System.out.println(xyz);
		System.out.println(abc);	*/
		
		
	}

}
