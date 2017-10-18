package by.htp.lesson4;

public class Task2 {
	public static void main(String[] args) {
		
		int[] mas = new int[]{327,381,891,918,212,848,770,363,416,736,930};
		
		int max = mas[0];
		
		for(int x : mas){
			if(x >= max){
				max = x;
			}
		}
		
		System.out.println(max);
		
		float[] res = new float[mas.length];
		
		for(int i = 0; i < mas.length; i++){
			res[i] = (float) mas[i] / max;
			System.out.printf("%.2f ", res[i]);
		}
		
		
	}
}
