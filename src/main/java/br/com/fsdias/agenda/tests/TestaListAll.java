package br.com.fsdias.agenda.tests;

import java.util.ArrayList;
import java.util.List;

import br.com.fsdias.agenda.model.Contato;
import br.com.fsdias.agenda.model.dao.ContatoDao;

public class TestaListAll {
	public static void main(String[] args) {

		ContatoDao dao = new ContatoDao();

		List<Contato> contatos = dao.listAll();
		
		for (Contato c : contatos) {
			System.out.print("ID:\t" + c.getId());
			System.out.println("\tNome:\t" + c.getNome());
			System.out.print("End.:\t" + c.getEndereco());
			System.out.println("\tEmail:\t" + c.getEmail());
			
			System.out.println();
		}
	}
}
