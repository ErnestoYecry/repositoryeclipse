package funciones;

public class Main {

	static void myMethod(String fname, int age, int year, String carro) {
	    System.out.println(fname + " tiene " + age + " de edad " + "y nacio en el  " + year + " y maneja un " + carro);
	  }
	  public static void main(String[] args) {
	    myMethod("Liam", 5, 2022, "rayo mcqueen");
	    myMethod("Jenny", 8, 2001, "trokona");
	    myMethod("Anja", 31, 1800, "Mercedez Benz");
	  		
	}
}
