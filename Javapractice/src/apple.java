
public class apple  {
		 String name="jayaram";
			
		   public static void main(String args[]){
			apple obj = new apple();
			apple obj2 = new apple();
			apple obj3 = new apple();
				
			System.out.println(obj.name);
			System.out.println(obj2.name);
			System.out.println(obj3.name);

				
			obj2.name = "venky";

				
			System.out.println(obj.name);
			System.out.println(obj2.name);
			System.out.println(obj3.name);
		   }
		}