package encap_e_abs2;

public class main {
	public static void main(String[] args) {
		
		Aviao TAM = new Aviao(10.0,900.0);
		double vel = TAM.getVelocidade();
		double alt = TAM.getAltitude();
		
		System.out.println("velocidade: "+vel + " I altitude: "+alt);
		
		TAM.ModificarAltitude(-1.0);
		TAM.ModificarVelocidade(-100.0);
		double velocidade_modificada = TAM.getVelocidade();
		double altitude_modificada = TAM.getAltitude();
		
		System.out.println("velocidade: "+velocidade_modificada + " I altitude: "+altitude_modificada);
		
		TAM.ModificarAltitude(-10.0);
		TAM.ModificarVelocidade(-200.0);
		double vel2 = TAM.getVelocidade();
		double alt2 = TAM.getAltitude();
		
		System.out.print("velocidade: "+vel2 + " I altitude: "+alt2);
	}
}
