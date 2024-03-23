import javax.swing.JOptionPane;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//JOptionpane es para crear una pequeña gui en la pantalla con el mensaje ingresado, obviamente ingresando el metodo adecuado
		String nombre_usuario = JOptionPane.showInputDialog("Ingresa tu nombre:");
		
		String edad = JOptionPane.showInputDialog("ingresa tu edad:");
		
		int edad_usaurio = Integer.parseInt(edad);
		
		edad_usaurio++;
		
		System.out.println("Tu nombre es: " + nombre_usuario + " tienes "+ (edad_usaurio+1) + " años");
	}

}
