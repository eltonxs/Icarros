package br.com.icarros.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.icarros.core.Driver;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);

	}

	@FindBy(xpath = "(//li[@data-original-index=\"1\"])[1]")
	WebElement buttonMarca;

	public WebElement getButtonMarca() {
		return buttonMarca;
	}

	public void setButtonMarca(WebElement buttonMarca) {
		this.buttonMarca = buttonMarca;
	}
}
