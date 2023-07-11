import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinksInAPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		
		WebElement column=driver.findElement(By.xpath("//tr/td/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());

	for(int i=1; i<column.findElements(By.tagName("a")).size(); i++)
	{
	String clickonLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
	column.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
	Thread.sleep(5000L);
	}
	}
		
	
	
	
	}


