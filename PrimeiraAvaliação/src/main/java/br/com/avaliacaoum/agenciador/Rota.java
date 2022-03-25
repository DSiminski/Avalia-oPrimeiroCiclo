package br.com.avaliacaoum.agenciador;

public class Rota {
	private String EndOrigem;
	private String EndDestindo;
	private Long km;
	
	public Rota() {
	}

	public String getEndOrigem() {
		return EndOrigem;
	}

	public void setEndOrigem(String endOrigem) {
		EndOrigem = endOrigem;
	}

	public String getEndDestindo() {
		return EndDestindo;
	}

	public void setEndDestindo(String endDestindo) {
		EndDestindo = endDestindo;
	}

	public Long getKm() {
		return km;
	}

	public void setKm(Long km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "Rota [EndOrigem=" + EndOrigem + ", EndDestindo=" + EndDestindo + ", km=" + km + "]";
	}

}
