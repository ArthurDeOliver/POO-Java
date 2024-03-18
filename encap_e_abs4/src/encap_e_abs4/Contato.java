package encap_e_abs4;

public class Contato {
	
	private String Nome;
	private String[] MensagensTXT = new String[100];
	private int mensagem = -1;
	private int qnt_mensage = 0;
	
	public Contato(String nome) {
		this.Nome = nome;
	}
	
	void setNome(String nome) {
		this.Nome = nome;
	}
	
	String getNome() {
		return this.Nome;
	}
	
	int getMensagens() {
		return this.qnt_mensage;
	}
	
	void EnviarMensagem(String txt) {
		this.qnt_mensage += 1;
		this.mensagem += 1;
		this.MensagensTXT[mensagem] = txt;
	}
	
	void LerMensagem(int qualMensage) {
		
		System.out.println(this.MensagensTXT[qualMensage]);
		
		this.MensagensTXT[qualMensage] = null;
		AjeitarMensagens();
		
		this.qnt_mensage -= 1;

	}
	
	void MostrarMensagens() {
		
		System.out.println("===SUAS MENSAGENS NÃO LIDAS===");
		
		for(int i = 0; i < MensagensTXT.length; i++) {

			if(MensagensTXT[i] == null){
				break;
			}
			System.out.println(MensagensTXT[i]);
		}
		System.out.println("==============================");
	}
	
	public void AjeitarMensagens() {
		
		for(int i = 0; i < this.MensagensTXT.length; i++) {
			
			if(this.MensagensTXT[i] != null) {
				
				continue;
				
			}else {
				
				if(this.MensagensTXT[i] == null && this.MensagensTXT[i+1] == null) {
					break;
				}
				
				this.MensagensTXT[i] = this.MensagensTXT[i+1];
				this.MensagensTXT[i+1] = null;
				
			}
		}		
	}

}
