package lista_metodosEstaticos;
import java.util.Scanner;
public class Questao1 {
	public static void main(String[] args) {
	
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite um numero e ele sera multiplicado por 10: ");
		int number = read.nextInt();
		
		int result = mult10(number);
		
		System.out.println("Resultado é: " + result);
		
	}
	
	public static int mult10(int UserNumber) {
		return UserNumber * 10;
	}
}
