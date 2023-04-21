package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class AppTest{
    ChromeDriver driver = new ChromeDriver();
    @BeforeClass
    void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize();
        Thread.sleep(10000);
    }
    @Test
    public void googleTest() throws InterruptedException
    {
        driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[contains(text(),'SQL')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[contains(text(),'JUnit')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[contains(text(),'JQuery')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/label[1]/input[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/label[4]/input[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[1]/form[1]/input[5]")).click();
        Thread.sleep(1000);
    }
//    @AfterClass
//    void close()
//    {
//        driver.close();
//    }
}
