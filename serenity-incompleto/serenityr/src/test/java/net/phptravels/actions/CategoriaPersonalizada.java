package net.phptravels.actions;

import org.openqa.selenium.Keys;

import net.phptravels.actions.IngresarCon.IngresarConBuilder;
import net.phptravels.ui.PaginaCrearCategoria;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

/**
 * 
 * @author cmoreraz
 *
 */

public class CategoriaPersonalizada implements Task {

	private final String categoriaName;
	private final String status;
	private final String nameVi;
	private final String nameRu;
	private final String nameAr;
	private final String nameFa;
	private final String nameTu;
	private final String nameFr;
	private final String nameEs;
	private final String nameGe;

	public CategoriaPersonalizada(String categoriaName, String status, String nameVi, String nameRu, String nameAr,
			String nameFa, String nameTu, String nameFr, String nameEs, String nameGe) {
		this.categoriaName = categoriaName;
		this.status = status;
		this.nameVi = nameVi;
		this.nameRu = nameRu;
		this.nameAr = nameAr;
		this.nameFa = nameFa;
		this.nameTu = nameTu;
		this.nameFr = nameFr;
		this.nameEs = nameEs;
		this.nameGe = nameGe;
	}

	 public static IngresarConBuilder usuario(String usuario) {
	        return new IngresarConBuilder(usuario);
	    }
	 
	@Override
	@Step( "{0} Usuario ingresa a la pagina adicionar categoria" )
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				//Enter.theValue(categoriaName).into(PaginaCrearCategoria.CATEGORY_NAME).thenHit(Keys.TAB),
				//Enter.theValue(status).into(PaginaCrearCategoria.STATUS).thenHit(Keys.TAB),
				//Enter.theValue(nameVi).into(PaginaCrearCategoria.NAME_VIETNAMESE).thenHit(Keys.TAB),
				//Enter.theValue(nameRu).into(PaginaCrearCategoria.NAME_RUSSIAN).thenHit(Keys.TAB),
				//Enter.theValue(nameAr).into(PaginaCrearCategoria.NAME_ARABIC).thenHit(Keys.TAB),
				//Enter.theValue(nameFa).into(PaginaCrearCategoria.NAME_FARSI).thenHit(Keys.TAB),
				//Enter.theValue(nameTu).into(PaginaCrearCategoria.NAME_TURKISH).thenHit(Keys.TAB),
				//Enter.theValue(nameFr).into(PaginaCrearCategoria.NAME_FRENCH).thenHit(Keys.TAB),
				//Enter.theValue(nameEs).into(PaginaCrearCategoria.NAME_SPANISH).thenHit(Keys.TAB),
				//Enter.theValue(nameGe).into(PaginaCrearCategoria.NAME_GERMAN).thenHit(Keys.TAB),
				Click.on( PaginaCrearCategoria.BTN_ADD));				
	}
	
    public static class IngresarConBuilder{
        private String usuario;

        public IngresarConBuilder(String usuario){
            this.usuario = usuario;
        }

        public Performable contraseña(String contraseña){
            return Instrumented.instanceOf(IngresarCon.class)
                    .withProperties(usuario,contraseña);
        }
    }
	

}


