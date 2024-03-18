package fundamentos_objetos;
import java.util.*;

public class main1 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("====Dados Médico====");

		Endereco EnderecoMedico1 = new Endereco("rua paulo",12,"nenhum","bairro1","cidade1","uf-7",65);
		
		Medico MedicoA = new Medico(12,"ana","femenino","cardiologista",EnderecoMedico1);

		System.out.println("========MEDICO========");
		System.out.println(MedicoA.codigo);
		System.out.println(MedicoA.nome);
		System.out.println(MedicoA.genero);
		System.out.println(MedicoA.especialidade);
		System.out.println(MedicoA.enderecoMedic.bairro);
		
		System.out.println("========Endereco========");
		System.out.println(EnderecoMedico1.rua);
		System.out.println(EnderecoMedico1.numero);
		System.out.println(EnderecoMedico1.complemento);
		System.out.println(EnderecoMedico1.bairro);
		System.out.println(EnderecoMedico1.cidade);
		System.out.println(EnderecoMedico1.uf);
		System.out.println(EnderecoMedico1.cep);
		
	}
}
