package lista_metodosEstaticos;
import java.util.*;

public class Questao7 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de kilos que tem no seu prato: ");
		double quantidade = read.nextDouble();
		
		double ValorPagamento = Valor(quantidade);
		
		System.out.print("O valor que você terá que pagar é:  "+ValorPagamento);
		
	}
	
	public static double Valor(double kilos) {
		return kilos * 12;
	}
}
