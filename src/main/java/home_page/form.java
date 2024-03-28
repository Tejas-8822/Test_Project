package home_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import test_base_package.test_base_class;

public class form extends test_base_class 
{
	
	@FindBy(xpath = "//input[@placeholder='First Name']") private WebElement first_name;
	@FindBy(xpath = "//input[@placeholder='Last Name']") private WebElement last_name;
	@FindBy(xpath = "//textarea[@ng-model = 'Adress']") private WebElement Adress;
	@FindBy(xpath = "//input[@type ='email']") private WebElement email;
	public form() {
		PageFactory.initElements(driver,this);
	}

	
	
	public void name(String fn,String ln)
	{
		first_name.sendKeys(fn);
		last_name.sendKeys(ln);
		
	}
	
	public void Adress(String adr)
	{
		Adress.sendKeys(adr);
	}
	
	public void email(String mail)
	{
		email.sendKeys(mail);
	}
}
