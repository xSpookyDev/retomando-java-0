import javax.swing.JOptionPane;

public class Uso_ARRAY2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] paises = new String[8];
		
		
		for (int i=0; i<8;i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce el pais "+ (i+1));
			
			
		}
		/*
		paises[0]= "Alemania";
		paises[1]= "Francia";
		paises[2]= "Chile";
		paises[3]= "Peru";
		paises[4]= "Argentina";
		paises[5]= "Cuba";
		paises[6]= "Albania";
		paises[7]= "Croacia";*/
		
		//String[] pais= {"alemania", "chile", "argentina", "paraguay", "brazil", "peru"};
		
		
	/*	for (int i =0; i<paises.length; i++) {
			
			System.out.println("Pais: "+ (i+1) +" "+ paises[i]);
		}
		*/
		
		
		
		for(String elemento: paises) {
			
			System.out.println("El pais es: "+elemento);
		}
		
		
		
	}

}
