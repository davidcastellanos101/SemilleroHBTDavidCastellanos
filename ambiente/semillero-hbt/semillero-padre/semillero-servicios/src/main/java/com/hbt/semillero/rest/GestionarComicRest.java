/**
 * GestionarComicRest.java
 */
package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.ejb.IGestionarComicLocal;

/**
 * <b>Descripción:<b> Clase que determina <b>Caso de Uso:<b>
 * 
 * @author Dave
 * @version
 */
@Path("/GestionarComic")
public class GestionarComicRest {

	@EJB
	private IGestionarComicLocal gestionComicEJB;

	/**
	 * Constructor de la clase.
	 */
	public GestionarComicRest() {
		super();

	}

	/**
	 * 
	 * Metodo encargado de imprimir un saludo <b>Caso de Uso</b>
	 * 
	 * @author Dave
	 * 
	 * @return
	 */
	@GET
	@Path("/saludo")
	@Produces
	public String primerRest() {
		return "oli";
	}

	/**
	 * 
	 * Metodo encargado de consultar un comic a partir de su id <b>Caso de Uso</b>
	 * 
	 * @author Dave
	 * 
	 * @param idComic
	 * @return
	 */
	@GET
	@Path("/consultarComic")
	@Produces(MediaType.APPLICATION_JSON)
	public ComicDTO consultarComic(@QueryParam("idComic") Long idComic) {
		if (idComic != null) {
			return gestionComicEJB.consultarComic(idComic);
		}
		return null;
	}

	/**
	 * 
	 * Metodo encargado de <b>Caso de Uso</b>
	 * 
	 * @author Dave
	 * 
	 * @param idComic
	 * @return
	 */
	@GET
	@Path("/eliminarComic")
	@Produces(MediaType.APPLICATION_JSON)
	public ComicDTO eliminarComic(@QueryParam("idComic") Long idComic) {
		// terminar de implementar
		if (idComic != null) {
			return gestionComicEJB.consultarComic(idComic);
		}
		return null;
	}

}
