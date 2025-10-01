package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class loginpage extends BaseClass  {

    public void enter_username() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(prop.getProperty("username"));
    }

    public void Enter_Password() throws InterruptedException {
        driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
    }

    public void click_on_login_button() throws InterruptedException {
        driver.findElement(By.id("login-button")).click();
    }

    // Example of additional methods (uncomment as per need):

//    public void Homepage_should_display() {
//        String expectedResult = "Products";
//        String ActualResult = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
//        assertEquals("Products", expectedResult, ActualResult);
//    }

//    public void click_on_add_to_cart_button() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//    }

//    public void Scroll_Down() throws InterruptedException {
//        Thread.sleep(3000);
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0, 5000)");
//    }

//    public void Scroll_Up() throws InterruptedException {
//        Thread.sleep(3000);
//        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
//        jse2.executeScript("window.scrollBy(0, -5000)");
//    }

//    public void click_on_cart_button() {
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).click();
//    }

//    public void click_on_Checkout_button() throws InterruptedException {
//        driver.findElement(By.id("checkout")).click();
//        Thread.sleep(900);
//    }

//    public void Enter_First_Name() {
//        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input")).sendKeys("Ajit");
//    }

//    public void Enter_Last_Name() {
//        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[2]/input")).sendKeys("kumar");
//    }

//    public void Enter_Postal_Code() {
//        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[3]/input")).sendKeys("110041");
//    }

//    public void Click_on_Continue_Button() {
//        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[2]/input")).click();
//    }

//    public void Click_on_Finish_Button() throws InterruptedException {
//        driver.findElement(By.id("finish")).click();
//        Thread.sleep(3000);
//    }

}   // ✅ Properly closed class here
