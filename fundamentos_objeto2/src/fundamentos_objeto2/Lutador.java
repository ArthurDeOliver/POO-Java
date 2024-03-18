package fundamentos_objeto2;

public class Lutador {
	String nome;
	int energia;
	int forca;
	
	public Lutador(String nome, int energia, int forca) {
		this.nome = nome;
		this.energia = energia;
		this.forca = forca;
	}
	
	void aplicarGolpe(Lutador lutador) {
		
		lutador.energia -= this.forca;
		
	}
	
}
