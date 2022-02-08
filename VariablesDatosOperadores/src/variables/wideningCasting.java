package variables;

public class wideningCasting {

	public static void main (String[]args) {
		
		int myInt = 9;
		double myDouble = myInt; 
		System.out.println(myInt); //debe arrojar 9 
		System.out.println(myDouble);	//debe arrojar 9.0
	}	
}
