package br.com.fsdias.agenda.tests;

import java.util.Calendar;

import br.com.fsdias.agenda.model.Contato;
import br.com.fsdias.agenda.model.dao.ContatoDao;

public class TestaInsere {
	public static void main(String[] args) {
		Contato c = new Contato();
		c.setNome("Letícia Diniz");
		c.setEndereco("Rua Sete de Setembro, 61");
		c.setEmail("leticiadstu@gmail.com");
		c.setData(Calendar.getInstance());
		
		ContatoDao contatoDao = new ContatoDao();
		contatoDao.insert(c);
	}
}
