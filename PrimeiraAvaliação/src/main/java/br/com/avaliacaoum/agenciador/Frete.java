package br.com.avaliacaoum.agenciador;

public class Frete {
	private Double KmInicial;
	private Double KmFinal;
	private String produto;
	private Double PesoInicial;
	private Double PesoFinal;
	private Double PesoTotal; 
	private String dataFinal;
	private Double prt; //(preço recebido por tonelada)
	private Double tbr; //(total bruto recebido)
	private Double Obs;
	
	public Frete() {
	
	}

	public Double getKmInicial() {
		return KmInicial;
	}

	public void setKmInicial(Double kmInicial) {
		KmInicial = kmInicial;
	}

	public Double getKmFinal() {
		return KmFinal;
	}

	public void setKmFinal(Double kmFinal) {
		KmFinal = kmFinal;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Double getPesoInicial() {
		return PesoInicial;
	}

	public void setPesoInicial(Double pesoInicial) {
		PesoInicial = pesoInicial;
	}

	public Double getPesoFinal() {
		return PesoFinal;
	}

	public void setPesoFinal(Double pesoFinal) {
		PesoFinal = pesoFinal;
	}

	public Double getPesoTotal() {
		return PesoTotal;
	}

	public void setPesoTotal(Double pesoTotal) {
		PesoTotal = pesoTotal;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Double getPRT() {
		return prt;
	}

	public void setPRT(Double pRT) {
		prt = pRT;
	}

	public Double getTBR() {
		return tbr;
	}

	public void setTBR(Double tBR) {
		tbr = tBR;
	}

	public Double getObs() {
		return Obs;
	}

	public void setObs(Double obs) {
		Obs = obs;
	}

	@Override
	public String toString() {
		return "Frete [KmInicial=" + KmInicial + ", KmFinal=" + KmFinal + ", produto=" + produto + ", PesoInicial="
				+ PesoInicial + ", PesoFinal=" + PesoFinal + ", PesoTotal=" + PesoTotal + ", dataFinal=" + dataFinal
				+ ", prt=" + prt + ", tbr=" + tbr + ", Obs=" + Obs + "]";
	}
	
}
