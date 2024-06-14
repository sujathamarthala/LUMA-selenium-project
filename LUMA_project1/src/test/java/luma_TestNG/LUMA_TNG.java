package luma_TestNG;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pom.Luma_CreatAcct;
import pom.Luma_HomePage;
import pom.Luma_MenPage;
import pom.Luma_MenRykerItemPage;
import pom.Luma_MenShoppCartUpdate;
import pom.Luma_RewandPaymentpg;
import pom.Luma_ShippgAddrsPg;
import pom.Luma_SignOutpg;
import pom.Luma_TopsPage;
import pom.Luma_jacketsJk;
import pom.Luma_myaccoutpg;
import pom.Luma_oliviaJKpg;
import pom.Luma_shoppingcartpage;


import pom.Luma_womensubcategory;
import pom.Luma_womenpage;
public class LUMA_TNG {
	WebDriver driver;
	JavascriptExecutor js;
	Luma_HomePage LHP;
	Luma_CreatAcct LCA;
	Luma_myaccoutpg MAP;
	Luma_womenpage LWP;
	Luma_womensubcategory LSW;
	Luma_jacketsJk LJK;
	Luma_oliviaJKpg OJK;
	Luma_shoppingcartpage LSC;
	Luma_MenPage LMP;
	Luma_TopsPage LTP;
	Luma_MenRykerItemPage MRP;
	Luma_MenShoppCartUpdate LMS ;
	Luma_ShippgAddrsPg LSA;
	Luma_SignOutpg LSO;
	Luma_RewandPaymentpg LRP;
	@BeforeSuite
	 public void setUp() {

	 driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://magento.softwaretestingboard.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	 
	
LHP=new Luma_HomePage(driver);
LCA=new Luma_CreatAcct (driver);
MAP=new Luma_myaccoutpg (driver);
LWP=new Luma_womenpage(driver);
LSW=new Luma_womensubcategory(driver);
LJK =new Luma_jacketsJk(driver);
OJK=new Luma_oliviaJKpg(driver);
LSC=new Luma_shoppingcartpage(driver);
LMP=new Luma_MenPage(driver);
LTP=new Luma_TopsPage(driver);	
MRP =new Luma_MenRykerItemPage(driver);
LMS=new Luma_MenShoppCartUpdate(driver);	
LSA=new Luma_ShippgAddrsPg(driver);
LSO=new Luma_SignOutpg(driver);	
LRP=new Luma_RewandPaymentpg(driver);
	} 

@Test (priority=1)
public void createanAccount() throws InterruptedException
{
	

js=(JavascriptExecutor)driver;
	
LHP.clickCreatAcct();


LCA.ScrolltoSignininformation();
LCA.enterFname();
LCA.enterLname();
LCA.enterEmail();
LCA.enterPword();
LCA.enterCPword();	
LCA.clickCABtn();

}
@Test (priority=2)
public void verifypopUp() throws InterruptedException
{

	String popUp=LCA.gettext1();
		String exp="There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.";
	    Assert.assertEquals(exp,popUp);

}

@Test(priority=3)
public void signin() throws InterruptedException {
	LCA.Signin();
	LCA.enteremail();
	LCA.enterpw();
	LCA.clickbtn();
}
@Test(priority=4)
public void verifysearchfunction() throws InterruptedException
{
MAP.searchbtn();
MAP.click();
}

@Test(priority=5)
public void  verifylinkwomen() throws InterruptedException
{
	String popUp=LWP.gettext();
	String exp="Search results for: 'women'";
    Assert.assertEquals(exp,popUp);
    
	LWP.womenlink();

}
@Test(priority=6)
public void verifsubcategory() {

	String Women=LSW.gettext();
	String exp="Women";
    Assert.assertEquals(exp,Women);    
    LSW.jackets();
}
@Test(priority=7)
public void verifyJKitem() {
LJK.jacketsJK();
String item=LJK.gettext();
String exp="Olivia 1/4 Zip Light Jacket";
Assert.assertEquals(exp,item);    
}
@Test(priority=8)
public void verifyinvalidSizeColorQty() throws InterruptedException {
	
OJK.clear();

OJK.click();
	String size=OJK.gettext();
    String exp="This is a required field.";
    Assert.assertEquals(exp,size);    

    String color=OJK.gettext1();
    String exp1="This is a required field.";
    Assert.assertEquals(exp1,color); 

  
	String quantity=OJK.gettext2();
    String exp2="Please enter a valid number in this field.";
    Assert.assertEquals(exp2,quantity);
}
@Test(priority=9)
public void verifysizecolourinvQyt() throws InterruptedException {
	
OJK.size();
OJK.color();
OJK.clearqty();
OJK.sendqty();
OJK.addcart();



	String errortext=OJK.gettext3();
	
    String exp3="Please enter a quantity greater than 0.";
    Assert.assertEquals(exp3,errortext);
}

@Test(priority=10)
public void verifyselectedItems() throws InterruptedException {
	OJK.quantity();
	OJK.sendkeys();
	OJK.addcart1();
	}

@Test(priority=11)
public void verifAlertmsg() 
{
	
	 String alert=OJK.gettext4();
	    String exp4="You added Olivia 1/4 Zip Light Jacket to your shopping cart.";
	    Assert.assertEquals(exp4,alert);   
	    }
@Test(priority=12)
public void  verifyScartPrice() throws InterruptedException
{
OJK.shoppingcart();
String price=OJK.gettext5();
String exp="$77.00";
Assert.assertEquals(exp,price);

OJK.viewcart();
}

@Test(priority=13)
public void verifywishlistLSC() throws InterruptedException 
{
LSC.whishlist();

String alert= LSC.gettext0();
String exp="Olivia 1/4 Zip Light Jacket has been moved to your wish list.";
Assert.assertEquals(exp,alert);

LSC.Men();
}
@Test(priority=14)
public void Menpage() throws InterruptedException {
	
	String title= LMP.gettext();
	String exp="Men";
	Assert.assertEquals(exp,title);
  LMP.tops();

}



@Test(priority=15)
public void verifyitemcolor() throws InterruptedException {
	LTP.color();
	LTP.blue();
	String textblue=LTP.gettext1();
    String exp="Blue";
	Assert.assertEquals(exp,textblue);
}

@Test(priority=16)
public void verifylinkERINRECOMMENDS() throws InterruptedException
{
LTP.Recommends();
LTP.yes();
String ERtext=LTP.gettext2();
String exp="Erin Recommends";
Assert.assertEquals(exp,ERtext);

}
@Test(priority=17)
public void verifySortBy() throws InterruptedException {

LTP.sort();


}
@Test(priority=18)
public void verifypageItems() throws InterruptedException
{
	String PI=LTP.gettext3();
	String exp="8";
	Assert.assertEquals(exp,PI);
	LTP.material();

	LTP.polyster();
	
	LTP.item();
}
@Test(priority=19)
public void verifyAddingMenlinks() throws InterruptedException 
{
	
	//verifyingdetailsscqty
		MRP.size();
		MRP.color();
		MRP.qty();
		MRP.button();
	//navigatepage
        driver.navigate().back();
		MRP.material();
		MRP.organiccotten();
	    MRP.item();
		//verifyingdetailsscqty
		MRP.size1();
		MRP.color1();
	    MRP.qty1();
        MRP.button1();
		
	//xpath for addcartand view
			MRP.showcart();
			MRP.viewcart();
			
}
@Test(priority=20)
public void verifyUpdateShoppingcart() throws InterruptedException {
	
	LMS.update();
	
	LMS.qty();
	
	LMS.keys();
	
}
@Test(priority=21)
public void verifySubtotal() throws InterruptedException {
LMS.update1();
String Subtol=LMS.gettext0();
String exp="$127.00";
Assert.assertEquals(exp,Subtol);
	
}	

@Test(priority=22)
public void verifyEditbtn() throws InterruptedException {

	LMS.editbutton();
	
	LMS.itemsize();
	LMS.itemcolor();
	LMS.updatecart();
String UpdatePage=LMS.gettext1();
String exp="Bruno Compete Hoodie was updated in your shopping cart.";
Assert.assertEquals(exp,UpdatePage);

}

@Test(priority=23)
public  void verifydeleteBtn() throws InterruptedException 
{
	LMS.deletbtn();
	String Item=LMS.gettext2();
	String exp="Shopping Cart";
	Assert.assertEquals(exp,Item);

	}
@Test(priority=24)
public void verifyproceedtocheckout() throws InterruptedException
	{
LMS.PTCO();

	String  Shippadd=LMS.gettext3();
	String exp="Shipping Address";
	Assert.assertEquals(exp,Shippadd);
}

@Test (priority=25)
public void verifyShippingForm() throws InterruptedException {
  //newadds
//shippingoption
LSA.Soption();
//nextbtn
LSA.btnnext();

}

@Test(priority=26)

public void verifyplaceorderbtn() throws InterruptedException 
{
LRP.POrder();

String PO= LRP.gettext1();
String exp="Thank you for your purchase!";
Assert.assertEquals(exp,PO);
}
@Test(priority=27)
public void verifySignOut() throws InterruptedException
{
	LSO.Pwrapper();
	LSO.SignOut();
	}

@AfterSuite

public void closeBrowser() throws InterruptedException
{
	
	driver.close();
}


}

