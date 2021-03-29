package br.ce.wcaquino.runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/report-html", "json:target/report.json"}, 
features = "src/test/resources/features/inserir_conta.feature",
glue = "br.ce.wcaquino.steps",
tags= {"~@ignore"},
monochrome = true,
snippets = SnippetType.CAMELCASE,
dryRun = false,
strict = false)

public class RunnerTest {
	
	@BeforeClass
	public static void reset() {
		System.setProperty("webdriver.chrome.driver", "/home/adrieldev/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me");
		
		driver.findElement(By.id("email")).sendKeys("adrielgraminho@gmail.com");
		driver.findElement(By.name("senha")).sendKeys("c13082003");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();


	}
}
