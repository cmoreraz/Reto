package net.phptravels.actions;

import net.phptravels.ui.PaginaCategoriaBlog;
import net.phptravels.ui.PaginaPrincipal;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class CategoriaBlog implements Task {
	
	private Target btnAdd;
	private static String btnSeleccionado;
	

	public CategoriaBlog( Target btn ) {
		this.btnAdd = btn;
	}
	
	public static Performable add() {
		btnSeleccionado = "Boton adicionar categoria";
		return Instrumented.instanceOf( CategoriaBlog.class ).withProperties( PaginaCategoriaBlog.BTN_ADD );
	}
	
	@Override
	@Step( "{0} Usuario selecciona el boton: #btnSeleccionado" )
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo( Click.on( this.btnAdd));
	}
}
