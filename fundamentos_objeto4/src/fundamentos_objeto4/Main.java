package fundamentos_objeto4;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Aluno arthur = new Aluno("Arthur","70775345458");
		
		for(int i = 0; i < arthur.notas.length; i++) {
			
			System.out.print("Coloque a nota " +(i+1)+": ");
			arthur.notas[i] = read.nextDouble();
			
		}
		
		String resultado = arthur.CalcularMedia();
		
		System.out.print(resultado);
		
	}
}
