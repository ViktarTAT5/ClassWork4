package by.htp.lesson4;

public class Task1 {
	public static void main(String[] args) {
		int[] mas = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int min = 0;
		int max = 0;

		for (int i = 0; i < mas.length; i++) {
			min = mas[0];
			if (mas[i] < min) {
				min = i;
			}
		}

		for (int i = 0; i < mas.length; i++) {
			max = mas[0];
			if (mas[i] > max) {
				max = i;
			}
		}

		int temp = mas[min];
		mas[min] = mas[max];
		mas[max] = temp;

		Print.print(mas);
		
	}
}
