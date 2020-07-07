package com.solvd.CarinaTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.CarinaTesting.gui.components.HeaderLinks;
import com.solvd.CarinaTesting.gui.components.HeaderLogo;
import com.solvd.CarinaTesting.gui.pages.AutoritiesPage;
import com.solvd.CarinaTesting.gui.pages.ContactPage;
import com.solvd.CarinaTesting.gui.pages.ElectionsPage;
import com.solvd.CarinaTesting.gui.pages.GobermentPage;
import com.solvd.CarinaTesting.gui.pages.HomePage;

public class WebTest extends AbstractTest{
	
	@Test(description = "Test open HomePage headers")
    @MethodOwner(owner = "Estani")
    public void testHeaderPages() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        //Open pages
        HeaderLinks hl = homePage.getHeadersPages();
        hl.openEnterprisesPage();
        hl.openGradutesPage();
        hl.openNewStudentsPage();
        hl.openNotTeachersPage();
        hl.openSchoolsPage();
        hl.openStudentsPage();
        hl.openTeachersPage();
    }
	
	@Test(description = "Test open reglaments of elections page headers")
    @MethodOwner(owner = "Estani")
    public void testReglaments() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        //Open elections
        ElectionsPage electionsPage = homePage.getElectionsPage();
        electionsPage.getReglaments();
	}
	
	@Test(description = "Test open phone browser")
    @MethodOwner(owner = "Estani")
    public void testContactPhones() {
		HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        //Open elections
        ContactPage contactPage = homePage.getContactPage();
        contactPage.searchPhones();
	}
	
	@Test(description = "Test navigation between pages and click on header logotype")
    @MethodOwner(owner = "Estani")
    public void testNav() {
		HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        GobermentPage gobermentPage = homePage.getGobermentPage();
        AutoritiesPage autoritiesPage = gobermentPage.getAutorities();
        autoritiesPage.getHeaderLogo();
	}
	
	@Test(description = "Test HomePage and select a title from body")
    @MethodOwner(owner = "Estani")
    public void testNewTitle() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        homePage = new HomePage(getDriver());
        homePage.selectTitle("REHTO: Continuamos Acercando Tecnología A Distintas Instituciones");
    }	
}
