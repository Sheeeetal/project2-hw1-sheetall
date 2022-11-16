package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("Webdriver.gecko.driver","drivers/geckodriver.exe");
        //creating interface project
        WebDriver driverFb=new FirefoxDriver();
//opening url in chrome
        driverFb.get(baseUrl);
        //maximising window upon opening
        driverFb.manage().window().maximize();
        //time given to driver to wait until page is loaded completely
        driverFb.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get and print title page in console
        String title= driverFb.getTitle();
        System.out.println("page title is:"+title);
        //get current url
        System.out.println(("Current URL:"+ driverFb.getCurrentUrl()));
        //get page source
        System.out.println("Page source:"+ driverFb.getPageSource());
        //getting and entering email in email field
        WebElement emailField=driverFb.findElement(By.id("Email"));
        emailField.sendKeys("spsp@gmail.com");
        //getting and entering password in password field
        WebElement passwordField =driverFb.findElement(By.id("Password"));
        passwordField.sendKeys("1234Pass");

        // Closing the chrome browser
        driverFb.quit();

    }
}
