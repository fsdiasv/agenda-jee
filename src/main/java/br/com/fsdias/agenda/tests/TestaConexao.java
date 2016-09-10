package br.com.fsdias.agenda.tests;

import java.sql.Connection;

import br.com.fsdias.agenda.model.ConnectionFactory;

public class TestaConexao {
	public static void main(String[] args) {
		Connection con = new ConnectionFactory().getConnection();
		
		System.out.println("Ok");
	}
}
