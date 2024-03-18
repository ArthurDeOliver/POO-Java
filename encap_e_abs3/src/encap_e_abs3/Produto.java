package encap_e_abs3;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade_estoque;
	
	public Produto(String nome, double preco, int quantidade_estoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade_estoque = quantidade_estoque;
	}

	//set
	void setNome(String nome) {
		this.nome = nome;
	}

	void setPreco(double preco) {
		this.preco = preco;
	}
	
	void setEstoque(int quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}

	//get
	int getQuantidadeEstoque() {
		return this.quantidade_estoque;
	}
	
	double getPreco() {
		return this.preco;
	}
	
	String getNome() {
		return this.nome;
	}
	
	void Comprar(double quantidade) {
		
		String resultado = "";
		double valor_total;
		double qnt_estoque;
		
		qnt_estoque = this.quantidade_estoque - quantidade;
		
		if(qnt_estoque < 0) {
			
			valor_total = this.quantidade_estoque * this.preco;
			resultado = "Sua quantidade ultrapassa o limite do estoque possui apenas: "+this.quantidade_estoque+" Você comprou: "+quantidade+" no valor de: R$"+valor_total;
			this.quantidade_estoque = 0;
			System.out.println(resultado);
			
		}else if(qnt_estoque > 0){
			
			this.quantidade_estoque -= quantidade;
			valor_total = quantidade * this.preco;
			resultado = "Compra efetuada! o valor total foi: R$"+valor_total+" comprando "+quantidade+" unidades! no estoque: " + qnt_estoque;
			System.out.println(resultado);
			
		}else if(qnt_estoque == 0) {
			
			this.quantidade_estoque -= quantidade;
			valor_total = quantidade * this.preco;
			resultado = "Compra efetuada! o valor total foi: R$"+valor_total+" comprando "+quantidade+" O ESTOQUE ESTÁ VAZIO AGORA! PRODUTO ACABADO ";
			System.out.println(resultado);
			
		}
	}
}
