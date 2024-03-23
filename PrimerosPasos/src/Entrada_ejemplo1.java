import java.util.Scanner;

public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//entrada es el objeto de scanner que utilizaremos para ocupar sus metodos, polimorfismo
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		
		String nombre_usuario = entrada.nextLine();
		
		System.out.println("Introduce tu edad: ");
		
		int edad = entrada.nextInt();
		
		
		System.out.println("Genial tu nombre es: "+ nombre_usuario + " el año que viene tendras "+ (edad+1) +" años");
		
	}

}
