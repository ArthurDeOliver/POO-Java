package fundamentos_objetos;

public class Endereco {
	String rua;
	String complemento;
	String cidade;
	String bairro;
	String uf;
	int numero;
	int cep;
	
	public Endereco(String rua,int numero,String complemento,String bairro,String cidade,String uf,int cep) {
		
		this.rua = rua;
		this.complemento = complemento;
		this.cidade = cidade;
		this.bairro = bairro;
		this.uf = uf;
		this.numero = numero;
		this.cep = cep;
		
	}
}
