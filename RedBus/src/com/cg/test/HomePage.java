package com.cg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private static WebElement booking;
	public static WebElement source(WebDriver driver) {
		booking=driver.findElement(By.id("src"));
		return booking;
	}
public static WebElement destination(WebDriver driver) {
		booking=driver.findElement(By.id("dest"));
		return booking;
	}


}
