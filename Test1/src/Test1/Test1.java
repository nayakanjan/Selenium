//----------------------------------------------
//AUTHOR:ANJAN Kumar NAYAK
//------------------------------------------------
package Test1;
//
//Author: ANJAN NAYAK
////

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
//
public class Test1 {
	
	  static void myMethod(String fname, int age) {
		    System.out.println(fname + " is " + age);
		  }

		  


	public static void main(String[] args) {
		
		myMethod("anjan", 5);
		

        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:/ANJAN/Automation/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:/ANJAN/Automation/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one +and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        // Type in the username
        driver.findElement(By.name("userName")).sendKeys("mercury");

        // Type in the password
        
        
        driver.findElement(By.name("password")).sendKeys("abc");

        // Click the Submit button
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.linkText("Flights")).click();
        driver.findElement(By.cssSelector("font:nth-child(1) > input:nth-child(2)")).click();
         @SuppressWarnings("unused")
		Select nopsg=new Select(driver.findElement(By.name("passCount")));
         nopsg.selectByValue("6");
     	Select city=new Select(driver.findElement(By.name("fromPort")));
        city.selectByValue("London");
    	Select month=new Select(driver.findElement(By.name("fromMonth")));
        month.selectByValue("May");
   
    
     
//        //close Fire fox
    driver.close();
             
        //driver.findElement(By.name=)
    }    
}


