package br.com.roman.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.roman.model.Empresa;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("caiu aqui");
		String nomeParam= req.getParameter("nome");
	//	String dataParam=req.getParameter("data");
		
//		Date data=null;
//		try {
//			SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
//			data= sdf.parse(dataParam);
	//	} catch (ParseException e) {
		//	throw new ServletException(e); 
	//	}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeParam);
//		empresa.setData(data);
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		req.setAttribute("empresa", empresa.getNome());
		System.out.println("ADCIONOU");
		resp.sendRedirect("listaEmpresas");
		
		
	}
	
	
	

}
