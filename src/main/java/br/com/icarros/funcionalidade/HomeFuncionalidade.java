package br.com.icarros.funcionalidade;

import br.com.icarros.pages.HomePage;

public class HomeFuncionalidade {
	private HomePage home;
	
	public HomeFuncionalidade() {
    home = new HomePage();
    
	}

	public void cliqueselectHyundai() {
		home.getSelectHyundai().click();
	
	}
	
}
