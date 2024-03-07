package com.brandao.os.domain;

import java.util.Objects;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // se precisar incluir um nome na tabela, utilizar o comando @Entity(name =
		// "TB_PESSOAS")
public abstract class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pessoa_id;
	private String nome;

	@CPF
	private String cpf;
	private String telefone;

	public Pessoa() {
		super();
	}

	public Pessoa(Integer pessoa_id, String nome, String cpf, String telefone) {
		super();
		this.pessoa_id = pessoa_id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public Integer getPessoa_id() {
		return pessoa_id;
	}

	public void setPessoa_id(Integer pessoa_id) {
		this.pessoa_id = pessoa_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pessoa_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(pessoa_id, other.pessoa_id);
	}

}
