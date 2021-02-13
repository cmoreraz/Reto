package net.phptravels.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaBlogPosts {

	//Se crean los atributos

	@FindBy( xpath = "//*[@id=\"content\"]/div[2]/form/button" )
	private WebElement btnAdd;

	//Constructor
	public PaginaBlogPosts( WebDriver driver ) {
		PageFactory.initElements( driver, this );
	}

	//Metodos personalizados
	public void clicAdd( ) {
		btnAdd.click();
	}


}
