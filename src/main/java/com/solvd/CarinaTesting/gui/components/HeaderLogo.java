package com.solvd.CarinaTesting.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class HeaderLogo extends AbstractUIObject{

	@FindBy(xpath = ".//img")
	private ExtendedWebElement home; 
	
	public HeaderLogo(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public Boolean openHomePage() {
		return home.clickIfPresent();
	}
}
