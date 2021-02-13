package net.phptravels.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaBlogCategorias {

	//Se crean los atributos

	@FindBy( xpath = "//*[@id=\"content\"]/div[2]/div[2]/div[1]/button" )
	private WebElement btnAdd;

	@FindBy( xpath = "//*[@id=\"content\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[3]" )
	private WebElement tblCategorias;

	//Constructor
	public PaginaBlogCategorias( WebDriver driver ) {
		PageFactory.initElements( driver, this );
	}

	//Metodos personalizados
	public void clicBtnAdd( ) {
		btnAdd.click();
	}

}
