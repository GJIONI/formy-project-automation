import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        //define the chrome driver we've downloaded import I
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\chromedriver\\chromedriver.exe");

        //create an instance of the chromedriver with selenium webdriver, import II
        WebDriver driver = new ChromeDriver();

        //launch chrome and navigate to the page
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        //define a webelement for the address this will be used for the autocomplete
        WebElement address = driver.findElement(By.id("autocomplete"));

        //type the full address this will be used for the autocomplete
        address.sendKeys("1555 Park Blvd, Palo Alto, CA");

        //to see if this will work as expected we can add a delay here, a wit statement
        //to use this our main() should include a throw InterruptedException
        Thread.sleep(5000);

        //we should inspect the autocomplete that appears, not the whole field only the text it contains
        // on page when we enter the address and create a new element to test it
        WebElement autocomplete = driver.findElement(By.className("pac-item"));

        //click on the autocomplete so that all the fields are filled in with the info you provide with the address you're typing
        autocomplete.click();

        //to see if this will work as expected we can add a delay here, a wit statement
        //to use this our main() should include a throw InterruptedException
        //Thread.sleep(5000);

        //quit the driver
        driver.quit();
    }
}
