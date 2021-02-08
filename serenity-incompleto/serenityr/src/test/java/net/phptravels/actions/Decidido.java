package net.phptravels.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.phptravels.constant.UrlPagina;

/**
 * 
 * @author cmoreraz
 *
 */

public class Decidido implements Task {

    public Decidido() {
    }

    public static Performable ingresarUsuarioYcontrasena() {
        return instrumented(Decidido.class);
    }


    @Override
    @Step("{0} ha decidido ingresar con su cuenta")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Navegar.hacia( UrlPagina.urlPaginaPhpTravels ));
    }


}