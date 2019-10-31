import { Component, OnInit } from '@angular/core';

/**
 * @description Componente misDatos, el cual contiene mis datos personales
 * 
 * @author David Ernesto Castellanos Rodríguez <davidcastellanos101@gmail.com>
 */
@Component({
  selector: 'misdatos',
  templateUrl: './misDatos-component.html',
})
export class MisDatosComponent {

  /**
   * Atributo que contiene mi nombre
   */
  private nombre: string = "David Ernesto Castellanos Rodríguez";
    /**
   * Atributo que contiene la ciudad
   */
  private ciudad: string = "Duitama";
    /**
   * Atributo que contiene el texto concatenado del segundo punto de la tarea
   */
  public cadena: string = this.nombre + " - " + this.ciudad;

}