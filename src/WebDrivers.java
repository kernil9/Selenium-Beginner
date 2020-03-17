import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivers {
  public static void main(String[] args) {
    System.setProperty(
        "webdriver.chrome.driver", "D:\\School\\FDM Group Work\\Selenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://google.com");
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("Cheese!");
    try {
      Thread.sleep(5000);
      element.submit();
      Thread.sleep(5000);
      driver.quit();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
