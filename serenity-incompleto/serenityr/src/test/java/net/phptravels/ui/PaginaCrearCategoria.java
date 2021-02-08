package net.phptravels.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaCrearCategoria {
	
	public static final Target CATEGORY_NAME = Target.the( "Nombre categoria" ).located(By.xpath( "//*[@id=\"content\"]/div[2]/div[2]/div[1]/button"));
	public static final Target STATUS = Target.the( "Escojer status" ).located(By.name( "status"));
	public static final Target NAME_VIETNAMESE = Target.the( "Nombre en Vietnamese" ).located(By.name( "translated[vi][name]"));
	public static final Target NAME_RUSSIAN = Target.the( "Nombre en Russian" ).located(By.name( "translated[ru][name]"));
	public static final Target NAME_ARABIC 	= Target.the( "Nombre en Arabic" ).located(By.name( "translated[ar][name]"));
	public static final Target NAME_FARSI 	= Target.the( "Nombre en Farsi" ).located(By.name( "translated[fa][name]"));
	public static final Target NAME_TURKISH = Target.the( "Nombre en Turkish" ).located(By.name( "translated[tr][name]"));
	public static final Target NAME_FRENCH 	= Target.the( "Nombre en French" ).located(By.name( "translated[fr][name]"));
	public static final Target NAME_SPANISH = Target.the( "Nombre en Spanish" ).located(By.name( "translated[es][name]"));
	public static final Target NAME_GERMAN 	= Target.the( "Nombre en German" ).located(By.name( "translated[de][name]"));
	
	public static final Target BTN_ADD = Target.the( "Nombre en German" ).located(By.xpath( "//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[3]/button[2]"));

}
