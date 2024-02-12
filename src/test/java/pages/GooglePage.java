package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {
	//WebElements
	
	//searchbox
	//google button
	
	@FindBy(id = "APjFqb")
	WebElement srcBox;
	
	public GooglePage() {
		
	}
	
	//Actions
	//search item
	
	public void searchTxt(String strTxt) {
		srcBox.sendKeys(strTxt);
		srcBox.submit();
	}
	
	public String getPageTitle() {
		return "Google";
	}
	

}
