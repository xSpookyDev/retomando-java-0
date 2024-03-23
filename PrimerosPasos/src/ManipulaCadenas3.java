
public class ManipulaCadenas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "Hoy es un estupendo dia para aprender a programar en java";
		//Metodo que permite separar un string a traves de su posicion en numero(inicio/final)
		String frase_resumen = frase.substring(0,29)+ " estudiar cloud y " + frase.substring(29, 57);
		System.out.println(frase_resumen);
		
		
	}

}
