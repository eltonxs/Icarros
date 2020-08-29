package br.com.icarros.funcionalidade;

import br.com.icarros.pages.HomePage;

public class PesquisarFuncionalidade {
	private HomePage home;
	public PesquisarFuncionalidade() {
    home = new HomePage();
    
	}
    public void clicarbotaoMarca() {
    	home.getButtonMarca().click();
    }
	
	
}
