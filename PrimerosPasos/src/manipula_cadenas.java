
public class manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Ricardo";
		System.out.println("Mi nombre es :"+ nombre);
		
		System.out.println("Mi nombre tiene "+ nombre.length()+ "Letras"); 
		System.out.println("La primera letra de mi nombre es: "+ nombre.charAt(0));
		
		int ultima_letra;
		
		ultima_letra = nombre.length();
		
		System.out.println("La ultima letra es la " + nombre.charAt(ultima_letra-1));
		
	}

}
