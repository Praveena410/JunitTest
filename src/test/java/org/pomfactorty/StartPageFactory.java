package org.pomfactorty;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPageFactory extends BaseClass {

	public StartPageFactory() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement username;

	@FindBy(id = "pass")
	private WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

}
