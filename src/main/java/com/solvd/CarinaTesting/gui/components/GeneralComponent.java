package com.solvd.CarinaTesting.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class GeneralComponent extends AbstractUIObject{

	 @FindBy(xpath = "//div[contains(@class,'header__botonera')]")
	private HeaderButtons headerButtons;
	    
	@FindBy(xpath = "//div[contains(@class,'header__logo')]")
	private HeaderLogo headerLogo;
	    
	@FindBy(xpath = "//div[contains(@class,'header__botonera')]")
	private HeaderSearch headerSearch;
	    
	@FindBy(xpath = "//div[@id=\"views_slideshow_cycle_div_carrousel-block_0\"]")
	private FooterPanel footerPanel;
	
   @FindBy(xpath = "//div[contains(@class,'header__region')]")
   private HeaderLinks headerLinks; 
   
	public GeneralComponent(WebDriver driver, SearchContext searchContext){
		super(driver, searchContext);
		// TODO Auto-generated constructor stub
	}

	public HeaderSearch getHeaderSearch() {
		return headerSearch;
	}
	
	public HeaderLogo getHeaderLogo() {
		return headerLogo;
	}
	
	public HeaderButtons getHeaderButtons() {
		return headerButtons;
	}
	
	public HeaderLinks getHeaderLinks() {
		return headerLinks;
	}
	
	public FooterPanel getFooterPanel() {
		return footerPanel;
	}
}
