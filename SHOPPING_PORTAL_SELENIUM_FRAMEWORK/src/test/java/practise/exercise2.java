package practise;

public class exercise2 {

	public static void main(String[] args) {
		String name = "ajay  ###";
	/*	String lokesh = String.format(name, "kumar");
		System.out.println(lokesh); */
		
		String anke = name.replace("###", "lokesh");
		System.out.println(anke);
	}

}
