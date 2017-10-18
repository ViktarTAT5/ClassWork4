package by.htp.lesson4;

public class Task3 {
	public static void main(String[] args) {
		float[] mas = new float[]{-1,2,3,-4,5,2,7,-8,2,5};
		int count = 0;
		
		
		for(int i = 1; i < mas.length; i+=2) {
			if(mas[i] > 0){
				count++;
			}
		}
		
		float[] result =new float[count];
		
		count = 0;
		
		for(int i = 1; i < mas.length; i+=2) {
			if(mas[i] > 0){
				result[count] = mas[i];
				count++;
			}
		}
		
		float res = 0;
		for(float i : result) {
			res += i*i;
		}
		System.out.println(res);
	}
}
