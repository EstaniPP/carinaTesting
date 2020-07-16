package com.solvd.CarinaTesting.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.CarinaTesting.gui.pages.NewStudentsPage;
import com.solvd.CarinaTesting.gui.pages.NotTeachers;
import com.solvd.CarinaTesting.gui.pages.StudentsPage;
import com.solvd.CarinaTesting.gui.pages.TeachersPage;

public class HeaderLinks extends AbstractUIObject{

	@FindBy(xpath = ".//li[contains(@class,'1634')]//a")
	private ExtendedWebElement newStudentsLink;
	
	@FindBy(xpath = ".//li[contains(@class,'1638')]//a")
	private ExtendedWebElement studentsLink;
	
	@FindBy(xpath = ".//li[contains(@class,'1643')]//a")
	private ExtendedWebElement teachersLink;
	
	@FindBy(xpath = ".//li[contains(@class,'1648')]//a")
	private ExtendedWebElement notTeachersLink;
	
	@FindBy(xpath = ".//li[contains(@class,'1653')]//a")
	private ExtendedWebElement graduatesLink;
	
	@FindBy(xpath = ".//li[contains(@class,'1655')]//a")
	private ExtendedWebElement schoolsLink;
	
	@FindBy(xpath = ".//li[contains(@class,'1657')]//a")
	private ExtendedWebElement enterprisesLink;
	
	public HeaderLinks(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public Boolean checkNewStudentsPage() {
		return newStudentsLink.clickIfPresent();
	}
	
	public Boolean checkStudentsPage() {
		return studentsLink.clickIfPresent();
	}
	
	public Boolean checkTeachersPage() {
		return teachersLink.clickIfPresent();
	}
	
	public Boolean checkNotTeachersPage() {
		return notTeachersLink.clickIfPresent();
	}
	
	public Boolean checkGradutesPage() {
		return graduatesLink.clickIfPresent();
	}
	
	public Boolean checkSchoolsPage() {
		return schoolsLink.clickIfPresent();
	}
	
	public Boolean checkEnterprisesPage() {
		return enterprisesLink.clickIfPresent();
	}
}
