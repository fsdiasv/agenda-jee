package br.com.fsdias.agenda.tests;

import java.util.Calendar;

import br.com.fsdias.agenda.model.Contato;
import br.com.fsdias.agenda.model.dao.ContatoDao;

public class TestaUpdate {
	public static void main(String[] args) {
		Contato c = new Contato();
		
		c.setId(1);
		c.setNome("Felipe Dias");
		c.setEmail("fsdias@computacao.ufla.br");
		c.setEndereco("R. das Palmeiras, 521");
		c.setData(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.update(c);
	}
}
