package worksite;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	private WebDriver driver;
	private DSL dsl;

	@Before
	public void inicializa(){
			System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().setSize(new Dimension(1200,766));
			driver.get("https://sitebeta.s1platform.com/buy");
			dsl = new DSL(driver);
	}
	
	//@After
	public void finaliza(){
		driver.quit();
	}
	
	@Test	
	public void fazerLogin() throws InterruptedException {
		dsl.esperaImplicitaSegundos(7);
		dsl.escreverId("username", "testes1@icatu");
		dsl.escreverId("password", "$Solutions1");
		dsl.clicarBotaoXpath("//div[@class='md-button-content'][text()='Logar']");
		
	}
	



}


	
	
	


