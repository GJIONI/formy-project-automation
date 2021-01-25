import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        //define the datepicker variable
        WebElement datepicker = driver.findElement(By.id("datepicker"));

        //sebd keys and type the date into the datepicker field
        datepicker.sendKeys("03/03/2020");

        //to press Enter, we use the Keys class as the code line below
        datepicker.sendKeys(Keys.RETURN);


        driver.quit();
    }
}