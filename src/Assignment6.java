import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http:qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption1")).click();
		String optX = driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		System.out.println(optX);
		WebElement staticDropDown= driver.findElement(By.id("dropdown-class-example"));
		Select dropDown= new Select(staticDropDown);
		dropDown.selectByVisibleText(optX);
		
		driver.findElement(By.id("name")).sendKeys(optX);
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().getText();
		String mesg = driver.switchTo().alert().getText();
	
	
		
		
		if(mesg.contains(optX))
				{
		System.out.println("The alert contains" + " "+ optX);}
		
		else {System.out.println("The alert does not contain" + optX);}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


