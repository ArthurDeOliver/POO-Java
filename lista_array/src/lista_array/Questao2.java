package lista_array;
import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] array = new int[20];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
			System.out.println(array[i]);
		}
	}
}
