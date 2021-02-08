package net.phptravels.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaCategoriaBlog {
	
	public static final Target BTN_ADD = Target.the( "Menu Blog pagina principal" ).located(By.xpath( "//*[@id=\"content\"]/div[2]/div[2]/div[1]/button"));

}
