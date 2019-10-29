package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	public void shouldAnswerWithTrue() {

	}

	private String invertirCadena(String cadena) {

		String cadenaInvertida = "";

		for (int x = cadena.length() - 1; x >= 0; x--) {

			cadenaInvertida = cadenaInvertida + cadena.charAt(x);

		}

		return cadenaInvertida;

	}

	@Test
	public void primeraPU() {
		Long a = 100L;
		Long b = 50L;
		Long resultadoEsperado = 150L;
		Long resultado = a + b;

		Assert.assertEquals(resultado, resultadoEsperado);
	}

	@Test
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
				"Se esperaban 0 caracteres pero el método retornó " + resultado.length());

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
}
