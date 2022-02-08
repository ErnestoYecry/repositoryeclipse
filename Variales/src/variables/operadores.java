package variables;
/*
class operadores {

	public class test {
		
		public static void main (String[] args)
		{
			String s1 = "Hello";
			String s2 = "Hello";
			String s3 = new String ("Hello");
			
			
			System.out.println(s1==(s3));
			System.out.println(s1==(s2));
			
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));

			
		}
	} */

class operadores{ //test 2



public static void main(String[] args)
    {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
 
String s1 = new String("GEEKS");
String s2 = new String("GEEKS");
 
System.out.println(t1 == t2);
System.out.println(t1 == t3);
System.out.println(s1 == s2);
 
        System.out.println(t1.equals(t2));
        System.out.println(s1.equals(s2));
    }

	
	
	
	
	
}
