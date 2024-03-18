package encap_e_abs1;

public class Post {
	private String texto;
	private String link;
	int num_like = 0;
	int num_share = 0;
	
	public Post(String texto, String link) {
		this.texto = texto;
		this.link  = link;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getLink() {
		return this.link;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public int Curtir() {
		return this.num_like += 1;
	}
	
	public int Compartilhar() {
		return this.num_share += 1;
	}
}
