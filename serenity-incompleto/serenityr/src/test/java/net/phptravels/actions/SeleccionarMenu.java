package net.phptravels.actions;

import net.phptravels.ui.PaginaPrincipal;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

/**
 * 
 * @author cmoreraz
 *
 */

public class SeleccionarMenu implements Task {
	
	private Target menuTarget;
	private Target subMenuTarget;
	private static String menuSeleccionado;
	private static String subMenuSeleccionado;
	

	public SeleccionarMenu( Target menu, Target subMenu ) {
		this.menuTarget = menu;
		this.subMenuTarget = subMenu;
	}
	
	public static Performable blog() {
		menuSeleccionado = "Menu blog";
		subMenuSeleccionado = "Categoria Blog";
		return Instrumented.instanceOf( SeleccionarMenu.class ).withProperties( PaginaPrincipal.MENU_BLOG, PaginaPrincipal.SUB_MENU_BLOG );
	}
	
	@Override
	@Step( "{0} Usuario selecciona el menu blog: #menuSeleccionado y submenu blog categoria: #subMenuSeleccionado" )
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo( Click.on( this.menuTarget));
		actor.attemptsTo( Click.on( this.subMenuTarget));
	}	

}
