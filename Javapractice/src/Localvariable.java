
public class Localvariable {
	public String myVar="one";
    
	   public void myMethod(){
	    	// local variable
	    	String myVar = "two";
	    	System.out.println(myVar);
	   }
	   public static void main(String args[]){
	      // Creating object
	       Localvariable obj = new Localvariable();
	    	
	      /* We are calling the method, that changes the 
	       * value of myVar. We are displaying myVar again after 
	       * the method call, to demonstrate that the local 
	       * variable scope is limited to the method itself.
	       */
	      System.out.println("three");
	      obj.myMethod();
	      System.out.println(obj.myVar);
}
}
