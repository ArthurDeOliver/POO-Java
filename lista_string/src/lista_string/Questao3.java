package lista_string;
import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o ano que você ingressou: ");
		String ano = read.next();
	
		int anonovo = Integer.parseInt(ano);
		
		int anoconclusao = anonovo + 2;
		
		System.out.print(anoconclusao);
		
	}
}
