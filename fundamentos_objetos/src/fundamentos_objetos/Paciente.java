package fundamentos_objetos;

public class Paciente {
	//atributos
/*caracteristicas que compõe o objeto paciente*/
	int codigo;
	String nome;
	String dataNascimento;
	String sexo;
	String planoSaude;
	String alergia; 
	String tipoSanguineo;
	
	//contrutor
/*essencial para a criacao de novos objetos, instanciando-os na main*/
	public Paciente(int codigo, String nome, String dataNascimento, String sexo, String planoSaude, String alergia, String tipoSanguineo) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.planoSaude = planoSaude;
		this.alergia = alergia;
		this.tipoSanguineo = tipoSanguineo; 
	}
	
}


