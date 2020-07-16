package com.solvd.CarinaTesting.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.CarinaTesting.gui.components.GeneralComponent;

public class GobermentPage  extends AbstractPage{

	@FindBy(xpath = "//div[contains(@class,'pane-node-body')]//a")
	private List<ExtendedWebElement> links;
	
	@FindBy(id = "page")
	private GeneralComponent generalComponent;

	public GobermentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public AutoritiesPage getAutorities() {
		for(ExtendedWebElement page : links) {
			if(page.getText().equals("Autoridades")) {
				page.click();
				return new AutoritiesPage(driver);
			}
		}
		return null;
	}
}
