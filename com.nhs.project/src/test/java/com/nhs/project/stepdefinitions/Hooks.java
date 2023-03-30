package com.nhs.project.stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import envReader.EnvReader;


public class Hooks
{
    public static WebDriver driver;
    public static String OS = "windows";
    public static String browser = "chrome";
    
    Scenario scenario;


    @Before
    public void beforeStartUp(Scenario scenario) throws IOException
    {
    	OS = System.getProperty("OS");
    	browser = System.getProperty("browser");
    	
    	System.out.println(" OS "+System.getProperty("OS"));
    	System.out.println(" browser "+System.getProperty("browser"));
    	
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//" + EnvReader.getProperty("chrome_windows"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    	
		/*
		 * if (OS.equalsIgnoreCase("MAC")) { if (browser.equalsIgnoreCase("chrome")) {
		 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		 * + "//" + EnvReader.getProperty("chrome_mac")); driver = new ChromeDriver();
		 * driver.manage().window().maximize(); }
		 * 
		 * else if (browser.equalsIgnoreCase("firefox")) { driver = new FirefoxDriver();
		 * driver.manage().window().maximize(); } }
		 * 
		 * else if (OS.equalsIgnoreCase("Windows")) { if
		 * (browser.equalsIgnoreCase("chrome")) {
		 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		 * + "//" + EnvReader.getProperty("chrome_windows")); driver = new
		 * ChromeDriver(); driver.manage().window().maximize(); }
		 * 
		 * else if (browser.equalsIgnoreCase("firefox")) {
		 * System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
		 * "//" + EnvReader.getProperty("firefox_windows")); driver = new
		 * FirefoxDriver(); driver.manage().window().fullscreen(); }
		 */
    	//}
  }


    @After
    public void after (Scenario scenario) throws IOException
    {
        // ---------- Takes screenshot if Scenario Fails  -------------------- //
        if (scenario.isFailed() && !EnvReader.getProperty("Browser").equalsIgnoreCase("htmlunit") )
        {
            File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                   FileUtils.copyFile(scrFile, new File("target/site/screenshots/"+scenario.getName()+".png"));
                }
                catch (IOException e)
                {
                  e.printStackTrace();
                }

            /* Embend the screenshot if test failes*/
            try {
                  scenario.write("Current Page URL is " + driver.getCurrentUrl());
                  // byte[] screenshot = getScreenshotAs(OutputType.BYTES);
                  byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                  scenario.embed(screenshot, "image/png");
                }
             catch (WebDriverException somePlatformsDontSupportScreenshots)
             {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
             }
        }
        
       driver.quit();
     }
}