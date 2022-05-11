/*
 Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package ej2herencia;

import electrodomestico.entidades.Electrodomestico;
import electrodomestico.entidades.Lavadora;
import electrodomestico.entidades.Televisor;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Leandro
 */
public class Ej2Herencia {

    public static void main(String[] args) {
        //EJERCICIO 2
        /*Lavadora lavadora = new Lavadora();
        Televisor tv = new Televisor();
        lavadora.crearLavadora();
        tv.crearTelevisor();
        System.out.println("El precio final de la Lavadora es de : " + lavadora.precioFinal());
        System.out.println("El precio final de el Televisor es de : " + tv.precioFinal());
         */
        //EJERCICIO 3
        ArrayList<Electrodomestico> listaElect = new ArrayList();
        listaElect.add(new Lavadora(30, 1000, "Blanco", 'A', 60));
        listaElect.add(new Lavadora(60, 1000, "Rojo", 'F', 90));
        listaElect.add(new Televisor(50, false, 1000, "Blanco", 'D', 20));
        listaElect.add(new Televisor(40, true, 1000, "Negro", 'E', 10));
        calcularPrecioFinal(listaElect);
    }

    public static void calcularPrecioFinal(ArrayList<Electrodomestico> listaElect) {
        Iterator<Electrodomestico> it = listaElect.iterator();
        float sumaTotal=0;
        float sumaLav=0;
        float sumaTv=0;
        while (it.hasNext())
        {
            Electrodomestico next = it.next();
            float precio = next.precioFinal();
            System.out.println("El precio final es de : " + precio);
            sumaTotal+=precio;
            if (next instanceof Lavadora)
            {
               sumaLav+=precio;

            } else
            {
                sumaTv += precio;
            }
            
        }
        
        System.out.println("EL TOTAL DE VENTAS DE LOS TELEVISORES DE :" + sumaTv);
        System.out.println("EL TOTAL DE VENTA DE LOS LAVARROPAS ES DE: " + sumaLav);
        System.out.println("EL TOTAL DE TODOS LOS ELECTRODOMESTICOS ES DE : " + sumaTotal);
    }
}
