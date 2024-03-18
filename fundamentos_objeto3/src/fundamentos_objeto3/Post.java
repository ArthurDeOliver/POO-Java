package fundamentos_objeto3;

public class Post {
	
	String texto;
	String link;
	int numCurtidas = 0;
	int numShare = 0;
	
	public Post(String texto,String link) {
		this.texto = texto;
		this.link = link;
	}
	
	void curti() {
		this.numCurtidas += 1;
	}
	
	void compartilhar() {
		this.numShare +=1;
	}
	
}
