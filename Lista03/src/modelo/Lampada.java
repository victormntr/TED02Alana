package modelo;

public class Lampada {
	
	private String marca;
	private int potencia, pre�o;
	private boolean estaligada;
	
	public Lampada() {
		this.marca = marca;
		this.potencia = potencia;
		this.pre�o = pre�o;
		this.estaligada = estaligada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getPre�o() {
		return pre�o;
	}

	public void setPre�o(int pre�o) {
		this.pre�o = pre�o;
	}

	public boolean isEstaligada() {
		return estaligada;
	}

	public void setEstado(boolean estaligada) {
		this.estaligada = estaligada;
	}
	
}
