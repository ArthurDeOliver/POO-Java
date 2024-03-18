package fundamentos_objetos;

public class Medico {
	int codigo;
	String nome;
	String genero;
	String especialidade;
	Endereco enderecoMedic; //classe são tipos de dados assim como int String...
//então podemos chamar ou referenciar classes com o nome da qual é instanciado 
	
	public Medico(int codigo, String nome,String genero,String especialidade,Endereco enderecoMedic) {
		this.codigo = codigo;
		this.nome = nome;
		this.genero = genero;
		this.especialidade = especialidade;
		this.enderecoMedic = enderecoMedic;
	}
}
