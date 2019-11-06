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
export class MisDatosComponent implements OnInit{

  /**
   * Atributo que contiene mi nombre
   */
  private nombre: string;
    /**
   * Atributo que contiene la ciudad
   */
  private ciudad: string;
    /**
   * Atributo que contiene el texto concatenado del segundo punto de la tarea
   */
  public cadena: string;

  public variableGlobal: any;
  public lista : Array<any>;

  ngOnInit(): void {
    this.initComponents();

    this.lista = new Array<any>();
    let variableLocal: String = "variable local";
    this.lista.push(variableLocal);

    let objeto = undefined;
    if(objeto !== null && objeto !== undefined){
        console.log("No es nulo")
    } else {
        console.log("Si es nulo");
    }

    //console.log(1 == 1);//true
    //console.log("1" == 1);//true
    //console.log(1 === 1);//true
    //console.log("1" === 1);//false
    let fecha : Date = new Date();
    let fecha2 : Date = new Date("01-05-2015");
    console.log(fecha);
    console.log(fecha2);
  }

  initComponents(): void{
    this.nombre = "David Ernesto Castellanos Rodríguez2";
    this.ciudad = "Duitama";
    this.cadena =  this.nombre + " - " + this.ciudad;

    this.variableGlobal = {
      nombre: "David",
      apellido: "Castellanos",
      colores: [1,2,3,4,5]
    }
  }

}