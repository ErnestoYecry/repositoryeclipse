package variables;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Eligue una Opcion");
		String enter = s.nextLine();
 		
		switch (enter) {
		case "1":
			System.out.println("Eligiste Opcion uno");
			break;
		case "2":
			System.out.println("Elegiste la Opcion dos");
			break;
			default:
				System.out.println("Eleccion Incorrecta");
				break;
		}
	}

}
