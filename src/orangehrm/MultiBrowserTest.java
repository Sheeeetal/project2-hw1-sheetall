package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    //Declaring static variable of static type to store browser name
    static String browser ="Edge";
    //declaring static variable of string type to store target url
    static String baseurl="https://opensource-demo.orangehrmlive.com/";
    //initialising static variable of webdriver type to store web driver value

    static WebDriver driverMulti;
    //Main method
    public static void main(String[] args) {
        //using condition statment to set up required browser
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driverMulti = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driverMulti = new EdgeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driverMulti =new FirefoxDriver();

        }
        else {
            System.out.println("Invalid browser");
        }
        //opening selected browser inside try and catch block to handle exception
        try{
            driverMulti.get(baseurl);
        }catch (Exception e){
            System.out.println("End of the program due to invalid entry (" + e.getMessage()+")");
            System.exit(0);

        }
        //Maximising browser window upon opening
        driverMulti.manage().window().maximize();
        //providing timeout for complete loading of page
        driverMulti.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //printing title of the selected browser in console
        System.out.println("title of page is:"+driverMulti.getTitle());
       // printing the current url
        System.out.println("The current url is: "+ driverMulti.getCurrentUrl());
        //printing the source for page
        System.out.println("The source of page is:" +driverMulti.getPageSource());
        //getting web element for user field and entering the username in the field
        WebElement userName=driverMulti.findElement(By.name("username"));
        userName.sendKeys("Admin");
      //GETTING  WebElement for password and entering the password in the field
        WebElement passwordField=driverMulti.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        //closing the browser
        //driver.quit();
    }
}

