package net.phptravels;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.phptravels.actions.Decidido;
import net.phptravels.actions.IngresarCon;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

/**
 * 
 * @author cmoreraz
 *
 */

@RunWith(SerenityRunner.class)
public class LoginUsuario {

    Actor actor;

    @Managed
    WebDriver navegador;

    @Before
    public void prepararEscenario(){
        actor = Actor.named("Cristian");

        actor.can( BrowseTheWeb.with( navegador ));
    }

    @Test
    public void ingresarAMyAccountCorrectamente(){

        actor.has(Decidido.ingresarUsuarioYcontrasena());

        actor.attemptsTo(IngresarCon.usuario("admin@phptravels.com").contraseña("demoadmin"));

    }

}