package funciones;

import java.util.Scanner;

public class Calculadora {
	
	static double suma(double a,double b) {
		return a+b;
		
	}
	static double resta(double a,double b) {
		return a-b;
		
	}
	static double multi(double a,double b) {
		return a*b;
		
	}
	static double divi(double a,double b) {
		return a/b;
		
	}	
	
	
 public static void main(String[] args) {
	 
	 try (Scanner s1 = new Scanner (System.in)) {
		System.out.println("Introduce el primer numero");
		 double x = s1.nextDouble();
		 
		 try (Scanner s2 = new Scanner (System.in)) {
			System.out.println("Introduce el segundo numero");
			 double y = s2.nextDouble();
			 
			 System.out.println("La suma es: "+ suma(x,y));
			 System.out.println("La resta es: "+ resta(x,y));
			 System.out.println("La multiplicacion es: "+ multi(x,y));
			 System.out.println("La division es: "+ divi(x,y));
		}
	}
 }
 
 
	 
 }
