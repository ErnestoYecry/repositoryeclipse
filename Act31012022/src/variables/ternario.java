package variables;

import java.util.Scanner;

public class ternario {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce tu Edad: ");
		int edad = teclado.nextInt();
		
		System.out.println(edad>=18 && edad<=150 ?"Eres Mayor de Edad" :  edad>=0 && edad<=18 ? "Eres menor de Edad" :  "El rango de edad es incorrecto")   ;
		
	

	}

}
