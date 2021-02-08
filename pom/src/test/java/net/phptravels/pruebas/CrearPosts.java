package net.phptravels.pruebas;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;

import net.phptravels.pageobjects.PaginaBlogPosts;
import net.phptravels.pageobjects.PaginaCrearPosts;

public class CrearPosts extends BaseTestSuite {

	@Test
	public void login( ) throws InterruptedException {

		googleDriver.get( "https://www.phptravels.net/admin" );

		paginaLogin.iniciarSesion();
		paginaAdministrador.seleccionarMenu();
		paginaAdministrador.seleccionarSubMenuCat();
		Thread.sleep( 5000 );
		paginaBlogCategorias.clicBtnAdd();
		Thread.sleep( 5000 );
		paginaCrearCategoria.nameCategoria();
		paginaCrearCategoria.llenarCampos();
		Thread.sleep( 5000 );
		paginaAdministrador.seleccionarSubMenuPosts();
		Thread.sleep( 5000 );
		paginaBlogPost.clicAdd();
		Thread.sleep( 5000 );
		paginaCrearPost.crearPost();
		Thread.sleep( 5000 );
		paginaCrearPost.numCategoriaCreada();
		googleDriver.findElement(By.xpath("//*[@id=\"content\"]/form/div[2]/div/div/div[2]/div[2]/div/select/option["+ paginaCrearPost.numCategoriaCreada() + "]")).click();	
		Thread.sleep( 5000 );	
		paginaCrearPost.btnGuardar();	
		Thread.sleep( 5000 );


	}

}
