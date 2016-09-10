package br.com.fsdias.agenda.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.fsdias.agenda.model.ConnectionFactory;
import br.com.fsdias.agenda.model.Contato;

/**
 * Classe DAO para manipulação do cliente
 * 
 * @version 1.0
 * @author Felipe Dias
 *
 */
public class ContatoDao implements IContatoDao {
	/**
	 * Atributo para conexão com o banco, gerado pela Factory
	 */
	private Connection con = new ConnectionFactory().getConnection();

	/**
	 * Método responsável por <b>inserir</b> um Cliente no Banco de Dados
	 * 
	 * @param Contato - Recebe um contato
	 * @return void
	 */
	@Override
	public void insert(Contato c) {

		String sql = "INSERT INTO contatos(nome, endereco, email, data) VALUES (?, ?, ?, ?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getEndereco());
			stmt.setString(3, c.getEmail());
			stmt.setDate(4, new Date(c.getData().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método responsável por <b>atualizar</b> um Cliente no Banco de Dados
	 * 
	 * @param Contato - Recebe um contato
	 * @return void
	 */
	@Override
	public void update(Contato c) {

		String sql = "UPDATE contatos SET nome=?, endereco=?, email=? WHERE id=?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getEndereco());
			stmt.setString(3, c.getEmail());
			stmt.setInt(4, c.getId());
			
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * Método responsável por <b>deletar</b> um Cliente no Banco de Dados
	 * 
	 * @param id int - Id do contato a ser excluído
	 * @return void
	 */
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Método responsável por <b>buscar</b> um Cliente no Banco de Dados
	 * 
	 * @param Contato - Recebe o id do contato a ser buscado
	 * @return Contato - Retorna o contato buscado ou null se não encontrado
	 */
	@Override
	public Contato search(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Método responsável por <b>listar</b> todos os clientes cadastrados no Banco de Dados
	 * 
	 * @param Contato - Recebe o id do contato a ser buscado
	 * @return Contato - Retorna o contato buscado ou null se não encontrado
	 */
	@Override
	public List<Contato> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
