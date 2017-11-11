package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	
	WebDriver driver;

    By ProductsPageHeadingMsg = By.xpath("/html/body/div[2]/div[1]/div/div/h1");
   
    By GetaDemo = By.xpath("/html/body/div[2]/div[1]/div/div/a/span");
    
    public ProductsPage(WebDriver driver){

        this.driver = driver;

    }
	
  //Get Heading message from Products Page

    public String getProductsPageHeadingName(){

     return    driver.findElement(ProductsPageHeadingMsg).getText();

    }
   //Click on Get a demo button from Products Page
    
    public void ClickDemobtnProducts() {
    	
    	driver.findElement(GetaDemo).click();
    }
}
	