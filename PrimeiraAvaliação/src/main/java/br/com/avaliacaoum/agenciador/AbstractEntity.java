package br.com.avaliacaoum.agenciador;

import java.time.LocalDateTime;

public abstract class AbstractEntity {
	
	private Long id;
	private LocalDateTime cadastrar;
	private LocalDateTime mostrarPeloId;
	private LocalDateTime excluir;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getCadastrar() {
		return cadastrar;
	}
	public void setCadastrar(LocalDateTime cadastrar) {
		this.cadastrar = cadastrar;
	}
	public LocalDateTime getMostrarPeloId() {
		return mostrarPeloId;
	}
	public void setMostrarPeloId(LocalDateTime mostrarPeloId) {
		this.mostrarPeloId = mostrarPeloId;
	}
	public LocalDateTime getExcluir() {
		return excluir;
	}
	public void setExcluir(LocalDateTime excluir) {
		this.excluir = excluir;
	}

}
