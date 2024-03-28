package home_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_base_package.test_base_class;

public class form extends test_base_class 
{
	
	@FindBy(xpath = "//input[@placeholder='First Name']") private WebElement first_name;
	@FindBy(xpath = "//input[@placeholder='Last Name']") private WebElement last_name;
	@FindBy(xpath = "//textarea[@ng-model = 'Adress']") private WebElement Adress;
	
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
}
