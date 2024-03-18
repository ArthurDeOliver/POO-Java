package lista_metodosEstaticos;
import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int validad = 6;
		
		System.out.println("digite sua senha para a verificação: ");
		String senha = read.nextLine();
		senha = senha.trim(); //retira os espaçoes antes e depois 
		
		boolean resultado = verificacao(senha, validad);
		
		if(resultado) {
			System.out.print("senha válida!");
		}else {
			System.out.print("senha INVÁLIDA");
		}
		
	}
	
	public static boolean verificacao(String senhaUser, int limite) {
		
		boolean result = false;
		
		if(senhaUser.length() < limite) {
			result = false;
		}else if(senhaUser.length() >= limite){
			result = true;
		}
		
		return result;
	}
}
