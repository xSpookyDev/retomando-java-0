
public class ManipulaCadenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String alumno1, alumno2;
		
		alumno1 = "Pedro";
		alumno2 = "PEDRO";
		//equals es para comparar dos cadenas de texto;
		System.out.println(alumno1.equals(alumno2));
		String alumno3 = "Pedro";
		
		System.out.println(alumno1.equals(alumno3));
		
		//ignoreCase ignora mayusculas y minusculas
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
	}

}
