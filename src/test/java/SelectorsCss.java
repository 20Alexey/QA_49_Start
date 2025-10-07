import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectorsCss {
    WebDriver driver = new ChromeDriver();
    @Test
    public void phoneBookTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://telranedu.web.app/home");
        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        btnAbout.click();
        pause(2);
        System.out.println(btnAbout.getText());

        WebElement btnLogin = driver.findElement(
                By.cssSelector("div[id='root'] a:last-child"));
        btnLogin.click();

        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));
        inputEmail.sendKeys(" Aaa@mail.ru");

        WebElement inputPassword = driver.findElement(By.cssSelector("*[placeholder='Password']"));
        inputPassword.sendKeys("Password1234!");

        WebElement btnLoginForm = driver.findElement(By.cssSelector("form>button[name='login']"));
        btnLoginForm.click();

        pause(5);
        driver.quit();


    }

    @Test
    public void iLcarroTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search");

        WebElement btnSearch  = driver.findElement(By.cssSelector("a[href='/search']"));
        btnSearch.click();

        WebElement btnLetthecarwork  = driver.findElement
               (By.cssSelector("a[ng-reflect-router-link='let-car-work']"));
        btnLetthecarwork .click();

        WebElement btnTerms  = driver.findElement(By.cssSelector
                ("a[ng-reflect-router-link='terms-of-use']"));
        btnTerms .click();

        WebElement btnSingup = driver.findElement
                (By.cssSelector("a[ng-reflect-router-link='registration']"));
        btnSingup.click();

        WebElement btnLogin = driver.findElement
                (By.cssSelector("a[href='/login?url=%2Fterms-of-use']"));
        btnLogin.click();


        WebElement inputEmail = driver.findElement(By.cssSelector("input[type='email']"));
        inputEmail.sendKeys(" AaaA@mail.ru");

        WebElement inputPassword = driver.findElement(By.cssSelector("input[type='password']"));
        inputPassword.sendKeys("A!321654");

        WebElement btnYalla = driver.findElement(By.cssSelector("button[type='submit']"));
        btnYalla.click();



       // pause(5);
        //driver.quit();

    }




    static void pause(int time ){
        try {
            Thread.sleep(time * 1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
