package com.solvd.CarinaTesting.gui.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.CarinaTesting.gui.components.GeneralComponent;
import com.solvd.CarinaTesting.gui.components.HeaderLinks;

public class HomePage extends AbstractPage{

	@FindBy(xpath = "//div[contains(@id,'bloque-noticia')]//div[contains(@class, 'views-field-title')]//a")
	private List<ExtendedWebElement> titlesList; 
	
	@FindBy(id = "page")
	private GeneralComponent generalComponent;
	
	@FindBy(xpath = "//div[@id=\"block-menu-block-4\"]/div/ul[contains(@class,'menu')]/li[1]/ul//a")
	private List<ExtendedWebElement> electionsPages;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public ElectionsPage getElectionsPage() {
		for(ExtendedWebElement page : electionsPages){
			if(page.getText().equals("Elecciones")) {
				page.click();
				return new ElectionsPage(driver);
			}
		};
		return null;
	}
	
	public ContactPage getContactPage() {
		for(ExtendedWebElement page : electionsPages){
			if(page.getText().equals("Contacto")) {
				page.click();
		        return new ContactPage(driver);
			}
		}
		return null;
	}
	
	public GobermentPage getGobermentPage() {
		for(ExtendedWebElement page : electionsPages){
			if(page.getText().equals("Gobierno")) {
				page.click();
		        return new GobermentPage(driver);
			}
		}
		return null;
	}
	
	public HeaderLinks getHeadersPages() {
		return generalComponent.getHeaderLinks();
	}
	
	public Boolean selectTitle(String title) {
        for (ExtendedWebElement titlesLink : titlesList) {
            String currentNew = titlesLink.getText();
            if (title.equalsIgnoreCase(currentNew)) {
            	titlesLink.click();
            	return true;
            }
        }
        return false;
    }
}
