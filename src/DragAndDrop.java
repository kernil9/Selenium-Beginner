import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty(
        "webdriver.chrome.driver", "D:\\School\\FDM Group Work\\Selenium\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.get("https://formy-project.herokuapp.com/dragdrop");
    driver.manage().window().maximize();
    Actions actions = new Actions(driver);
    WebElement image = driver.findElement(By.id("image"));
    WebElement box = driver.findElement(By.id("box"));
    actions.dragAndDrop(image, box).perform();
    // actions.dragAndDrop(image, box).build().perform();
    Thread.sleep(5000);
    driver.quit();
  }
}
