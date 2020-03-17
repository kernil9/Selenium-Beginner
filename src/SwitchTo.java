import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty(
        "webdriver.chrome.driver", "D:\\School\\FDM Group Work\\Selenium\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.get("https://formy-project.herokuapp.com/switch-window");
    WebElement newTab = driver.findElement(By.id("new-tab-button"));
    Thread.sleep(1000);
    newTab.click();
    String originalHandle = driver.getWindowHandle();
    Thread.sleep(1000);
    for (String handle1 : driver.getWindowHandles()) {
      driver.switchTo().window(handle1);
    }
    Thread.sleep(1000);
    driver.switchTo().window(originalHandle);
    Thread.sleep(1000);
    WebElement alert = driver.findElement(By.id("alert-button"));
    Thread.sleep(1000);
    alert.click();
    Thread.sleep(1000);
    Alert alertObj = driver.switchTo().alert();
    Thread.sleep(1000);
    alertObj.accept();
    Thread.sleep(1000);
    driver.quit();
  }
}
