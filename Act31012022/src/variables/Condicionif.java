package variables;
import java.util.Scanner;

public class Condicionif {
	public static void main(String[] args) {
		
		Scanner value= new Scanner(System.in);
		System.out.println("Introduce tu Edad: ");
		int age = value.nextInt();
		
		if ( age >= 18 && age<=150) {
			System.out.println("Eres Mayor de edad ");// Ejecutar declaraci�n de bloque;
			}
			else if( age>0 && age<18){
				System.out.println("Eres Menor de edad ");// Ejecutar segunda declaraci�n de bloque de condici�n;
			} else{
				System.out.println("El rango de edad es incorrecto");
			// Ejecutar otra declaraci�n de bloque;
			}
		}
	}





