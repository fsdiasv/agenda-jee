package br.com.fsdias.agenda.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fsdias.agenda.model.Contato;
import br.com.fsdias.agenda.model.dao.ContatoDao;

/**
 * Classe responsável por <b>gerenciar as requisições</b> do Contato
 * 
 * @author Felipe Dias
 * 10 de set de 2016
 */

@WebServlet(urlPatterns={"/usuario.do", "/usuarioController"})
public class ContatoServlet extends HttpServlet {

	ContatoDao dao = new ContatoDao();
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Requisição recebida!");
		
		super.service(arg0, arg1);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idStr = req.getParameter("id");
		if (idStr != null && idStr != "") {
			int id = Integer.parseInt(idStr);
			dao.delete(id);
			
			//Auxilia no Forward, encaminhar o processamento do servlet para uma página jsp
			RequestDispatcher dispatcher = req.getRequestDispatcher("/");
			req.setAttribute("type", "delete");
			req.setAttribute("msg", "Contato <b>removido</b> com sucesso!");
			dispatcher.forward(req, resp);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		//Recebe os dados enviados pelo Request
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String endereco = req.getParameter("endereco");
		String dataStr = req.getParameter("data");
		Calendar data = null;
		
		//Converte a data de String para Date
		try {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Date dataFormatada = new Date(format.parse(dataStr).getTime());
			
			data = Calendar.getInstance();
			data.setTime(dataFormatada);
		} catch (ParseException e) {
			out.print("Erro de conversão de data!");
			return;
		} 
		
		//Cria objeto Contato e instancia com os dados recebidos
		Contato c = new Contato(nome, endereco, email, data);
		
		this.dao.insert(c);

		
		//resp.sendRedirect("/");
		//Auxilia no Forward, encaminhar o processamento do servlet para uma página jsp
		RequestDispatcher dispatcher = req.getRequestDispatcher("/");
		req.setAttribute("type", "insert");
		req.setAttribute("msg", "Contato <b>cadastrado</b> com sucesso!");
		dispatcher.forward(req, resp);
		
	}
}
