/*
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
 */
package electrodomestico.entidades;

import java.util.Scanner;


public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean sint_TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sint_TDT, float precio, String color, char consum_energetico, int peso) {
        super(precio, color, consum_energetico, peso);
        this.resolucion = resolucion;
        this.sint_TDT = sint_TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSint_TDT() {
        return sint_TDT;
    }

    public void setSint_TDT(boolean sint_TDT) {
        this.sint_TDT = sint_TDT;
    }
    
    public void crearTelevisor(){
         crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("TELEVISOR CREADO___________________");
        System.out.println("INGRESE LA RESOLUCION DEL TV EN PULGADAS");
        this.resolucion=leer.nextInt();
        System.out.println("TIENE SINTONIZADOR TDT? S/N");
        String pregunta= leer.next();
        this.sint_TDT="S".equals(pregunta);
    }
    
    @Override
    public float precioFinal(){
       float precioFinal=super.precioFinal();
        if (this.resolucion>40)
        {
            precioFinal*=1.3;
        }
        if (this.sint_TDT)
        {
           precioFinal+=500; 
        }
        
        return precioFinal;
    }
}
