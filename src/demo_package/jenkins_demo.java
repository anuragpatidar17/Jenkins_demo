package demo_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class jenkins_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
	//	WebDriver driver = new WebDriver();
		WebDriver driver = new ChromeDriver();
		
		 String baseUrl = "https://google.com";
	       String expectedTitle = "Google";
	       String actualTitle = "";
	       driver.get(baseUrl);
	      actualTitle = driver.getTitle();
	      System.out.println(actualTitle);
	      
	       if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("TEST PASSED!");
	       } else {
	           System.out.println("TEST FAILED");
	       }
	       driver.close();
		
	}
//"
}
