package com.solvd.CarinaTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.CarinaTesting.gui.components.GeneralComponent;
import com.solvd.CarinaTesting.gui.components.HeaderLinks;

public class NotTeachers extends AbstractPage{

	@FindBy(id = "page")
	private GeneralComponent generalComponent;

    @FindBy(xpath = "//div[contains(@class,'header__region')]")
    private HeaderLinks headerLinks; 
    
	public NotTeachers(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
