import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//opening new window/tab-both are possible
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
		driver.get("https://rahulshettyacademy.com/");
		String courses=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(3).getText();
		driver.switchTo().window(parentwindow);
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		
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
