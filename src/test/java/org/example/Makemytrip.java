package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Makemytrip extends Mmthelper
{
    @Test
    public void login()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenuim grid\\chromedrive.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        WebElement username = getDriver().findElement(By.xpath("//input[@placeholder='From']"));
        username.sendKeys("New Delhi");

        WebElement password = getDriver().findElement(By.xpath("//input[@placeholder='To']"));
        password.sendKeys("Nagpur");

        WebElement search = getDriver().findElement(By.xpath("//a[@class=primaryBtn font24 latoBold widgetSearchBtn]"));
        search.click();

    }

}
