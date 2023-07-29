import java.util.ArrayList;

public class JavaStreams {
	   @Test
		public void regular()
	   {
			
		
				ArrayList<String> name= new ArrayList<String>();
				name.add("Anaya");
				name.add("Aksa");
				name.add("Iram");
				name.add("Afsa");
				name.add("Akhil");
			   int count=0;
			
			for(int i=0;i<name.size();i++)
			{
				String actual=name.get(i);
		        if(actual.startsWith("A"))
		        {
		        	count++;
		        	
		        }
		        System.out.println(count);
			}


	}

}
