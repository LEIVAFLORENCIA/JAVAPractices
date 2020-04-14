package primerosPasos;

public class Arrays_BidimensionalII {
	public static void main(String[] args) {
		
		int[][] matrix= {
				{15,56,445,45,14},
				{5,1,45,95,35},
				{13,12,11,14,5},
				{7,9,5,9,8}
		};
		
		for (int[]fila:matrix) {
			for(int z:fila) {
				System.out.print(z + " ");
			}
		System.out.println();	
		}
	}
			
}
