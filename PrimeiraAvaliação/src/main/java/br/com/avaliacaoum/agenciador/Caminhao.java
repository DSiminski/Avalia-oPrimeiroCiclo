package br.com.avaliacaoum.agenciador;

public class Caminhao {
	private String placa;
	private String marca; 
	private String modelo;
	private String ano;
	private Double tara;
	private String cor;
	private String obs;
	private String quilometragem;
	
	public Caminhao() {
		
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Double getTara() {
		return tara;
	}

	public void setTara(Double tara) {
		this.tara = tara;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(String quilometragem) {
		this.quilometragem = quilometragem;
	}

	@Override
	public String toString() {
		return "Caminhao [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", tara="
				+ tara + ", cor=" + cor + ", obs=" + obs + ", quilometragem=" + quilometragem + "]";
	} 

}
