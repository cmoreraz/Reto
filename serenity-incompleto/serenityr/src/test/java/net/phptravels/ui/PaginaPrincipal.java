package net.phptravels.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal {

	public static final Target MENU_BLOG = Target.the( "Menu Blog pagina principal" ).located(By.xpath( "//*[@id=\"social-sidebar-menu\"]/li[14]/a"));
	public static final Target SUB_MENU_BLOG = Target.the( "SubMenu Blog categoria pagina principal" ).located(By.xpath( "//*[@id=\"Blog\"]/li[2]/a"));
	public static final Target SUB_MENU_POST = Target.the( "SubMenu Blog categoria pagina principal" ).located(By.xpath( "//*[@id=\"Blog\"]/li[1]/a"));

}
