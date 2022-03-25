package br.com.avaliacaoum.agenciador;

public enum StatusRastreio  {
	
	carga ("Carga"),
	em_transposrte("Em transporte"),
	interrompido("interrompido"),
	descarga("descarga"),
	faturado("faturado"),
	cancelado("cancelado");

	private String valor;
	
	private StatusRastreio(String valor) {
		this.valor = valor;
	}
}
