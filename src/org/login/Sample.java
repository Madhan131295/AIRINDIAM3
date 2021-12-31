package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\22Dec\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com");

		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Madhan123");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("131295@madhan");

		WebElement loginBtn = driver.findElement(By.id("login"));
		loginBtn.click();
		
		
		WebElement location = driver.findElement(By.id("location"));
		Select ddLocation= new Select(location);
		ddLocation.selectByValue("Sydney");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select ddhotels= new Select(hotels);
		ddhotels.selectByVisibleText("Hotel Creek");
		
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select ddrmtype= new Select(roomtype);
		ddrmtype.selectByIndex(2);
		
		WebElement room_nos = driver.findElement(By.id("room_nos"));
		Select ddrmno=new Select(room_nos);
	    ddrmno.selectByIndex(3);
	    
	    WebElement roomdate = driver.findElement(By.id("datepick_in"));
		 roomdate.sendKeys("22/12/2021");
		 
		 WebElement roomout = driver.findElement(By.id("datepick_out"));
		 roomout.sendKeys("23/12/2021");
		 
		 WebElement adultroom = driver.findElement(By.id("adult_room"));
	     Select select=new Select (adultroom);
	     select.selectByIndex(2);
	     
	     WebElement childroom = driver.findElement(By.id("child_room"));
	     Select select1=new Select (childroom);
	     select1.selectByIndex(3);
	     
	     WebElement search = driver.findElement(By.id("Submit"));
		 search.click();
		 
		 WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		 radiobutton.click();
		 
		 WebElement button = driver.findElement(By.id("continue"));
		 button.click();
		 
		 
		 WebElement name = driver.findElement(By.id("first_name"));
		 name.sendKeys("Madhan");
		 
		 
		 WebElement name1 = driver.findElement(By.id("last_name"));
		 name1.sendKeys("kumar");
		 
		 WebElement Billingaddress = driver.findElement(By.id("address"));
		 Billingaddress.sendKeys("Greens omr");
		 
		 WebElement creditcard = driver.findElement(By.id("cc_num"));
		 creditcard.sendKeys("4756 5607 8718 0012");
		 
		 WebElement creditcardtype = driver.findElement(By.id("cc_type"));
	     Select select2=new Select (creditcardtype);
	     select2.selectByIndex(2);
	     
	     
	     WebElement month = driver.findElement(By.id("cc_exp_month"));
	     Select select3=new Select (month);
	     select3.selectByIndex(2); 
	     
	     WebElement year = driver.findElement(By.id("cc_exp_year"));
	     Select select4=new Select (year);
	     select4.selectByIndex(12); 
	     
	     WebElement cvv = driver.findElement(By.id("cc_cvv"));
		 cvv.sendKeys("131");
		 
		 WebElement button1 = driver.findElement(By.id("book_now"));
		 button1.click();
		 
		 WebElement findElement5 = driver.findElement(By.id("order_no"));
	     String data = findElement5.getAttribute("value");
	     System.out.println(data);
	     
	     
		  
		 
		 
		 
		 
		 
		 
	     
	           
		    
		 
		
		
		
		
		
		
		
		
		

	}

}

