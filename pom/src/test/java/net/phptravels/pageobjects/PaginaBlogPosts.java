package net.phptravels.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaBlogPosts {

	
	@FindBy( xpath = "//*[@id=\"content\"]/div[2]/form/button" )
	private WebElement btnAdd;
	
	public void clicAdd( ) {
		btnAdd.click();
	}
	
	public PaginaBlogPosts( WebDriver driver ) {
		PageFactory.initElements( driver, this );
	}
}
