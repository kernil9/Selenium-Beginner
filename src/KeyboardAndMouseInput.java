import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {
  public static void main(String[] args) throws InterruptedException {

    System.setProperty(
        "webdriver.chrome.driver", "D:\\School\\FDM Group Work\\Selenium\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.get("https://formy-project.herokuapp.com/keypress");
    WebElement name = driver.findElement(By.id("name"));
    name.click();
    name.sendKeys("Kareem Eltorgman");
    Thread.sleep(5000);
    WebElement button = driver.findElement(By.id("button"));
    button.click();
    Thread.sleep(5000);
    driver.quit();
  }
}
