package br.com.icarros.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.icarros.core.BasePage;
import br.com.icarros.core.Driver;

public class HomePage extends BasePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);

	}

	@FindBy(xpath = "//a[@title=\"iCarros\"]")
	WebElement logoIcarros;
	
	public WebElement getSelectHyundai() {
		return selectHyundai;
	}

	@FindBy(xpath = "(//button[@type=\"button\"])[1]")
	WebElement selectHyundai;
	
	public WebElement getLogoIcarros() {
		return logoIcarros;
	}


	}

