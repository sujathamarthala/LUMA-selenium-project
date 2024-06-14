package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Luma_myaccoutpg {
	WebDriver driver;
    WebDriverWait wait;
    public Luma_myaccoutpg(WebDriver wd)
	{
   	 driver=wd;
   	 wait=new WebDriverWait(driver,Duration.ofSeconds(10));

		PageFactory.initElements(driver,this);
	}
    @FindBy(id="search") WebElement search;
	@FindBy(xpath="//button[@title='Search']") WebElement click;
	@FindBy(xpath="//h1[@class='page-title']") WebElement text;
	
	public void searchbtn()
	{
		search.sendKeys("women");
	    WebElement women=wait.until(ExpectedConditions.visibilityOf(search));   	

	}	
	public void click()
	{
		click.click();
	}
	
	
	
	
}
