package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Luma_jacketsJk {
WebDriver driver;
    WebDriverWait wait;
    public  Luma_jacketsJk(WebDriver wd)
	{
   	 driver=wd;
		PageFactory.initElements(driver,this);
	  	 wait=new WebDriverWait(driver,Duration.ofSeconds(10));

	}
    @FindBy(xpath="//ol[@class='products list items product-items']/child::li[1]/div/child::a") WebElement JK;
	@FindBy(xpath="//h1[@class='page-title']") WebElement text;
	
    
    
    public void jacketsJK()
	{
		JK.click();
        WebElement jacketsJK=wait.until(ExpectedConditions.visibilityOf(JK));   	

	}
	public String gettext() 
	{
		return text.getText();
	}
    
    
    
} 
    
    
    
    
    
    
    
    
    

