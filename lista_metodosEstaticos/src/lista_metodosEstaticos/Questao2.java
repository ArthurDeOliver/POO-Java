package lista_metodosEstaticos;
import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("digite sua senha ");
		String password = read.nextLine();
		password = password.trim();//desconsidera espaço antes e depois da string
		
		boolean valid = validPassword(password);
		System.out.println(valid);
		
	}
	
	public static boolean validPassword(String pass) {
		
		int LengthPass = pass.length();
		
		if(LengthPass == 8) {
			return true;
		}else {
			return false;
		}
		
		
	}
}
