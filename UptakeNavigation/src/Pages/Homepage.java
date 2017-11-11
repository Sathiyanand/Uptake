package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Homepage {
	
	WebDriver driver;

    By homePageHeadingMsg= By.xpath("/html/body/div[2]/div[1]/div[3]/div/h1");
   
    By products= By.linkText("Products");
    
    
    public Homepage(WebDriver driver){

        this.driver = driver;
    }
	
 //Get Heading Message from Home Page

    public String getHomePageHeadingName(){

     return    driver.findElement(homePageHeadingMsg).getText();

    }
//Click on products Link from Home Page

    public void ClickHomePageProducts(){
	
	      driver.findElement(products).click();
	 
	 }
   
}
