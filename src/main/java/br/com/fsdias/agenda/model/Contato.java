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
	private int id;
	private String nome;
	private String endereco;
	private String email;
	private Calendar data;

	/**
	 * Construtor padrão da classe Contato
	 */
	public Contato() {
		this.id = 0;
		this.nome = null;
		this.endereco = null;
		this.email = null;
		this.data = null;
	}
	
	/**
	 * Construtor da classe Contato recebendo os parâmetros principais
	 * 
	 * @param nome
	 * @param endereco
	 * @param email
	 * @param data
	 */
	public Contato(String nome, String endereco, String email, Calendar data) {
		this.id = 0;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.data = data;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
