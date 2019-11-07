/**
 * GestionarComicBean.java
 */
package com.hbt.semillero.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.Comic;
import com.hbt.semillero.entidades.EstadoEnum;
import com.hbt.semillero.entidades.TematicaEnum;

/**
 * <b>Descripción:<b> Clase que determina <b>Caso de Uso:<b>
 * 
 * @author Dave
 * @version
 */
@Stateless
public class GestionarComicBean implements IGestionarComicLocal {
	// TODO agregar interfaz

	@PersistenceContext
	private EntityManager em;

	/**
	 * 
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#crearComic(com.hbt.semillero.dto.ComicDTO)
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void crearComic(ComicDTO comicDTO) {
		// Entidad nueva
		Comic comic = parseComic(comicDTO);

		em.persist(comic);
	}

	/**
	 * 
	 * Metodo encargado de <b>Caso de Uso</b>
	 * 
	 * @author Dave
	 * 
	 * @param comicDTO
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void modificarComic(ComicDTO comicDTO) {
		Comic comic = new Comic();
		comic.setId(Long.parseLong(comicDTO.getId()));
		// TODO seguir llenado los sets

		em.merge(comic);
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
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ComicDTO consultarComic(Long idComic) {
		Comic found = em.find(Comic.class, idComic);
		ComicDTO newComicDTO = new ComicDTO();
		newComicDTO = parseComicDTO(found);

		return newComicDTO;
	}

	/**
	 * 
	 * Metodo encargado de <b>Caso de Uso</b>
	 * 
	 * @author Dave
	 * 
	 * @return
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<ComicDTO> consultarTodos() {
		List<Comic> resultados = (List<Comic>) em.createQuery("select c from Comic").getResultList();
		return null;
	}

	/**
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#modificarComic(java.lang.Long,
	 *      java.lang.String, com.hbt.semillero.dto.ComicDTO)
	 */
	@Override
	public void modificarComic(Long id, String nombre, ComicDTO comicNuevo) {
		// TODO cual es el resultado de invocar este método sin las anotaciones
		// correpondientes
		Comic comicModificar;
		if (comicNuevo == null) {
			comicModificar = em.find(Comic.class, id);
		} else {
			comicModificar = parseComic(comicNuevo);
		}

		comicModificar.setNombre(nombre);
		// hacer validación para ver si el comicModificar llegó con datos
		em.merge(comicModificar);
	}

	/**
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#eliminarComic(java.lang.Long)
	 */
	@Override
	public void eliminarComic(Long idComic) {
		// TODO este método es la tarea

	}

	/**
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#consultarComics()
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<ComicDTO> consultarComics() {
		List<ComicDTO> resultadosDTO = new ArrayList<ComicDTO>();
		List<Comic> resultados = em.createQuery("select c from Comic c").getResultList();
		for (Comic comic : resultados) {
			resultadosDTO.add(parseComicDTO(comic));
		}
		return resultadosDTO;
	}

	/**
	 * 
	 * Metodo encargado de <b>Caso de Uso</b>
	 * 
	 * @author Dave
	 * 
	 * @param comic
	 */
	private Comic parseComic(ComicDTO comic) {
		Comic comicAux = new Comic();
		comicAux.setAutores(comic.getAutores());
		comicAux.setCantidad(comic.getCantidad());
		comicAux.setColeccion(comic.getColeccion());
		comicAux.setColor(comic.getAcolor());
		comicAux.setEditorial(comic.getEditorial());
		comicAux.setEstadoEnum(EstadoEnum.valueOf(comic.getEstado()));
		comicAux.setFechaVenta(comic.getFechaVenta());
		comicAux.setId(Long.parseLong(comic.getId()));
		comicAux.setNombre(comic.getNombre());
		comicAux.setNumeroPaginas(comic.getNumeroPaginas());
		comicAux.setPrecio(comic.getPrecio());
		comicAux.setTematicaEnum(TematicaEnum.valueOf(comic.getTematicaEnum()));

		return comicAux;
	}

	/**
	 * 
	 * Metodo encargado de <b>Caso de Uso</b>
	 * 
	 * @author Dave
	 * 
	 * @param comic
	 * @return
	 */
	private ComicDTO parseComicDTO(Comic comic) {
		ComicDTO comicDTO = new ComicDTO();
		if (comic.getId() != null) {
			comicDTO.setId(comic.getId().toString());
		}
		comicDTO.setNombre(comic.getNombre());
		comicDTO.setEditorial(comic.getEditorial());
		comicDTO.setTematicaEnum(comic.getTematicaEnum().toString());
		comicDTO.setColeccion(comic.getColeccion());
		comicDTO.setNumeroPaginas(comic.getNumeroPaginas());
		comicDTO.setPrecio(comic.getPrecio());
		comicDTO.setAutores(comic.getAutores());
		comicDTO.setAcolor(comic.getColor());
		comicDTO.setFechaVenta(comic.getFechaVenta());
		comicDTO.setEstado(comic.getEstadoEnum().toString());
		comicDTO.setCantidad(comic.getCantidad());
		return comicDTO;
	}

}
