
public class Inherit1 {
      //I am creating objects for classes for 
	 //to use there methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bee obj1=new Bee();
		obj1.a=5;
		obj1.b=10;
		obj1.c=obj1.a+obj1.b;
		System.out.println(obj1.c);
		
		obj1.d=20;
		obj1.e=10;
	    obj1.f=obj1.d-obj1.e;
        System.out.println(obj1.f);
	}

}
