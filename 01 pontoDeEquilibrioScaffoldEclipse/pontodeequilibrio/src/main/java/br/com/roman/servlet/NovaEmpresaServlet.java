package br.com.roman.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.roman.model.Banco;
import br.com.roman.model.Empresa;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("caiu aqui");
		String nomeParam= req.getParameter("name");
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeParam);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		req.setAttribute("empresa", empresa.getNome());
		resp.sendRedirect("/listaEmpresas");
		
		
	}
	
	
	

}
