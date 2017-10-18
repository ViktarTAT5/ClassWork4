package by.htp.lesson4;

public class Task6 {
	public static void main(String[] args) {
	int[][] matrix = { 
			{ -9, 1, 0, 2, 5 },
			{ 4, 1, 1, 0, 7 }, 
			{ -2, 2, -1, 9, 8 }, 
			{ 4, 1, 1, 0, 3 },
			{ 4, 1, 1, 0, 6 }, };
	
	int counter = 0;
	
	int x = 4;
	
	for(int i = 0; i < matrix.length; i++) {
		for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == x) {
					counter++;
				}
			}
		}
	System.out.println(counter);
	}
}
