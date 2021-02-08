package net.phptravels.pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy( xpath = "//*[@id=\"content\"]/form/div[2]/div/div/div[2]/div[2]/div/select/option[6]")
	private WebElement seleccion;
	
	@FindBy( name = "keywords")
	private WebElement txtPalabra;
	
	@FindBy( name = "metadesc" )
	public WebElement txtDescrip;
	
	@FindBy( xpath = "//*[@id=\"content\"]/form/div[1]/div/div[2]/button" )
	private WebElement btnGuardar;
	
	public void crearPost( ) {
		
		txtTitulo.sendKeys( "Automatizacion" );
		txtURL.sendKeys( "www.test.com" );	
		cboCategoria.click();
		seleccion.click();
		txtPalabra.sendKeys("Validar");
		txtDescrip.sendKeys( "Validar funcionamiento al asociar categoria creada" );
		btnGuardar.click();
	}
	
	public PaginaCrearPosts( WebDriver driver ) {
		PageFactory.initElements( driver, this );
	}

}
