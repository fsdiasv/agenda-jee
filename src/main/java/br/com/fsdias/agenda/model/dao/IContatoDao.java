package br.com.fsdias.agenda.model.dao;

import java.util.List;

import br.com.fsdias.agenda.model.Contato;

public interface IContatoDao {
	public void insert(Contato c);
	public void update(Contato c);
	public void delete(int id);
	public Contato search(int id);
	public List<Contato> listAll();
}
