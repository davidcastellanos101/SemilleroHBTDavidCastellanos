package com.hbt.semillero.servicios;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.EstadoEnum;
import com.heinsohn.semillero.pojo.GestionarComicPOJO;

/**
 * 
 * <b>Descripción:<b> Clase encargada de ejecutar las pruebas unitarias <b>Caso
 * de Uso:<b>
 * 
 * @author David Castellanos
 * @version
 */
public class AppTest {

	public void shouldAnswerWithTrue() {

	}

	/**
	 * 
	 * Metodo encargado de invertir una cadena <b>Caso de Uso</b>
	 * 
	 * @author David Castellanos
	 * 
	 * @param cadena cadena a invertir
	 * @return cadena invertida
	 */
	private String invertirCadena(String cadena) {

		String cadenaInvertida = "";

		for (int x = cadena.length() - 1; x >= 0; x--) {

			cadenaInvertida = cadenaInvertida + cadena.charAt(x);

		}

		return cadenaInvertida;

	}

	/**
	 * 
	 * Metodo encargado de <b>Caso de Uso</b>
	 * 
	 * @author David Castellanos
	 *
	 */
	@Test(enabled = false)
	public void primeraPU() {
		Long a = 100L;
		Long b = 50L;
		Long resultadoEsperado = 150L;
		Long resultado = a + b;

		Assert.assertEquals(resultado, resultadoEsperado);
	}

	/**
	 * 
	 * Metodo encargado de probar el método invertirCadena(String cadena) <b>Caso de
	 * Uso</b>
	 * 
	 * @author David Castellanos
	 *
	 */
	@Test(enabled = false)
	public void segundaPU() {
		String resultado = invertirCadena("");
		String resultadoEsperado = "";
		Assert.assertEquals(resultadoEsperado, resultado,
				"Se esperaba '" + resultadoEsperado + "' pero el método retornó '" + resultado + "'");

		resultado = invertirCadena(" ");
		resultadoEsperado = " ";
		Assert.assertEquals(resultadoEsperado, resultado,
				"Se esperaba '" + resultadoEsperado + "' pero el método retornó '" + resultado + "'");

		resultado = invertirCadena("  ");
		resultadoEsperado = "  ";
		Assert.assertEquals(resultadoEsperado, resultado,
				"Se esperaba '" + resultadoEsperado + "' pero el método retornó '" + resultado + "'");

		resultado = invertirCadena("");
		Assert.assertNotNull(resultado, "No se esperaba valor NULL");

		resultado = invertirCadena(" ");
		Assert.assertNotNull(resultado, "No se esperaba valor NULL");

		resultado = invertirCadena("  ");
		Assert.assertNotNull(resultado, "No se esperaba valor NULL");

		resultado = invertirCadena("");
		Assert.assertTrue(resultado.length() == 0,
				"Se esperaban 0 caracteres pero el método retorno " + resultado.length());

		resultado = invertirCadena("      ");
		Assert.assertTrue(resultado.length() == 6,
				"Se esperaban 6 caracteres pero el método retornó " + resultado.length());

		resultado = invertirCadena("asdf");
		resultadoEsperado = "fdsa";
		Assert.assertEquals(resultadoEsperado, resultado,
				"Se esperaba '" + resultadoEsperado + "' pero el método retornó '" + resultado + "'");

		resultado = invertirCadena("a ");
		resultadoEsperado = " a";
		Assert.assertEquals(resultadoEsperado, resultado,
				"Se esperaba '" + resultadoEsperado + "' pero el método retornó '" + resultado + "'");

		resultado = invertirCadena("David");
		resultadoEsperado = "divaD";
		Assert.assertTrue(resultado.equals(resultadoEsperado),
				"Se esperaba '" + resultadoEsperado + "' pero el método retornó '" + resultado + "'");

		Assert.assertTrue(resultado.length() == 5,
				"Se esperaban 5 caracteres pero el método retornó " + resultado.length());

		resultado = invertirCadena("a ");
		resultadoEsperado = "a";
		Assert.assertNotEquals(resultadoEsperado, resultado,
				"Se esperaba '" + resultadoEsperado + "' pero el método retornó '" + resultado + "'");

	}

