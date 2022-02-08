 /* package variables;

import java.util.Scanner;

public class DoWhileloops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
  
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
  
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
	}

}  */ 
 


package variables;

import java.util.Scanner;

public class DoWhileloops {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num=0;
	    int num1=0;
	    int num2=1;
	    int i=0;
	    int result=0;
	    
	    System.out.print("Enter any positive integer: ");
	    num = s.nextInt();
	 
		
		do {
			 num2 = num1 + num2;
	         num1 = num2 - num1;

			System.out.println(num2);
			i++;
		}
		while(i<num);
	}

}




