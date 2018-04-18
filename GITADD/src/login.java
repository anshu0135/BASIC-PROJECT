import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='userLoginBlock']")).click();
		//driver.findElement(By.xpath(".//*[contains.text(),'My Account']")).click();
		
		driver.findElement(By.xpath("//*[@id='signInBtn']")).click();
		driver.findElement(By.xpath(".//*[@placeholder='Email ID / Mobile Number']")).sendKeys("9438807301");
		//driver.findElement (By.xpath( "//*[@id='rrr']//*[@name='sss']"));
		driver.findElement(By.xpath(".//*[@id='login-continue-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='login-password']")).sendKeys("anshu143");
		driver.findElement(By.xpath(".//*[@id='login-submit-btn']")).click();
		driver.findElement(By.xpath("(//*[@id='skip-mobile-verification'])[2]")).click();
	}

}
