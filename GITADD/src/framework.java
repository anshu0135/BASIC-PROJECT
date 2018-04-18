import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*junit frame work */ 

	/*@BeforeClass 
public static void invoke(){
System.out.println("invoke");
}
@AfterClass 
public static void close(){
System.out.println("close");
}
@Before 
public void login (){
System.out.println("login");
}
@After 
public void logout (){
System.out.println("logout");
}
@Test 
public void anshu (){
System.out.println("anshu");
}
@Ignore
@Test 
public void murug (){
System.out.println("murug");
}
@Test 
public void kalai (){
System.out.println("kalai");
}*/
//----------------------------------------------
	/*TestNG frame work */ 	
public class framework {
	WebDriver WD;
	@BeforeClass 
	public void invoke(){
		WD=new FirefoxDriver();
	}
	@AfterClass 
	public void close(){
		WD.close();
	}
	@BeforeMethod 
	public void login () throws InterruptedException{
	WD.get("https://www.yatra.com/");
	WD.manage().window().maximize();
	Thread.sleep(2000);
	
	}
	@AfterMethod 
	public void FlightStatus(){
		WD.findElement(By.xpath(".//*[@name='FlightStatus']")).click();
	}
	@Test
	public void BookFlight(){
		WD.findElement(By.xpath(".//*[@name='BookFlight']")).click();
	}
	
	@Test
	public void From(){
		WD.findElement(By.xpath(".//*[@placeholder='From']")).sendKeys("del");
	}
	@Test
	public void TO(){
		WD.findElement(By.xpath(".//*[@placeholder='To']")).sendKeys("bbi");
		
	
	}
}
