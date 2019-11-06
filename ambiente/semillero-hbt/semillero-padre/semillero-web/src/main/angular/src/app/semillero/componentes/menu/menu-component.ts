import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

/**
 * @description Componente menu, el cual contiene la logica para direccionar a los modulos
 * desarrollados
 * 
 * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
 */
@Component({
  selector: 'home-page',
  templateUrl: './menu-component.html',
})
export class MenuComponent implements OnInit {

  /**
   * Constructor de la clase
   * @param router permite direccionar a otros componentes
   */
  constructor(private router: Router) {
  }

  /**
   * Evento angular que se ejecuta al iniciar el componente
   */
  ngOnInit(): void {

  }

  /**
   * @description Metodo encargado de direccionar al componente de gestionar comic
   * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
   */
  public navegarGestionarComic(): void {
    this.router.navigate(['gestionar-comic']);
  }

  /**
   * @description Metodo encargado de direccionar al componente de gestionar comic
   * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
   */
  public navegarHome(): void {
    this.router.navigate(['bienvenida']);
  }

  /**
   * @description Metodo encargado de direccionar al componente de MostrarLista
   * @author David Ernesto Castellanos Rodríguez <davidcastellanos101@gmail.com>
   */
  public navegarMostarLista(): void {
    this.router.navigate(['mostrarlista']);
  }

    /**
   * @description Metodo encargado de direccionar al componente Punto6
   * @author David Ernesto Castellanos Rodríguez <davidcastellanos101@gmail.com>
   */
  public navegarPunto6(): void {
    this.router.navigate(['punto6']);
  }

  public navegarGestionarCompra(): void {
    //WIP
  }
}