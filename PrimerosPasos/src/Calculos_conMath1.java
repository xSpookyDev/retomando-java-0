
public class Calculos_conMath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//double  raiz = Math.sqrt(9); "sqrt" Raiz cuadrada de un numero
		//int resultado = (int) Math.round(num1); "round" para redondear un numero
		
		double base = 5;
		double exponente =3;
		
		int resultado = (int)Math.pow(base, exponente);
		
		
		System.out.println("El resultado de "+ base + " elevado a "+ exponente+ " es igual a :"+resultado);
		
	}

}
