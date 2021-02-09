package net.phptravels.pruebas;

import org.junit.Test;
import org.openqa.selenium.By;

public class CrearPosts extends BaseTestSuite {

	/**
	 * 
	 * @throws InterruptedException se puede presentar una excepcion en tiempo de ejecucion
	 */
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

		//Se recorre la lista de categorias
		paginaCrearPost.numCategoriaCreada();
		//Se suma el ultimo numero de la cat y se suma al xpath
		googleDriver.findElement(By.xpath("//*[@id=\"content\"]/form/div[2]/div/div/div[2]/div[2]/div/select/option["+ paginaCrearPost.numCategoriaCreada() + "]")).click();	
		Thread.sleep( 5000 );	
		paginaCrearPost.btnGuardar();	
		Thread.sleep( 5000 );


	}

}
