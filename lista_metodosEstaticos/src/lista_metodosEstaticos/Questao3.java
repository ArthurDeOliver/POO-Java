package lista_metodosEstaticos;
import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Qual o numero voce deseja elevar a quarta potencia?");
		int numeroDigitado = read.nextInt();
		
		int resultadoPotencia = Potencia4(numeroDigitado);
		
		System.out.println("O seu resutlado: "+ resultadoPotencia);
		
	}
	
	public static int Potencia4(int numero) {
		
		int resultado = 1;
		
		for(int i = 0; i < 4; i++) {
			resultado = resultado * numero;
		}
		
		return resultado;
	}
}
