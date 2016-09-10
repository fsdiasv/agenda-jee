package br.com.fsdias.agenda.tests;

import br.com.fsdias.agenda.model.Contato;
import br.com.fsdias.agenda.model.dao.ContatoDao;

public class TestaFind {
	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		
		Contato c = dao.find(3);
		
		System.out.println("ID:\t" + c.getId());
		System.out.println("Nome:\t" + c.getNome());
		System.out.println("End.:\t" + c.getEndereco());
		System.out.println("Email:\t" + c.getEmail());
		System.out.println("Data:\t" + c.getData().toString());
	}
}
