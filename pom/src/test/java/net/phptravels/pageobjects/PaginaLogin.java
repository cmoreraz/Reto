package net.phptravels.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author cmoreraz
 *
 */

public class PaginaLogin {
	
	@FindBy( name = "email" )
	private WebElement txtCorreo;
	
	@FindBy( name = "password" )
	private WebElement txtContrasena;
	
	@FindBy( xpath = "/html/body/div[2]/form[1]/button" )
	private WebElement btnIngresar;
	
	public void iniciarSesion( ) {
		txtCorreo.sendKeys("admin@phptravels.com");
		txtContrasena.sendKeys("demoadmin");
		btnIngresar.click();
	}
	
	public PaginaLogin( WebDriver driver ) {
		PageFactory.initElements( driver, this );
	}

}
