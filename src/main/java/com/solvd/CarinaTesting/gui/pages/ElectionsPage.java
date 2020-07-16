package com.solvd.CarinaTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.CarinaTesting.gui.components.GeneralComponent;
import com.solvd.CarinaTesting.gui.components.HeaderLinks;

public class ElectionsPage  extends AbstractPage{

	@FindBy(id = "page")
	private GeneralComponent generalComponent;
	
    @FindBy(xpath = "//div[contains(@class,'header__region')]")
    private HeaderLinks headerLinks; 

	
	@FindBy(xpath = "//div[contains(@id,'content')]//div//div//div[2]//div//div[2]//div//div//p[6]//a")
    private ExtendedWebElement reglaments; 

	public ElectionsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void getReglaments() {
		reglaments.click();
	}

}
