<!DOCTYPE html>
<%@ page import="java.util.*,
				br.com.fsdias.agenda.model.Contato,
				br.com.fsdias.agenda.model.dao.ContatoDao" %>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Agenda FJ-21</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  	<%-- Comentário em JSP --%>
  	<div class="col-md-3"></div>
  	
  	<div class="col-md-6">
  	
  		<% String cabecalho = "Bem-vindo a Agenda FJ-21";%>
  		<% String subtitulo = "Este é um projeto de estudo baseado na apostila Desenvolvimento Web da Caelum"; %>
  		<% String rodape = "Desenvolvido por: Felipe Dias"; %>
  		
  		<h1 class="text-center" style="margin-top: 100px"><% out.print(cabecalho); %></h1>
  		<h4 class="text-center"><% out.print(subtitulo); %></h4>
  		
		<% 
  			ContatoDao dao = new ContatoDao();
  			List<Contato> contatos = dao.listAll();
  			
  		%>
		<div class="panel panel-default" style="margin-top: 80px;">
		  <!-- Default panel contents -->
		  <div class="panel-heading">Contatos cadastrados</div>
		
		  <!-- Table -->
		  <table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>Nome</th>
					<th>E-mail</th>
					<th>Telefone</th>
					<th>Data de Nascimento</th>
					<th>Ações</th>
				</tr>
			</thead>
			
			<tbody>
				<% for (Contato c : contatos) {  %>
				<tr>
					<td><%out.print(c.getId());%></td>
					<td><%out.print(c.getNome());%></td>
					<td><%out.print(c.getEmail());%></td>
					<td><%out.print(c.getEndereco());%></td>
					<td><%--out.print(c.getData());--%></td>
					<td></td>
				</tr>
				<% } %>
			</tbody>
		  </table>
		</div>
  		
  		
  		
  		
  		<h6 class="text-center" style="margin-top: 50px"> <% out.print(rodape); %></h6>
  	</div>
  	
  	<div class="col-md-3"></div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>