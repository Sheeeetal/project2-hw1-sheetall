package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EgdeBrowserTest {
    //Creating main method of the class
    public static void main(String[] args) {
        //Declaring string type local variable
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //setting up properties for chrome web driver
        System.setProperty("Webdriver.edge.driver","drivers/msedgedriver.exe");
        //creating interface project
        WebDriver driverEb=new EdgeDriver();
//opening url in chrome
        driverEb.get(baseUrl);
        //maximising window upon opening
        driverEb.manage().window().maximize();
        //time given to driver to wait until page is loaded completely
        driverEb.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get and print title page in console
        String title= driverEb.getTitle();
        System.out.println("page title is:"+title);
        //get current url
        System.out.println(("Current URL:"+ driverEb.getCurrentUrl()));
        //get page source
        System.out.println("Page source:"+ driverEb.getPageSource());
        //getting and entering email in email field
        WebElement emailField=driverEb.findElement(By.id("Email"));
        emailField.sendKeys("spsp@gmail.com");
        //getting and entering password in password field
        WebElement passwordField =driverEb.findElement(By.id("Password"));
        passwordField.sendKeys("1234Pass");

        // Closing the chrome browser
        driverEb.quit();


    }

}
