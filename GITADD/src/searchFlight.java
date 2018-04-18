import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchFlight {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath(".//*[@id='BE_flight_origin_city']")).sendKeys("MAA");
		driver.findElement(By.xpath(".//*[@id='BE_flight_arrival_city']")).sendKeys("DEL");
		driver.findElement(By.xpath(".//*[@id='BE_flight_depart_date']")).click();
		driver.findElement(By.xpath(".//*[@id='a_2018_2_27']")).click();
		driver.findElement(By.xpath(".//*[@id='BE_flight_return_date']")).click();
		driver.findElement(By.xpath(".//*[@id='a_2018_2_28']")).click();
		driver.findElement(By.xpath(".//*[@id='BE_flight_flsearch_btn']")).click();
		//driver.close();
		//driver.quit();

	}

}
