package com.solvd.CarinaTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.CarinaTesting.gui.components.GeneralComponent;

public class AutoritiesPage extends AbstractPage{

	@FindBy(id = "page")
	private GeneralComponent generalComponent;

	public AutoritiesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public Boolean getHeaderLogo() {
		return generalComponent.getHeaderLogo().openHomePage();
	}

}
