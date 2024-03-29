package testScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class LoginPageTest {
	WebDriver driver;
	Properties prop;
//	@Parameters("browser")
	@BeforeMethod
	public void setup() throws IOException {
		String path = System.getProperty("user.dir") +
				  "//src//test//resources//configFiles//config.properties";
		FileInputStream fin = new FileInputStream(path);
		prop = new Properties();
		prop.load(fin);
		String strBrowser =prop.getProperty("browser");
		System.out.println("Browser name ...."+strBrowser);
		if(strBrowser.equalsIgnoreCase("chrome")) {
		   driver = new ChromeDriver();
		}
		else
			if(strBrowser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver(); 
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().deleteAllCookies();
	}
  @Test(dataProvider = "loginData")
  public void validLogin(String strUser, String strPwd) {
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//input[@type='text' and @id='username']")).sendKeys(strUser);
		driver.findElement(By.name("password")).sendKeys(strPwd);
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
		boolean isUserValid = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isUserValid);
	
  }
  
	//"tomsmith", "SuperSecretPassword!" - user1
   //testuser1, welcome123 - user2
  //testuser2, welcome123 - user3
    //  list of users and each user will have details
    
@DataProvider(name="loginData")
public Object[][] getData() throws CsvValidationException, IOException{
	  String path = System.getProperty("user.dir") +
			  "//src//test//resources//testData//loginData.csv";
	 CSVReader reader = new CSVReader(new FileReader(path));
	  String cols[];
	  ArrayList<Object> dataList = new ArrayList<Object>();
	  while((cols =reader.readNext()) != null) {
			Object record[] = { cols[0], cols[1] };
			dataList.add(record);
		}
	  reader.close();
	  return dataList.toArray(new Object[dataList.size()][]);
}
  
  //.csv
  
  @AfterMethod
  public void teardown() {
	  driver.close();
  }
}
