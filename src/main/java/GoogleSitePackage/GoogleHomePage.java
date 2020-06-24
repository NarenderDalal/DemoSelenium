package GoogleSitePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleHomePage {
	
	public static void main(String[] args) {
		//to do Auto-generated Method stud
		System.setProperty("webdriver.chrome.driver","src//main//resources//chromedriver.exe");
	//Initiate Browser
		WebDriver driver = new ChromeDriver();
		driver.get("//www.testandquiz.com/selenium/testing.html");
		System.out.println(driver.getCurrentUrl());
	
	}

}
