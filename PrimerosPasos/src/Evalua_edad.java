import java.util.Scanner;

public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su edad :");
		
		int edad= entrada.nextInt();
		
		if(edad>=18) {
			System.out.println("Genial eres mayor de edad!");
		}else {
			System.out.println("Aun eres menor de edad, vuele pronto");
		}
		
	}

}
