package net.phptravels.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaCrearPosts {

	WebDriver driver;

	@FindBy( name = "title" )
	private WebElement txtTitulo;

	@FindBy( name = "slug" )
	private WebElement txtURL;

	@FindBy( name = "/html/body/p" )
	private WebElement txtDescripcion;

	@FindBy( xpath = "//*[@id=\"content\"]/form/div[2]/div/div/div[2]/div[2]/div/select" )
	private WebElement cboCategoria;

	@FindBy( name = "keywords")
	private WebElement txtPalabra;

	@FindBy( name = "metadesc" )
	public WebElement txtDescrip;

	@FindBy( xpath = "//*[@id=\"content\"]/form/div[1]/div/div[2]/button" )
	private WebElement btnGuardar;

	public void crearPost( ) {

		txtTitulo.sendKeys( "Automatizacion" );
		txtURL.sendKeys( "https://www.phptravels.net//blog/" );	
		txtPalabra.sendKeys("Validar");
		txtDescrip.sendKeys( "Validar funcionamiento al asociar categoria creada" );
	}

	public int numCategoriaCreada( ) {		
		String lista = cboCategoria.getText();
		
		List<WebElement> l = cboCategoria.findElements(By.tagName("option"));
		int i = 0;
		if (l != null) {
			for (i = 0; i < l.size(); i++) {
			}
		}
		return i;
	}

	public void btnGuardar( ) {
		btnGuardar.click();
	}

	public PaginaCrearPosts( WebDriver driver ) {
		PageFactory.initElements( driver, this );
	}

}
