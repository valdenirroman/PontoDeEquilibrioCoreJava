package br.com.roman.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.roman.model.Empresa;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Banco banco = new Banco();
		List<Empresa> empresas= banco.getEmpresas();
		
		req.setAttribute("empresas",empresas);
		//chama jsp
		RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas.jsp");	
			rd.forward(req, resp);
	}

	
	
	

}