	/**
	 * 
	 * Metodo encargado de probar el Enum EstadoEnum <b>Caso de Uso</b>
	 * 
	 * @author David Castellanos
	 *
	 */
	@Test(enabled = false)
	public void terceraPU() {
		// Instanciar un enum de la clase EstadoEnum
		EstadoEnum estadoEnum = EstadoEnum.ACTIVO;
		// Devolver un String con el nombre de la constante (ACTIVO)
		String resultado1 = estadoEnum.name();
		String resultadoEsperado1 = "ACTIVO";
		Assert.assertEquals(resultadoEsperado1, resultado1,
				"Se esperaba '" + resultadoEsperado1 + "' pero el método retornó '" + resultado1 + "'");

		estadoEnum = EstadoEnum.INACTIVO;
		// Devolver un String con el nombre de la constante (INACTIVO)
		resultado1 = estadoEnum.name();
		resultadoEsperado1 = "INACTIVO";
		Assert.assertEquals(resultadoEsperado1, resultado1,
				"Se esperaba '" + resultadoEsperado1 + "' pero el método retornó '" + resultado1 + "'");

		// Devolver un entero con la posición del enum según está declarada
		Integer resultado2 = estadoEnum.ordinal();
		Integer resultadoEsperado2 = 1;
		// Comparar el enum con el parámetro según el orden en el que están declarados
		// lo enum
		Assert.assertEquals(resultadoEsperado2, resultado2,
				"Se esperaba '" + resultadoEsperado2 + "' pero el método retornó '" + resultado2 + "'");

		// Devolver un array que contiene todos los enum
		EstadoEnum[] resultado3 = estadoEnum.values();
		EstadoEnum[] resultadoEsperado3 = { EstadoEnum.ACTIVO, EstadoEnum.INACTIVO };
		Assert.assertEquals(resultadoEsperado3, resultado3,
				"Se esperaba '" + resultadoEsperado3 + "' pero el método retornó '" + resultado3 + "'");

	}

	/**
	 * 
	 * Metodo encargado de probar el método crearComicDTO de la clase
	 * GestionarComicPOJO <b>Caso de Uso</b>
	 * 
	 * @author David Castellanos
	 *
	 */
	@Test(enabled = true)
	public void crearComicDTOTest() {
		GestionarComicPOJO gestion = new GestionarComicPOJO();
		ComicDTO comicDTO = gestion.crearComicDTO("1", "Dragon Ball", "Planeta Cómic", "AVENTURAS", "Manga Shonen", 100,
				new BigDecimal(123), "Dragon Garow Lee", Boolean.FALSE, LocalDate.now(), "ACTIVO", 20L);
		gestion.agregarComicDTOLista(comicDTO);
		Assert.assertNotNull(gestion.getListaComics());
		Assert.assertTrue(gestion.getListaComics().size() > 0);

		// Esta es preferible a la anterior
		Assert.assertTrue(!gestion.getListaComics().isEmpty());

		Assert.assertEquals(1, gestion.getListaComics().size());

		comicDTO = new ComicDTO();
		comicDTO.setId("2");
		comicDTO.setNombre("Dragon Ball");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematicaEnum("AVENTURAS");
		comicDTO.setColeccion("Manga Shonen");
		comicDTO.setNumeroPaginas(100);
		comicDTO.setPrecio(new BigDecimal(2100));
		comicDTO.setAutores("Dragon Garow Lee");
		comicDTO.setAcolor(Boolean.FALSE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstado("ACTIVO");
		comicDTO.setCantidad(20L);

		gestion.agregarComicDTOLista(comicDTO);
		Assert.assertTrue(gestion.getListaComics().size() > 1);

		comicDTO = new ComicDTO();
		comicDTO.setId("3");
		comicDTO.setNombre("Dragon Ball Yamcha");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematicaEnum("AVENTURAS");
		comicDTO.setColeccion("Manga Shonen");
		comicDTO.setNumeroPaginas(100);
		comicDTO.setPrecio(new BigDecimal(2100));
		comicDTO.setAutores("Dragon Garow Lee");
		comicDTO.setAcolor(Boolean.FALSE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstado("ACTIVO");
		comicDTO.setCantidad(20L);

		gestion.agregarComicDTOLista(comicDTO);
		Assert.assertTrue(gestion.getListaComics().size() > 2);
	}

	/**
	 * 
	 * Metodo encargado de probar el método modificarNombreComic de la clase
	 * GestionarComicPOJO 
	 * <b>Caso de Uso</b>
	 * 
	 * @author David Castellanos
	 *
	 */
	@Test(enabled = false)
	public void modificarNombreComicTest() {
		Long a = 100L;
		Long b = 50L;
		Long resultadoEsperado = 150L;
		Long resultado = a + b;

		Assert.assertEquals(resultado, resultadoEsperado);
	}

}
