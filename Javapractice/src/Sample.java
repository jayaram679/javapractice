
class Sample{  
   int rollno;  
   String name;  
   static String college ="ITS";  
     
   Sample(int r,String n){  
   rollno = r;  
   name = n;  
   }
   void display() {
	   System.out.println(rollno+"  "+name+"  "+college);
   }

 public static void main(String args[]){  
 Sample s1 = new Sample(111,"Karan");  
 Sample s2 = new Sample(222,"Aryan");  
 s1.display();
 s2.display();
   
  
 }  
}  