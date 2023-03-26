package practise;

public class exercise3 {
	public static void main(String args[]) 
    { 
    /*    String str = "My name is Chaitanya";
        //regular expression is a whitespace here 
        String[] arr = str.split(" "); 
  
        for (String s : arr) 
            System.out.println(s);  */
		
		String[] strings = "Thequickbrownfoxjumps".split("(?<=\\G.{4})"); 
		String[] strings1 = "Thequickbrownfoxjumps".split("(?<=\\G.{100})");
		System.out.println(java.util.Arrays.toString(strings));
		
    } 
}
	
	
	
	

