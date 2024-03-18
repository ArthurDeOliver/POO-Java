package encap_e_abs1;

public class main {
	public static void main(String[] args) {
		
		Post arthur = new Post("texto","link.com.br");
		System.out.println("texto antigo: " + arthur.getTexto());
		System.out.println("link antigo: " + arthur.getLink());
		
		arthur.Curtir();
		arthur.Compartilhar();
		arthur.Curtir();
		arthur.Compartilhar();
		arthur.Curtir();
		arthur.Compartilhar();
		arthur.Compartilhar();
		arthur.Compartilhar();
		
		arthur.setTexto("texto nulo e novo");
		String texto = arthur.getTexto();
		
		arthur.setLink("esseLink.com.br");
		String link = arthur.getLink();
		
		System.out.println("texto: " + texto);
		System.out.println("link: " + link);
		System.out.println("numero curtidas: " + arthur.num_like);
		System.out.println("numero compartilhamento: " + arthur.num_share);
	}
}
