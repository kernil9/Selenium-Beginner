import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty(
        "webdriver.chrome.driver", "D:\\School\\FDM Group Work\\Selenium\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.get("https://formy-project.herokuapp.com/radiobutton");

    WebElement rB = driver.findElement(By.id("radio-button-1"));
    rB.click();
    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    Thread.sleep(1000);
    WebElement rB2;
    try {
      rB2 = driver.findElement(By.cssSelector("input[value='option2']"));
      rB2.click();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    Thread.sleep(1000);
    WebElement rB3 = driver.findElement(By.cssSelector("input[value='option3']"));
    rB3.click();
    Thread.sleep(2000);
    driver.quit();
  }
}
