package br.com.fsdias.agenda.model.dao;

import java.sql.Connection;
import java.util.List;

import br.com.fsdias.agenda.model.ConnectionFactory;
import br.com.fsdias.agenda.model.Contato;

public class ContatoDao implements IContatoDao {
	private Connection con = new ConnectionFactory().getConnection();

	@Override
	public void insert(Contato c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Contato c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contato search(Contato c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contato> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
