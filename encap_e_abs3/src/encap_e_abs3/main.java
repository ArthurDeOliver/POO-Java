package encap_e_abs3;

public class main {
	public static void main(String[] args) {
		
		Produto chocolate = new Produto("chocolate",7.50,10);
		
		String nome_produto = chocolate.getNome();
		int quantidade_produto = chocolate.getQuantidadeEstoque();
		
		System.out.println(nome_produto);
		System.out.println(quantidade_produto);
		
		chocolate.Comprar(4);
		chocolate.Comprar(5);
		chocolate.Comprar(1);
		
	}
}
