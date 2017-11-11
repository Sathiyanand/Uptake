package TestNavigation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import Pages.Homepage;

import Pages.ProductsPage;

public class UptkNavigationTest {
	
	public static WebDriver driver;

	public static Homepage objHomePage;
	
	public static ProductsPage objProductsPage;
	
	@BeforeTest

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
        
		driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.uptake.com");
       
        uptake_Home_Page_Appear_Correct();
	
	}
    /**

     * This test case will launch in https://www.uptake.com

     * Verify Home page Heading Message

     * Navigate to Products Page

     * Verify  Products page Heading message

     */
	@Test(priority=0)

    public static void uptake_Home_Page_Appear_Correct(){

	
    objHomePage = new Homepage(driver);
    
    //Verify Home page 
    
    Assert.assertTrue(objHomePage.getHomePageHeadingName().equals("UPTAKE PRODUCTS"));
    
        System.out.println("Homepage Verified");
    
    objHomePage.ClickHomePageProducts();
  
    objProductsPage = new ProductsPage(driver);

    //Verify Products page

    Assert.assertTrue(objProductsPage.getProductsPageHeadingName().equals("PRODUCTS"));
    
       System.out.println("Productspage Verified");
	
    objProductsPage.ClickDemobtnProducts();
	}
    
    
}
