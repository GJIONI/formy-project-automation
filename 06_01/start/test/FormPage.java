import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FormPage {

    public static void submitForm(WebDriver driver) throws InterruptedException {
        //firstName:define it
        WebElement firstName = driver.findElement(By.id("first-name"));
        //firstName: and fill in the field
        firstName.sendKeys("Peter");
        //Thread.sleep(5000);

        //lastName:define it
        WebElement lastName = driver.findElement(By.id("last-name"));
        //firstName: and fill in the field
        lastName.sendKeys("Whatever");
        //Thread.sleep(5000);

        //job:define it and fill in the field
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
        //Thread.sleep(5000);


        //education:define it
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //WebElement education = wait.until(ExpectedCondritions.visibilityOfElementLocated(By.id("radio-button-1")));
        WebElement education = driver.findElement(By.id("radio-button-1"));
        //education: and fill it
        education.click();
        //Thread.sleep(5000);

        //sex:define it and click it
        driver.findElement(By.id("checkbox-3")).click();
        Thread.sleep(5000);

        //experience:define it
        WebElement experienceYears = driver.findElement(By.id("select-menu"));
        //experience option: define and select an option
        driver.findElement(By.cssSelector("option[value='2']")).click();
        Thread.sleep(5000);

        //date:define it and fill in the field
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("01/24/2020");
        Thread.sleep(5000);

        //to pass the date we should press Enter
        date.sendKeys(Keys.RETURN);
        Thread.sleep(5000);

        //click the submit button
        //define it
        WebElement submit = driver.findElement(By.linkText("Submit"));
        //let's scroll down
        Actions actions = new Actions(driver);
        actions.moveToElement(submit);
        //click on it
        submit.click();
    }
}
