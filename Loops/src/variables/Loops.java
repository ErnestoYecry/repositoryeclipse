package variables;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
	    int num;
	    int i=0;
	    int result=0;
	    
	    System.out.print("Enter any positive integer: ");
	    num = s.nextInt();
	           
	    System.out.println("Multiplication Table of " + num);
	    
	    while(i <= 10) {
	    	result = num * i++;
			System.out.println(result);
	    }
	}
}
