import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logout {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.yatra.com/social/common/yatra/signin.htm");
		//Thread.sleep(3000);
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='userSignInStrip']")).click();
		driver.findElement(By.xpath(".//*[@id='signInBtn']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		driver.findElement(By.xpath(".//*[@placeholder='Email ID / Mobile Number']")).sendKeys("9438807301");
		driver.findElement(By.xpath(".//*[@id='login-continue-btn']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='login-password']")).sendKeys("anshu143");
		driver.findElement(By.xpath(".//*[@id='login-submit-btn']")).click();
		//driver.findElement(By.xpath("//*[@id='skip-mobile-verification']")).isDisplayed();
		driver.findElement(By.xpath("(//*[@id='skip-mobile-verification'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='userShowName']")).click();
		driver.findElement(By.xpath(".//*[@id='logOut']")).click();
		

	}

}
