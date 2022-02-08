package variables;

public class narrowingCasting {
	public static void main (String[]args) {
		
	double myDouble = 9.78; 
	
	int myInt = (int)myDouble;
	
	System.out.println(myDouble);	//debe arrojar 9.78
	
	System.out.println(myInt); //debe arrojar 9  ya que le quita los decimales
	
	
	
	
	
	}	
}
