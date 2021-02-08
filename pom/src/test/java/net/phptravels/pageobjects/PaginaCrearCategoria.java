package net.phptravels.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaCrearCategoria {
	
	@FindBy( name = "name" )
	private WebElement txtCategoryName;
	
	@FindBy( name = "status" )
	private WebElement cboStatus;
	
	@FindBy( name = "translated[vi][name]" )
	private WebElement txtNameVietnamese;
	
	@FindBy( name = "translated[ru][name]" )
	private WebElement txtNameRussian;
	
	@FindBy( name = "translated[ar][name]" )
	private WebElement txtNameArabic;
	
	@FindBy( name = "translated[fa][name]" )
	private WebElement txtNameFarsi;
	
	@FindBy( name = "translated[tr][name]" )
	private WebElement txtNameTurkish;
	
	@FindBy( name = "translated[fr][name]" )
	private WebElement txtNameFrench;
	
	@FindBy( name = "translated[es][name]" )
	private WebElement txtNameSpanish;
	
	@FindBy( name = "translated[de][name]" )
	private WebElement txtNameGerman;
	
	@FindBy( xpath = "//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[3]/button[2]" )
	private WebElement btnAdd;
	
	public String nameCategoria( ) {
		txtCategoryName.sendKeys("Finanzas");
		return txtCategoryName.getText();
	}
	public void llenarCampos( ) {		
		
		txtNameVietnamese.sendKeys("A");
		txtNameRussian.sendKeys("B");
		txtNameArabic.sendKeys("C");
		txtNameFarsi.sendKeys("D");
		txtNameTurkish.sendKeys("E");
		txtNameFrench.sendKeys("F");
		txtNameSpanish.sendKeys("G");
		txtNameGerman.sendKeys("H");
		
		btnAdd.click();
	}
	
	public PaginaCrearCategoria( WebDriver driver ) {
		PageFactory.initElements( driver, this );
	}

	public WebElement getTxtCategoryName() {
		return txtCategoryName;
	}

	public void setTxtCategoryName(WebElement txtCategoryName) {
		this.txtCategoryName = txtCategoryName;
	}
	
	public String categoriaCreada( ) {
		return txtCategoryName.getText();
 
	}

}
