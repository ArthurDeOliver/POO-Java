package lista_array;

public class Questao1 {
	public static void main(String[] args) {
	
		int[] array = new int[30];
		System.out.println(array.length);

		
		for(int i = 1; i < array.length; i++) {
			array[i] = i;
		}
		
		for(int j = 0; j < array.length; j++) {
			
			if(array[j]%2 != 0) {
				System.out.println(array[j]);
			}
			
			//only pair 
//			if(array[j]%2 == 0) {
//				System.out.println(array[j]);
//			}
			
		}
		
	}
}
