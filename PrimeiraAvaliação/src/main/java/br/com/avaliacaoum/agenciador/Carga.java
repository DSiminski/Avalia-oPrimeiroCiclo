package br.com.avaliacaoum.agenciador;

import java.util.ArrayList;
import java.util.List;

public class Carga{
	 private Double quantidade;
	 private List<Carga> carga = new ArrayList<Carga>();
	 
	public Carga() {
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public List<Carga> getProduto() {
		return carga;
	}

	public void setProduto(List<Carga> carga) {
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "Carga [quantidade=" + quantidade + ", getQuantidade()=" + getQuantidade() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	 
}
