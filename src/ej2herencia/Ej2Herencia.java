/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2herencia;

import electrodomestico.entidades.Lavadora;
import electrodomestico.entidades.Televisor;


/**
 *
 * @author Leandro
 */
public class Ej2Herencia {

    public static void main(String[] args) {
      Lavadora lavadora= new Lavadora();
      Televisor tv= new Televisor();
      lavadora.crearLavadora();
     // tv.crearTelevisor();
        System.out.println("El precio final de la Lavadora es de : " + lavadora.precioFinal());
        //System.out.println("El precio final de el Televisor es de : " + tv.precioFinal());
      
    }
    
}
