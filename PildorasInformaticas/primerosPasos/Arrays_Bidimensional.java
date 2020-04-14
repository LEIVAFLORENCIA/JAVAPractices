package primerosPasos;

public class Arrays_Bidimensional {
	public static void main(String[] args) {
		
		int [][] matrix=new int[4][5];
		
		/*RELLENAR MATRIZ*/
		matrix[0][0]=15;
		matrix[0][1]=56;
		matrix[0][2]=445;
		matrix[0][3]=45;
		matrix[0][4]=14;
		
		matrix[1][0]=5;
		matrix[1][1]=1;
		matrix[1][2]=45;
		matrix[1][3]=95;
		matrix[1][4]=35;
		
		matrix[2][0]=13;
		matrix[2][1]=12;
		matrix[2][2]=11;
		matrix[2][3]=14;
		matrix[2][4]=5;
		
		matrix[3][0]=7;
		matrix[3][1]=9;
		matrix[3][2]=5;
		matrix[3][3]=9;
		matrix[3][4]=8;
		
		for (int i=0;i<4;i++) {

			for(int j=0;j<5;j++) {
				System.out.print(matrix[i][j] + " ");
				/*al no finalizar el bucle, continuará en el bucle j
				 * hasta llegar a j=5*/
			}
			System.out.println();
		}
	}
}
