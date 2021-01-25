import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        //new webelement
        WebElement openAlert = driver.findElement(By.id("alert-button"));
        Thread.sleep(3000);

        //click it
        openAlert.click();
        Thread.sleep(3000);

        //we can't inspect the alert like the rest of the JavaScript code of the browser
        //so that we can act upon the alert as above
        //we ask the driver the same as if to switch window
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        //we can't inspect the alert like the rest of the JavaScript code of the browser
        //press ok means we are accepting the alert as below
        alert.accept();
        Thread.sleep(3000);




        driver.quit();
    }
}
