import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				Set<String> windows=driver.getWindowHandles();
	
				System.out.println(driver.findElement(By.cssSelector("[name='name']")).getRect().getHeight());
				System.out.println(driver.findElement(By.cssSelector("[name='name']")).getRect().getDimension().getHeight());
		
		
		//Taking screenshot of webelement
		name.sendKeys(courses);
		File src=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("logo.png"));
		//Get Height and weight
	    //Two ways to get Height ad width
		System.out.println(driver.findElement(By.cssSelector("[name='name']")).getRect().getHeight());
		System.out.println(driver.findElement(By.cssSelector("[name='name']")).getRect().getDimension().getHeight());
		System.out.println(driver.findElement(By.cssSelector("[name='name']")).getRect().getWidth());
		System.out.println(driver.findElement(By.cssSelector("[name='name']")).getRect().getDimension().getWidth());
		
		

	}

}
