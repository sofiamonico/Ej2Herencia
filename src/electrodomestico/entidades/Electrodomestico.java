/*
 Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:
 */
package electrodomestico.entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected float precio;
    protected String color;
    protected char consum_energetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(float precio, String color, char consum_energetico, int peso) {
        this.precio = precio;
        this.color = this.comprobarColor(color);
        this.consum_energetico = this.comprobarConsumoEnergetico(consum_energetico);
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsum_energetico() {
        return consum_energetico;
    }

    public void setConsum_energetico(char consum_energetico) {
        this.consum_energetico = consum_energetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        char cons;

        if ('A' == letra
                || 'B' == letra
                || 'C' == letra
                || 'D' == letra
                || 'E' == letra
                || 'F' == letra)
        {
            cons = letra;
        } else
        {

            cons = 'F';
        }
        return cons;
    }

    //blanco, negro, rojo, azul y gris
    public String comprobarColor(String color) {
        String col;
        switch (color)
        {
            case "blanco":
                col = color;
                break;
            case "negro":
                col = color;
                break;
            case "rojo":
                col = color;
                break;
            case "azul":
                col = color;
                break;
            case "gris":
                col = color;
                break;
            default:
                col = "blanco";
                break;
        }
        return col;
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Agrega el color del electrodomestico ");
        this.color = comprobarColor(leer.next());
        System.out.println("Agrega el consumo del electrodomestico ");
        this.consum_energetico = comprobarConsumoEnergetico(leer.next().charAt(0));
        System.out.println("Agregue el peso del electrodomestico");
        this.peso = leer.nextInt();
        this.precio = 1000;

    }

    public float precioFinal() {
        float precioFinal = this.precio;
        if (this.peso >= 1 && this.peso <= 19)
        {
            precioFinal += 100;
        } else if (this.peso >= 20 && this.peso <= 49)
        {
            precioFinal += 500;
        } else if (this.peso >= 50 && this.peso <= 79)
        {
            precioFinal += 800;
        } else if (this.peso <= 80)
        {
            precioFinal += 1000;
        }

        switch (this.consum_energetico)
        {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        return precioFinal;
    }

}
