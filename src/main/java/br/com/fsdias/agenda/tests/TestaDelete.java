package br.com.fsdias.agenda.tests;

import br.com.fsdias.agenda.model.dao.ContatoDao;

public class TestaDelete {
	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		dao.delete(2);
	}
}
