package br.com.fsdias.agenda.tests;

import java.sql.Connection;

import br.com.fsdias.agenda.model.ConnectionFactory;

public class TestaConexao {
	public static void main(String[] args) {
		try {
			Connection con = new ConnectionFactory().getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Ok");
	}
}
