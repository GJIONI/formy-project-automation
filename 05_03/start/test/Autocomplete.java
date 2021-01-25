import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        //here we are using the Explicit Wait
        //first create a new instance of the webdriverwait class
        WebDriverWait wait = new WebDriverWait(driver, 10);

        //WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        //instead of using the line above since we want to wait for the element to be visible first we are using the
        //line of code below that defines the element on page as long as it is on page at the time
        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));

        //click on the element that you defined above
        autocompleteResult.click();
        Thread.sleep(3000);


        driver.quit();
    }
}
