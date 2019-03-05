package firstLesson;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class ClassTwo {

	public static void main(String[] args) {
		
		
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Taiwo\\Desktop\\Selenium\\geckodriver.exe");
				
				WebDriver driver = new FirefoxDriver();
				driver.get("http://Apple.com");
			    System.out.println(driver.getTitle());

	}

}
