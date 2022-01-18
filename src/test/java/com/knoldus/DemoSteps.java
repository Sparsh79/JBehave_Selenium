package com.knoldus;

import org.jbehave.core.annotations.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSteps {

    WebDriver driver;

    @Given("I open Google")
    public void I_open_google() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

}
