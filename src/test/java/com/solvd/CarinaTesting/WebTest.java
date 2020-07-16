package com.solvd.CarinaTesting;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.CarinaTesting.gui.components.HeaderLinks;
import com.solvd.CarinaTesting.gui.pages.AutoritiesPage;
import com.solvd.CarinaTesting.gui.pages.ContactPage;
import com.solvd.CarinaTesting.gui.pages.ElectionsPage;
import com.solvd.CarinaTesting.gui.pages.GobermentPage;
import com.solvd.CarinaTesting.gui.pages.HomePage;

public class WebTest extends AbstractTest{
	
	@DataProvider(name = "Titles")
	public static Object[] dataprovider(){
		return new Object[] {
			"Elegí UNICEN 2021. Ciclo De Encuentros Virtuales",
			"RedUnCI: Reunión Plenaria 2020",
			"RedUnCI: Mesas De Trabajo"
		};
	}
	
	@Test(description = "Test open HomePage headers")
    @MethodOwner(owner = "Estani")
    public void testHeaderPages() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        //Open pages
        HeaderLinks hl = homePage.getHeadersPages();
        Assert.assertTrue(hl.checkStudentsPage(), "Header Page is not opened");
        Assert.assertTrue(hl.checkGradutesPage(),"Header Page is not opened");
        Assert.assertTrue(hl.checkNewStudentsPage(),"Header Page is not opened");
        Assert.assertTrue(hl.checkNotTeachersPage(),"Header Page is not opened");
        Assert.assertTrue(hl.checkSchoolsPage(),"Header Page is not opened");
        Assert.assertTrue(hl.checkStudentsPage(),"Header Page is not opened");
        Assert.assertTrue(hl.checkTeachersPage(),"Header Page is not opened");
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
        Assert.assertTrue(contactPage.searchPhones(),"Phones section not found");
        
	}
	
	@Test(description = "Test navigation between pages and click on header logotype")
    @MethodOwner(owner = "Estani")
    public void testNav() {
		HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        GobermentPage gobermentPage = homePage.getGobermentPage();
        AutoritiesPage autoritiesPage = gobermentPage.getAutorities();
        Assert.assertTrue(autoritiesPage.getHeaderLogo(),"Header logo not found");
	}
	
	@Test(description = "Test HomePage and select a title from body", dataProvider = "Titles")
    @MethodOwner(owner = "Estani")
    public void testNewTitle(String title) {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        homePage = new HomePage(getDriver());
       Assert.assertTrue(homePage.selectTitle(title), "Title page is not opened");
    }
}
