import javax.swing.JOptionPane;

public class AccesoApp {

	public static void main(String[] args) {
		
		String clave = "Ricardo";
		
		String pass = "";
		
		while (clave.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Introduce la contraseña");
			
			if(clave.equals(pass)==false) {
				
				System.out.println("La contraseña es incorrecta");
				
			}
			
		}
		
		System.out.println("Contraseña correcta, acceso permitido");

	}

}
