package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        //* Enter “standard_user” username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //* Enter “secret_sauce” password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        //* Click on ‘LOGIN’ button
        driver.findElement(By.id("login-button")).click();
        //* Verify the text “PRODUCTS”
        String expectedTextMessage = "Products";
        String actualTextMessage = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(expectedTextMessage, actualTextMessage);

        System.out.println("This is display message : " + actualTextMessage);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        //* Enter “standard_user” username
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        //* Enter “secret_sauce” password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");

        //* Click on ‘LOGIN’ button
        WebElement loginLink = driver.findElement(By.id("login-button"));
        loginLink.click();

        String firstProductText = "Sauce Labs Backpack";
        String actualFirstText = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
        Assert.assertEquals(firstProductText, actualFirstText);
        System.out.println(actualFirstText);

        String secondProductText = "Sauce Labs Bike Light";
        String actualsecondProdText = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).getText();
        Assert.assertEquals(secondProductText, actualsecondProdText);
        System.out.println(actualFirstText);

        String thirdProductText = "Sauce Labs Bolt T-Shirt";
        String actualThirdProdText = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).getText();
        Assert.assertEquals(thirdProductText, actualThirdProdText);
        System.out.println("Third Product : " + actualThirdProdText);

        String fourthProductText = "Sauce Labs Fleece Jacket";
        String actualFourthProdText = driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']")).getText();
        Assert.assertEquals(fourthProductText, actualFourthProdText);
        System.out.println("Fourth Product : " + actualFourthProdText);

        String fifthProductText = "Sauce Labs Onesie";
        String actualFifthProdText = driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).getText();
        Assert.assertEquals(fifthProductText, actualFifthProdText);
        System.out.println("Fifth Product : " + actualFifthProdText);

        String sixthProductText = "Test.allTheThings() T-Shirt (Red)";
        String actualSixthProdText = driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']")).getText();
        Assert.assertEquals(sixthProductText, actualSixthProdText);
        System.out.println("Sixth Product : " + actualSixthProdText);

    }
}