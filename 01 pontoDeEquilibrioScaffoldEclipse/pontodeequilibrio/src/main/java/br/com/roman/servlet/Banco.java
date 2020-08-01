package br.com.roman.servlet;

import java.util.ArrayList;
import java.util.List;

import br.com.roman.model.Empresa;

public class Banco {

	private static List<Empresa> empresas = new ArrayList();
	private static Integer chaveSequencial=1;
	
	static {
		
		Empresa empresa1= new Empresa();
		empresa1.setId(chaveSequencial++);
		empresa1.setNome("jean");
		
		Empresa empresa2= new Empresa();
		empresa2.setId(chaveSequencial++);
			empresa2.setNome("juninho");
			
			empresas.add(empresa1);
			empresas.add(empresa2);
		
		
	}
	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		empresas.add(empresa);
	
	}

	public List<Empresa> getEmpresas(){
		return Banco.empresas;	
	}
	

}
