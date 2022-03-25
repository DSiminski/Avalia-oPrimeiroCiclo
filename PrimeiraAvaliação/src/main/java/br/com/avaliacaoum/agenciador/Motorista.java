package br.com.avaliacaoum.agenciador;

import java.sql.Date;

public class Motorista extends AbstractEntity {
	
	private String nome;
	private Date dataNascimento;
	private String cpf;
	private String endereco;
	private String contato;
	private String obs;
	
	public Motorista() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	@Override
	public String toString() {
		return "Motorista [nome=" + nome + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf + ", endereco="
				+ endereco + ", contato=" + contato + ", obs=" + obs + "]";
	}
	
}
