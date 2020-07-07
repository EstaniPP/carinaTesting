package com.solvd.CarinaTesting.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.CarinaTesting.gui.components.FooterMenu;
import com.solvd.CarinaTesting.gui.components.FooterPanel;
import com.solvd.CarinaTesting.gui.components.HeaderButtons;
import com.solvd.CarinaTesting.gui.components.HeaderLinks;
import com.solvd.CarinaTesting.gui.components.HeaderLogo;
import com.solvd.CarinaTesting.gui.components.HeaderSearch;

public class GobermentPage  extends AbstractPage{

	 @FindBy(xpath = "//div[contains(@class,'header__botonera')]")
	private HeaderButtons headerButtons;
	    
	@FindBy(xpath = "//div[contains(@class,'header__logo')]")
	private HeaderLogo headerLogo;
	    
	@FindBy(xpath = "//div[contains(@class,'header__botonera')]")
	private HeaderSearch headerSearch;
	    
	@FindBy(xpath = "//div[@id=\"views_slideshow_cycle_div_carrousel-block_0\"]")
	private FooterPanel footerPanel;

	@FindBy(xpath = "//div[contains(@class,'pane-node-body')]//a")
	private List<ExtendedWebElement> links;
	
    @FindBy(xpath = "//div[contains(@class,'header__region')]")
    private HeaderLinks headerLinks; 

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
