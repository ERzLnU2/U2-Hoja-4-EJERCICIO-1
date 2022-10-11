/**
 * 
 * @author Daw120
 * 
 *  1.- Diseñar una clase llamada ‘circulo’ que contenga:
 
    • Un atributo privado de tipo float llamado Radio.
    
    • Un constructor que permita declarar objetos sin inicializar y otro que 
      permita declarar objetos de tipo circulo inicializado (con el valor del radio).
      
    • Un método llamado setRadio que permita dar valor al Radio y un método 
      llamado getRadio que permita ver el contenido del Radio.

* Ejemplo de ejecución: primero creo un circulo con el constructor sin parámetros y 
luego establezco un valor del radio y muestro la información. A continuación creo 
otro circulo pero ya con un radio, es decir, utilizo el constructor con parámetros.

Salida:

      Radio del circulo del primer circulo una vez establecido un radio : 6,30
      Radio del circulo del segundo circulo nada más crearlo: 10.0
 */
package com.solomongo.ejercicio1;
public class Ejercicio1{
    public static void main(String[] args){      
         circulo verRadio=new circulo();  
                 verRadio.setRadio((float) 6.3);                
         circulo verRadio2=new circulo();  
                 verRadio2.getRadio2(10);
         System.out.printf("\nRadio del circulo del primer circulo una vez establecido un radio : %,.2f",verRadio.getRadio());
         System.out.printf("\nRadio del circulo del segundo circulo nada mas crearlo: %,.1f",verRadio2.getRadio2());
    }
}
