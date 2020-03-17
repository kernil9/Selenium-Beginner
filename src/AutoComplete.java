import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
  public static void main(String[] args) throws InterruptedException {

    System.setProperty(
        "webdriver.chrome.driver", "D:\\School\\FDM Group Work\\Selenium\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.get("https://formy-project.herokuapp.com/autocomplete");
    WebElement autoComplete = driver.findElement(By.id("autocomplete"));
    autoComplete.sendKeys("1555 Park Blvd, Palo Alto, CA, USA");
    Thread.sleep(1000);
    WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
    autoCompleteResult.click();
    Thread.sleep(1000);
    driver.quit();
  }
}
