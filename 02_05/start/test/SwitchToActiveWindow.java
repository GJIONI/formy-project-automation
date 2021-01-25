import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        //create the element you want to test
        WebElement openInNewTab = driver.findElement(By.id("new-tab-button"));

        //click the element to open a new tab
        openInNewTab.click();
        Thread.sleep(3000);
        //after opening this window as well will have two windows to handle, so we need to specify to which window we
        // want to move each time, so we create a variable that stores the string that the window handle(the unique
        // identifier that holds the address of the window) returns
        String originalHandle = driver.getWindowHandle();

        //we add a for loop to switch to the active window
        for(String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        Thread.sleep(3000);
        driver.switchTo().window(originalHandle);
        Thread.sleep(3000);

        driver.quit();

    }
}
