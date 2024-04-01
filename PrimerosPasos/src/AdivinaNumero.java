import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int aleatorio = (int)(Math.random()*100);
			
			Scanner entrada = new Scanner(System.in);
			
			int numero = 0;
			
			int intentos =0;
			
			while(numero != aleatorio) {
				intentos++;
				System.out.println("Introduce un numero:");
				numero = entrada.nextInt();
				
				if(aleatorio < numero) {
					System.out.println("El numero es menor al ingresado");
				}
				else if(aleatorio > numero) {
					System.out.println("El numero es mas alto");
				}
			
					
			}
			
			System.out.println("Has elegido el numero correcto");
			System.out.println("Numeros de intentos: "+ intentos);
	}

}
