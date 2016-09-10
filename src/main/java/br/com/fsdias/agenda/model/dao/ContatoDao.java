package br.com.fsdias.agenda.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.fsdias.agenda.model.ConnectionFactory;
import br.com.fsdias.agenda.model.Contato;

/**
 * Classe DAO para manipula��o do cliente
 * 
 * @version 1.0
 * @author Felipe Dias
 *
 */
public class ContatoDao implements IContatoDao {
	/**
	 * Atributo para conex�o com o banco, gerado pela Factory
	 */
	private Connection con = new ConnectionFactory().getConnection();

	/**
	 * M�todo respons�vel por <b>inserir</b> um Cliente no Banco de Dados
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
	 * M�todo respons�vel por <b>atualizar</b> um Cliente no Banco de Dados
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
	 * M�todo respons�vel por <b>deletar</b> um Cliente no Banco de Dados
	 * 
	 * @param id int - Id do contato a ser exclu�do
	 * @return void
	 */
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * M�todo respons�vel por <b>buscar</b> um Cliente no Banco de Dados
	 * 
	 * @param Contato - Recebe o id do contato a ser buscado
	 * @return Contato - Retorna o contato buscado ou null se n�o encontrado
	 */
	@Override
	public Contato search(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * M�todo respons�vel por <b>listar</b> todos os clientes cadastrados no Banco de Dados
	 * 
	 * @param Contato - Recebe o id do contato a ser buscado
	 * @return Contato - Retorna o contato buscado ou null se n�o encontrado
	 */
	@Override
	public List<Contato> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
