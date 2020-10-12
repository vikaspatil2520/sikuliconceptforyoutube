package com.practice.sikuliconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class YouTubeTest {
	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "D:\\testing-vikas\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
/*
		driver.get("https://www.youtube.com/watch?v=07d2dXHYb94");

		Thread.sleep(10000);

		// create the object of screen class
		Screen screen = new Screen();

		 add externally jar 

		// click on play button
		// Pattern playImg=new
		// Pattern("D:\\testing-workspace\\sikuliconcept\\yt_play.PNG");
		screen.find("D:\\testing-workspace\\sikuliconcept\\yt_play.PNG");
		screen.click("D:\\testing-workspace\\sikuliconcept\\yt_play.PNG");
		System.out.println("clicked on play button");

		Thread.sleep(20000);

		// click on pause button
		screen.find("D:\\testing-workspace\\sikuliconcept\\yt_pause.PNG");
		screen.click("D:\\testing-workspace\\sikuliconcept\\yt_pause.PNG");
		System.out.println("clicked on pause button");

		// click on setting button
		screen.find("D:\\testing-workspace\\sikuliconcept\\yt_setting.PNG");
		screen.click("D:\\testing-workspace\\sikuliconcept\\yt_setting.PNG");
		System.out.println("clicked on setting button");

		Thread.sleep(200);
		
		// click on quality button
		screen.find("D:\\testing-workspace\\sikuliconcept\\yt_quality.PNG");
		screen.click("D:\\testing-workspace\\sikuliconcept\\yt_quality.PNG");
		System.out.println("clicked on quality button");

		Thread.sleep(5000);
		
		// click on HD button
		screen.find("D:\\testing-workspace\\sikuliconcept\\yt_1024HD.png");
		screen.click("D:\\testing-workspace\\sikuliconcept\\yt_1024HD.png");
		System.out.println("clicked on HD button");
		
		// click on play button
		screen.find("D:\\testing-workspace\\sikuliconcept\\yt_play.PNG");
		screen.click("D:\\testing-workspace\\sikuliconcept\\yt_play.PNG");
		System.out.println("clicked on play button");
		
		Thread.sleep(5000);*/
		
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("jav");
		Screen screen = new Screen();
		screen.find("D:\\testing-workspace\\sikuliconcept\\googleSearchBtn.png");
		screen.click("D:\\testing-workspace\\sikuliconcept\\googleSearchBtn.png");
		System.out.println("clicked on google search button");
	}
}
