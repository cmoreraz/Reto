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

public class PaginaAdministrador {
	
	//Se crean los atributos
	
	@FindBy( partialLinkText = "BLOG" )
	private WebElement btnBlog;
	
	@FindBy( xpath = "//*[@id=\"Blog\"]/li[2]/a" )
	private WebElement btnBlogCategoria;
	
	@FindBy( xpath = "//*[@id=\"Blog\"]/li[1]/a" )
	private WebElement btnBlogPosts;
	
	//Constructor
	public PaginaAdministrador( WebDriver driver ) {
		PageFactory.initElements( driver, this );
	}
	
	//Metodos personalizados
	public void seleccionarMenu( ) {
		btnBlog.click();		
	}
	
	public void seleccionarSubMenuCat( ) {
		btnBlog.click();
		btnBlogCategoria.click();		
	}
	
	public void seleccionarSubMenuPosts( ) {
		btnBlog.click();
		btnBlogPosts.click();		
	}

}
