package net.phptravels.pruebas;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.phptravels.pageobjects.PaginaAdministrador;
import net.phptravels.pageobjects.PaginaBlogCategorias;
import net.phptravels.pageobjects.PaginaBlogPosts;
import net.phptravels.pageobjects.PaginaCrearCategoria;
import net.phptravels.pageobjects.PaginaCrearPosts;
import net.phptravels.pageobjects.PaginaLogin;

/**
 * 
 * @author cmoreraz
 *
 */

public class BaseTestSuite {

	//Se crean los atributos

	protected WebDriver googleDriver;

	protected PaginaLogin paginaLogin;
	protected PaginaAdministrador 	paginaAdministrador;
	protected PaginaBlogCategorias 	paginaBlogCategorias;
	protected PaginaCrearCategoria 	paginaCrearCategoria;
	protected PaginaBlogPosts		paginaBlogPost;
	protected PaginaCrearPosts		paginaCrearPost;

	//Metodos personalizados
	public void inicializarPaginas( ) {

		paginaLogin 			= new PaginaLogin( googleDriver );
		paginaAdministrador 	= new PaginaAdministrador( googleDriver );
		paginaBlogCategorias 	= new PaginaBlogCategorias( googleDriver );
		paginaCrearCategoria	= new PaginaCrearCategoria( googleDriver );
		paginaBlogPost			= new PaginaBlogPosts( googleDriver );
		paginaCrearPost			= new PaginaCrearPosts( googleDriver );
	}

	@Before
	public void abrirNavegador( ) {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\webdriver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		googleDriver = new ChromeDriver(options);
		googleDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		inicializarPaginas( );
		
		googleDriver.get( "https://www.phptravels.net/admin" );		
	}

	@After
	public void cerrarNavegador( ) {
		googleDriver.quit();
	}

}
