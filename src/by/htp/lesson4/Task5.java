package by.htp.lesson4;

public class Task5 {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ -9, 1, 0, 2, 5 },
				{ 4, 1, 1, 0, 7 }, 
				{ -2, 2, -1, 9, 8 }, 
				{ 4, 1, 1, 0, 3 },
				{ 4, 1, 1, 0, 6 }, };

		
		for(int i = 0; i < matrix[0].length; i++) {
			int max = matrix[0][i];
			for(int j = 0; j < matrix[0].length; j++) {
				if(max < matrix[j][i]) {
					max = matrix[j][i];
				}
			}
			System.out.println(max);
		}
	}
}
