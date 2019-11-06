/**
 * @description Clase MiObjetoDTO que contiene la informacion de un comic
 * 
 * @author David Ernesto Castellanos Rodríguez <davidcastellanos101@gmail.com>
 */
export class MiObjetoDTO {

    /**
    * Id del comic
    */
    public id: number;

    /**
     * Nombre del comic
     */
    public nombre: String;

    /**
     * Editoria del comic
     */
    public editorial: String;
    
    /**
     * Temática del comic
     */
    public tematica: String;

    /**
     * Número de páginas del comic
     */
    public numeroPaginas: number;

    /**
     * Precio del comic
     */
    public precio: number;

    /**
     * Autores del comic
     */
    public autores: String;

    /**
     * Attributo que indica si el comic es a color o a blanco y negro
     */
    public aColor: boolean;

    /**
     * Fecha de venta del comic
     */
    public fechaVenta: Date;

    /**
     * Estado del comic
     */
    public estado: String;




}