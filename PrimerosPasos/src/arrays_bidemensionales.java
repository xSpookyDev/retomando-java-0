
public class arrays_bidemensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix = new int[4][5];
		
		matrix[0][0]=45;
		matrix[0][1]=35;
		matrix[0][2]=32;
		matrix[0][3]=55;
		matrix[0][4]=15;
		
		matrix[1][0]=15;
		matrix[1][1]=32;
		matrix[1][2]=12;
		matrix[1][3]=11;
		matrix[1][4]=19;
		
		matrix[2][0]=11;
		matrix[2][1]=1321;
		matrix[2][2]=112;
		matrix[2][3]=14;
		matrix[2][4]=142;
		
		matrix[3][0]=150;
		matrix[3][1]=158;
		matrix[3][2]=151;
		matrix[3][3]=1512;
		matrix[3][4]=15;
		
		
		for(int i = 0 ; i<4; i++) {
			System.out.println();
			for (int j=0; j<5; j++)
				System.out.println(matrix[i][j]+ " ");
			//programa funcionando
		}
		
		
		
		
		
	}

}
