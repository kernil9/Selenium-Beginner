import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavascript {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty(
        "webdriver.chrome.driver", "D:\\School\\FDM Group Work\\Selenium\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.get("https://formy-project.herokuapp.com/modal");

    WebElement modal = driver.findElement(By.id("modal-button"));
    modal.click();
    Thread.sleep(1000);
    WebElement closeButton = driver.findElement(By.id("close-button"));

    /*JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", closeButton);*/
    closeButton.click();
    Thread.sleep(1000);
    driver.quit();
  }
}
