package worksite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DSL {

	
	private WebDriver driver;
	public DSL dsl;
	
	public DSL(WebDriver driver) {
		this.driver = driver;
	}
	
	/********* Escrever ************/
	
	public void escreverId(String id, String text) {
		driver.findElement(By.id(id)).sendKeys(text);
	}
	
	public void escreverXpath(String xpath, String text) {
		driver.findElement(By.xpath(xpath)).sendKeys(text);
		
	}
	
	
/********* TextField e TextArea ************/
	
	
	public void clicarRadio(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public boolean isRadioMarcado(String id){
		return driver.findElement(By.id(id)).isSelected();
	}
	
	public void clicarCheck(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public boolean isCheckMarcado(String id){
		return driver.findElement(By.id(id)).isSelected();
	}
	
	
	
	/********* Botao ************/
	
	public void clicarBotaoId(String id) {
		driver.findElement(By.id(id)).click();
	}
	

	public void clicarBotaoXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		
	}
	
	public String obterValueElemento(String id) {
		return driver.findElement(By.id(id)).getAttribute("value");
	}
	
	/********* Link ************/
	
	public void clicarLink(String link) {
		driver.findElement(By.linkText(link)).click();
	}
	
	/********* Esperas ************/
	
	
	public void esperaImplicitaSegundos (Integer segundos) {
		driver.manage().timeouts().implicitlyWait(segundos,TimeUnit.SECONDS);
	}
	
	public void esperaFixa7Segundos() throws InterruptedException {
		Thread.sleep(7000);
	}


	
}
