import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			boolean arroba =false;
			
			String mail = JOptionPane.showInputDialog("Introduce email");
			
			for(int i = 0; i<mail.length(); i++) {
				if(mail.charAt(i)=='@') {
					arroba = true;
				}
			}
			if(arroba==true) {
				System.out.println("Es correcto");
			}
			else {
				System.out.println("No es correcto");
			}
	}

}
