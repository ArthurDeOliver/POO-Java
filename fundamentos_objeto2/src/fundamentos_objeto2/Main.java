package fundamentos_objeto2;

public class Main {
	public static void main(String[] args) {
		
		Lutador Ryu = new Lutador("Ryu",100,10);
		Lutador Bison = new Lutador("Bison",100,12);
		
		Golpear(Ryu, Bison, 3);
		System.out.println(Bison.energia);
		
		Golpear(Bison, Ryu, 6);
		System.out.println(Ryu.energia);
		
		
	}
	
	public static void Golpear(Lutador lutador1, Lutador lutador2, int vezes) {
		
		for(int i = 0; i < vezes; i++) {
			lutador1.aplicarGolpe(lutador2);
		}
		
	}
}
