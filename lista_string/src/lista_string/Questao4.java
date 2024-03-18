package lista_string;
import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite seu nome e sobrenome: ");
		String nome = read.nextLine(); //next() não conta o espaço
		
		int index = nome.indexOf(" ");
		String sobrenome = nome.substring(index+1, nome.length());
		
		System.out.println(sobrenome);
		
		

	}
}
