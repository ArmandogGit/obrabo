package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Elementos.Elementos;

public class Metodos extends Elementos {

	WebDriver driver;

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	public void escrever(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();

	}

	public void validarTexto(String textoEsperado, By elemento) {
		String texto = driver.findElement(elemento).getText();

		assertEquals(textoEsperado, texto);

	}

	public void fecharNavegador() {
		driver.quit();

	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}

	public void Selecionar(By elemento) {

		WebElement element = driver.findElement(elemento);
		Select combo = new Select(element);
		combo.selectByValue("true");

	}

	public void screenShot(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, destFile);

	}
}
