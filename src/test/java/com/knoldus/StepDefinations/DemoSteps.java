package com.knoldus.StepDefinations;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    @When("I search for my blogs")
    public void I_serach_for_my_blogs(){
        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Sparsh Bhardwaj blogs Knoldus");
        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(Keys.RETURN);

        driver.findElement(By.partialLinkText("Sparsh Bhardwaj, Author at Knoldus Blogs")).click();
    }

    @Then("I assert the URL")
    public void I_assert_the_URL(){
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://blog.knoldus.com/author/sparsh79/",currentURL);
    }
}
