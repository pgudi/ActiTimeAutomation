package com.sgtesting.tests.testcases;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Testcases {
	
	private static WebDriver oBrowser=null;
    @Test(priority = 1)
    public void launchBrowser()
    {
    	
		try
		{
			oBrowser=new ChromeDriver();
            Thread.sleep(5000);
		}catch(Exception e)
        {
            e.printStackTrace();
        }
    }
   
    @Test (priority = 2)
    public void navigateURL()
    {
        try
        {
        	oBrowser.get("http://localhost/login.do");
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
     
    @Test (priority = 3)
    public void login()
    {
        try
        {
           oBrowser.findElement(By.id("username")).sendKeys("admin");
           oBrowser.findElement(By.name("pwd")).sendKeys("manager");
           oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
           Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    @Test(priority = 4)
    public void minimizeFlyOutWindow()
    {
        try
        {
            oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void createUser()
    {
        try
        {
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.name("firstName")).sendKeys("demo");
            oBrowser.findElement(By.name("lastName")).sendKeys("User1");
            oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
            oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
            oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();;
        }
    }

    @Test(priority = 6)
    public void deleteUser()
    {
        try
        {
            oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
            Thread.sleep(2000);
            Alert oalert=oBrowser.switchTo().alert();
            System.out.println(oalert.getText());
            Thread.sleep(2000);
            oalert.accept();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();;
        }
    }

    @Test(priority = 7)
    public void logout()
    {
    	try
    	{
    		oBrowser.findElement(By.linkText("Logout")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
        {
            e.printStackTrace();;
        }
    }

    @Test(priority = 8)
    public void closeApp()
    {
    	try
    	{
    		oBrowser.quit();
    		Thread.sleep(2000);
    	}catch(Exception e)
        {
            e.printStackTrace();;
        }
    }
}
