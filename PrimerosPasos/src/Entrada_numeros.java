import javax.swing.JOptionPane;

public class Entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double x= 10000.0;
     //printf tiene dos parametros, el formato que le queremos dar y el valor numerico 
    // System.out.printf("%1.4f",x/3);
     
     
     String num1 = JOptionPane.showInputDialog("Introduce un numero:");
     double numero1 = Double.parseDouble(num1);
     System.out.print("La raiz de " + numero1 + " es: ");
     
     System.out.printf("%1.4f", Math.sqrt(numero1));
    
	}

}
