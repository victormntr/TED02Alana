package modelo;

public class Lampada {
	
	private String marca;
	private int potencia, preço;
	private boolean estaligada;
	
	public Lampada() {
		this.marca = marca;
		this.potencia = potencia;
		this.preço = preço;
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

	public int getPreço() {
		return preço;
	}

	public void setPreço(int preço) {
		this.preço = preço;
	}

	public boolean isEstaligada() {
		return estaligada;
	}

	public void setEstado(boolean estaligada) {
		this.estaligada = estaligada;
	}
	
}
