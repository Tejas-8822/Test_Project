package test_package;

import org.testng.annotations.Test;


import test_base_package.test_base_class;

public class fill_the_form_test extends test_base_class {
 

	
  @Test
  public void Test1() throws InterruptedException 
  {
	  
	  form.name("Tejas", "Patil");
	  
	  Thread.sleep(3000);
  }
}