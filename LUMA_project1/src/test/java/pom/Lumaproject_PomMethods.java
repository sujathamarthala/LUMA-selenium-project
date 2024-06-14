package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lumaproject_PomMethods 
{
   WebDriver driver;
     
     public Lumaproject_PomMethods(WebDriver wd)
	{
    	 driver=wd;
		PageFactory.initElements(driver,this);
	}
	
	//RepositoryBy Class
     
    //CreatAcct 
    @FindBy (linkText="Create an Account") WebElement CA;
    @FindBy(name="firstname") WebElement FName;
	@FindBy (id="lastname")WebElement LName;
	@FindBy (name="email") WebElement Email;
	@FindBy (name="password") WebElement PW;
	@FindBy (name="password_confirmation") WebElement Pwconf;
	@FindBy (xpath="//button[@title='Create an Account']") WebElement CAbtn;

	//popup
	@FindBy (xpath="//div[@class='page messages']/descendant::div[5]")WebElement popup;
	
	
//Sign_in
	
	@FindBy (linkText="Sign In") WebElement SI;
	@FindBy (id="email") WebElement EM;
    @FindBy(name="login[password]") WebElement pw;
	@FindBy(xpath=" //fieldset[@class='fieldset login']/descendant::button") WebElement Click;
	
	//serchfunty
	@FindBy(id="search") WebElement search;
	@FindBy(xpath="//button[@title='Search']") WebElement click;
	@FindBy(xpath="//h1[@class='page-title']") WebElement text;
	
	//verifywomenlink
    @FindBy	(xpath="//ul[@id='ui-id-2']/child::li[2]")WebElement click1;

	@FindBy(xpath="//span[@class='base']")WebElement text1;

	//subcategoryJK
		@FindBy(xpath="//div[@class='categories-menu']/descendant::li[2]/child::a") WebElement click2;
        @FindBy(xpath="//h1[@class='page-title']") WebElement text2;
	
	//verifyJKitem
	
	@FindBy(xpath="//ol[@class='products list items product-items']/child::li[1]/div/child::a") WebElement click3;
	@FindBy(xpath="//h1[@class='page-title']") WebElement text3;
	
	
	
	//verifyinvalidSizeColorQty
	@FindBy(xpath="//input[@id='qty']")WebElement qty;
	@FindBy(id="product-addtocart-button")WebElement click4;
	
	@FindBy(xpath="//div[@id='super_attribute[143]-error']")WebElement text4;
    @FindBy(xpath="//div[@id='super_attribute[93]-error']") WebElement text5;
    @FindBy(xpath="//div[@id='qty-error']")WebElement text6;
   
	
          
	public void url() throws InterruptedException{
	
	driver.get("https://magento.softwaretestingboard.com/");
	Thread.sleep(2000);
	
}
public void CreatAccount1()
{
	CA.click();
}
public void enterFname() 
{
	
	FName.sendKeys("Venkata");
	
}
public void enterLname()
	{
		
 LName.sendKeys("Sujatha");
	}
public void enterEmail()
{
	
	Email.sendKeys("svsujathaonline@gmail.com");
   }
public void enterPword()
	{
		
	PW.sendKeys("17eMarchtrenk");
	}
	public void enterCPword() {
		
	Pwconf.sendKeys("17eMarchtrenk");
	}
	public void clickCABtn() throws InterruptedException {
		
	CAbtn.click();

	Thread.sleep(2000);
	}

		
	//Sign_In	
	public void Signin()
	{
		SI.click();
	}		
			
	public void enteremail()
	{
		EM.sendKeys("svsujathaonline@gmail.com");
	}
	
	public void enterpw()
	{
		pw.sendKeys("17eMarchtrenk");
	}
	
	public void clickbtn() throws InterruptedException
	{
		Click.click();
		Thread.sleep(2000);
	}

//popup
	public void gettext1()
	{
		popup.getText();
	}
	
	//searcgfnty
	public void searchbtn()
	{
		search.sendKeys("women");
	}	
	public void click()
	{
		click.click();
	}
	public void gettext2() 
	{
		text.getText();
	}

//verifywomlink
	
	public void click1()
	{
		click1.click();
	}
	public void gettext3() 
	{
		text1.getText();
	}


//subcategoryJK

	public void click2()
	{
		click2.click();
	}
	public void gettext4() 
	{
		text2.getText();
	}
	
//verifyJKitem

	public void click3()
	{
		click3.click();
	}
	public void gettext5() 
	{
		text3.getText();
	}

//verifyinvalidSizeColorQty
	public void clear()
	{
		qty.clear();;
	}
	public void click4() 
	{
		click4.click();
	}

	public String gettext6() 
	{
		return text.getText();
	}

	public String gettext7() 
	{
		return text1.getText();
	
	}
	public String gettext8() 
	{
		return text2.getText();
	}



}





	
	
	
	


