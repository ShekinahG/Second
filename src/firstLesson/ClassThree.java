package firstLesson;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

          public class ClassThree {

		public static void main(String[] args) {
			
			
					System.setProperty("webdriver.ie.driver", "C:\\Users\\Taiwo\\Desktop\\Selenium\\MicrosoftWebDriver.exe");
					
					WebDriver driver = new InternetExplorerDriver();
					driver.get("http://google.com");
				    System.out.println(driver.getTitle());

	}

}
