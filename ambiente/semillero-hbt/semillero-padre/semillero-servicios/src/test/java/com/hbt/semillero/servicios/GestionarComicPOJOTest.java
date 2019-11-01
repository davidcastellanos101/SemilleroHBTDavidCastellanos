/**
 * GestionarComicPOJOTest.java
 */
package com.hbt.semillero.servicios;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.dto.ComicDTO;
import com.heinsohn.semillero.pojo.GestionarComicPOJO;

/**
 * <b>Descripción:<b> Clase que prueba los métodos de la clase
 * GestionarComicPOJO <b>Caso de Uso:<b>
 * 
 * @author David Castellanos
 * @version
 */
public class GestionarComicPOJOTest {

	private GestionarComicPOJO gestion;

	/**
	 * 
	 * Metodo encargado de inicializar el escenario #1 de pruebas <b>Caso de Uso</b>
	 * 
	 * @author Dave
	 *
	 */
	private void escenario1() {
		gestion = new GestionarComicPOJO();

		ComicDTO comicDTO = new ComicDTO();
		comicDTO.setId("1");
		comicDTO.setNombre("Dragon Ball Yamcha");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematicaEnum("AVENTURAS");
		comicDTO.setColeccion("Manga Shonen");
		comicDTO.setNumeroPaginas(144);
		comicDTO.setPrecio(new BigDecimal(2100));
		comicDTO.setAutores("Dragon Garow Lee");
		comicDTO.setAcolor(Boolean.FALSE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstado("ACTIVO");
		comicDTO.setCantidad(20L);

		gestion.agregarComicDTOLista(comicDTO);

		comicDTO = new ComicDTO();
		comicDTO.setId("2");
		comicDTO.setNombre("Captain America Corps 1-5 USA");
		comicDTO.setEditorial("Panini Comics ");
		comicDTO.setTematicaEnum("FANTASTICO");
		comicDTO.setColeccion("BIBLIOTECA MARVEL ");
		comicDTO.setNumeroPaginas(128);
		comicDTO.setPrecio(new BigDecimal(5000));
		comicDTO.setAutores("Phillippe Briones, Roger Stern");
		comicDTO.setAcolor(Boolean.FALSE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstado("ACTIVO");
		comicDTO.setCantidad(5L);

		gestion.agregarComicDTOLista(comicDTO);

		comicDTO = new ComicDTO();
		comicDTO.setId("3");
		comicDTO.setNombre("The Spectacular Spider-Man v2 USA");
		comicDTO.setEditorial("Panini Comics ");
		comicDTO.setTematicaEnum("FANTASTICO");
		comicDTO.setColeccion("MARVEL COMICS");
		comicDTO.setNumeroPaginas(208);
		comicDTO.setPrecio(new BigDecimal(6225));
		comicDTO.setAutores("Straczynski,Deodato Jr.,Barnes,Eaton");
		comicDTO.setAcolor(Boolean.TRUE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstado("INACTIVO");
		comicDTO.setCantidad(0L);

		gestion.agregarComicDTOLista(comicDTO);

	}

	/**
	 * 
	 * Metodo encargado de probar el método agregarComicDTO de la clase
	 * GestionarComicPOJO 
	 * <b>Caso de Uso</b>
	 * 
	 * @author David Castellanos
	 *
	 */
	@Test(enabled = true)
	public void agregarComicDTOTest() {
		escenario1();

		Assert.assertNotNull(gestion.getListaComics());
		Assert.assertTrue(!gestion.getListaComics().isEmpty());
		Assert.assertTrue(gestion.getListaComics().size() == 3);
		Assert.assertEquals(3, gestion.getListaComics().size());
	}

	/**
	 * 
	 * Metodo encargado de probar el método modificarNombreComicDTO de la clase
	 * GestionarComicPOJO 
	 * <b>Caso de Uso</b>
	 * 
	 * @author David Castellanos
	 *
	 */
	@Test(enabled = true)
	public void modificarNombreComicDTOTest() {
		escenario1();
		
		gestion.modificarNombreComicDTO("2", "nuevo nombre");
		
		Assert.assertEquals(3, gestion.getListaComics().size());
		Assert.assertNotEquals(gestion.buscarComicDTO("2").getNombre(), "Captain America Corps 1-5 USA");
		Assert.assertEquals(gestion.buscarComicDTO("2").getNombre(), "nuevo nombre");
	}
	
	/**
	 * 
	 * Metodo encargado de probar el método eliminarComicDTO de la clase
	 * GestionarComicPOJO 
	 * <b>Caso de Uso</b>
	 * 
	 * @author David Castellanos
	 *
	 */
	@Test(enabled = true)
	public void eliminarComicDTOTest() {
		escenario1();
		
		Assert.assertEquals(3, gestion.getListaComics().size());
		
		gestion.eliminarComicDTO("1");
		
		Assert.assertTrue(!gestion.getListaComics().isEmpty());
		Assert.assertEquals(2, gestion.getListaComics().size());
		Assert.assertNull(gestion.buscarComicDTO("1"));
		Assert.assertNotNull(gestion.buscarComicDTO("2"));
		Assert.assertNotNull(gestion.buscarComicDTO("3"));

	}

}
