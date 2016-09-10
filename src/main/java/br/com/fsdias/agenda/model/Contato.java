package br.com.fsdias.agenda.model;

import java.util.Calendar;

/**
 * Modelo do Contato
 * 
 * @author Felipe Dias
 * 10 de set de 2016
 *
 */

public class Contato {
	private String nome;
	private String endereco;
	private String email;
	private Calendar data;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
}
