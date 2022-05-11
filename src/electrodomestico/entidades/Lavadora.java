/*
 A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.
 */
package electrodomestico.entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, float precio, String color, char consum_energetico, int peso) {
        super(precio, color, consum_energetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
    
    public void crearLavadora(){
        crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("LAVADORA CREADA___________________");
        System.out.println("Ingrese el tamaño de carga de la lavadora");
        this.carga=leer.nextInt();
        
    }
      
    @Override
     public float precioFinal(){
        float precioFinal=super.precioFinal();
         if(this.carga>30){
             precioFinal+=500;
         }
         return precioFinal;
     }
    
     
    
    
}
