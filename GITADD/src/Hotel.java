import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hotel {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='booking_engine_hotels']")).click();
		driver.findElement(By.xpath(".//*[@id='BE_hotel_destination_city']")).sendKeys("CHENNAI");
		driver.findElement(By.xpath(".//*[@id='BE_hotel_checkin_date']")).click();
		driver.findElement(By.xpath(".//*[@id='PegasusCal-7']//*[@id='a_2018_2_26']")).click();
		driver.findElement(By.xpath(".//*[@id='PegasusCal-7']//*[@id='a_2018_2_27']")).click();
		driver.findElement(By.xpath(".//*[@id='BE_hotel_htsearch_btn']")).click();
		

	}

}
