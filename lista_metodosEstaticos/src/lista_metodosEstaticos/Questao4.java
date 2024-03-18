package lista_metodosEstaticos;
import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Escreva 3 numeros para verificar se a soma dos 2 primeiros da igual ou maior que o terceiro: ");
		int numero1 = read.nextInt();
		int numero2 = read.nextInt();
		int numero3 = read.nextInt();
		
		boolean resultadofinal = Teste(numero1,numero2,numero3);
		
		System.out.println("O seu resultado é: "+resultadofinal);
	}
	
	public static boolean Teste(int n1, int n2, int n3) { //para funções boolean sempre colocar o return no final e não durante o if
		
		boolean result = false;
		
		if(n1 + n2 < n3) {
			result = false;
		}else if((n1 + n2 == n3) || (n1 + n2 > n3)) {
			result = true;
			
		}
		return result;
	}
}
