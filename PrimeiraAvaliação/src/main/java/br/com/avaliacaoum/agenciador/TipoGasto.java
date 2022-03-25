package br.com.avaliacaoum.agenciador;

public enum TipoGasto {
	
	 combustivel("Combustivel"),
	alimentacao("Alimentação"),
	banheiro("Banheiro"),
	gastos("Gastos mecanicos");
	
	public String valorGasto;
	TipoGasto(String valor){
		valorGasto = valor;
	}

}
