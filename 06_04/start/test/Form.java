import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahmed Nabil\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        Formx formx = new Formx();
        formx.submitForm(driver);

        Confirm confirm = new Confirm();
        confirm.waitForAlertBanner(driver);


        assertEquals("The form was successfully submitted!", Confirm.getAlertBannerText(driver));

        //driver.quit();
    }




}
