package encap_e_abistracao;


public class main {
	public static void main(String[] args) {
		
		ContaBancaria arthur = new ContaBancaria("arthur",100);
		
		arthur.debitar(400);
		arthur.creditar(500);
		
		double saldo = arthur.getSaldo();
		
		System.out.print(saldo);
	}
}

