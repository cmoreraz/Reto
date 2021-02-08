package net.phptravels.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLogin {

	public static Target txtCorreo 		= Target.the("Se ingresa correo ").located(By.name("email"));
	public static Target txtContrasena 	= Target.the("Se ingresa contrasena").located(By.name("password"));
	public static Target BtnIngresar 	= Target.the("Boton de sgn in").located(By.xpath("/html/body/div[2]/form[1]/button"));
}
