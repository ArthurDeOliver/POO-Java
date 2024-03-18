package encap_e_abs2;

public class Aviao {
	private double altitude;
	private double velocidade;
	
	public Aviao(double altitude, double velocidade) {
		this.altitude = altitude;
		this.velocidade = velocidade;
	}
	
	public double getAltitude() {
		return this.altitude;
	}

	public double getVelocidade() {
		return this.velocidade;
	}
	
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void ModificarAltitude(double valor_altitude){
		this.altitude += valor_altitude;
	}
	
	public void ModificarVelocidade(double valor_velocidade){
		this.velocidade += valor_velocidade;
	}
}
