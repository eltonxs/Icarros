package br.com.icarros.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import static br.com.icarros.core.Driver.getDriver;

public class PesquisarSteps {
	private String url = "https://www.icarros.com.br/principal/index.jsp";

	@Dado("Abro a pagina")
	public void abro_a_pagina() {
    getDriver().get(url);
	}

	@Quando("preencho os dados")
	public void preencho_os_dados() {

	}

	@Entao("pesquiso o carro desejado")
	public void pesquiso_o_carro_desejado() {

	}

}
