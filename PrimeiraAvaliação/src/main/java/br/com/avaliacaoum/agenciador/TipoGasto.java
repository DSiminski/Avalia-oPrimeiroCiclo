package br.com.avaliacaoum.agenciador;

public enum TipoGasto {
	
	 combustivel("Combustivel"),
	alimentacao("Alimenta��o"),
	banheiro("Banheiro"),
	gastos("Gastos mecanicos");
	
	public String valorGasto;
	TipoGasto(String valor){
		valorGasto = valor;
	}

}
