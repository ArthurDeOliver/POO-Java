package lista_array;

public class TesteArrayInfinito {
	public static void main(String[] args) {
		
		String[] teste = new String[10];
		
		for(int i = 0; i < teste.length; i++) {
			if(teste[i] == null) {
				System.out.println("tipo de dado sendo null");
			}
			
		}
		
	}
}
