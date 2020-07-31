package br.com.roman.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	public static List<Empresa> empresas = new ArrayList<Empresa>();
	
	static {
		
		Empresa empresa1= new Empresa();
		empresa1.setNome("jean");
		
		Empresa empresa2= new Empresa() ;
			empresa2.setNome("juninho");
		
		
	}
	public void adiciona(Empresa empresa) {
		empresas.add(empresa);			
	}

	public List<Empresa> getEmpresas(){
		return Banco.empresas;	
	}
	

}
