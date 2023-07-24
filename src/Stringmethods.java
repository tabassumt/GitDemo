
public class Stringmethods {

	public static void main(String[] args) {
		
		//string literal
		// String s= "Selenium Java Project";
		
		 //new memory allocate operator
		// String s1= new String("Selenium with java");
		 
	/*	 System.out.println(s);
		 System.out.println(s1);
		 System.out.println(s1.charAt(0));*/
		 
		 
		/* String s= "Selenium Java Project";
		 String[] splitedString= s.split(" ");
		System.out.println(splitedString[0]);
		System.out.println(splitedString[1]);
		System.out.println(splitedString[2]);*/
		
		String s= "Selenium Java Project";
		 String[] splitedString= s.split("Java");
		System.out.println(splitedString[0]);
		System.out.println(splitedString[1]);
	//	System.out.println(splitedString[2]);
		System.out.println(splitedString[1].trim());
		
		/*for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}*/
		
		//Reverse a string
		
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 System.out.println(s.charAt(i));
		 }
		 

	}

}
