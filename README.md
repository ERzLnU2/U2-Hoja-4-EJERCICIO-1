# U2-Hoja-4-EJERCICIO-1
constructores en JAVA con get y set para radio de circulo.


      1.- Diseñar una clase llamada ‘circulo’ que contenga:
 
          • Un atributo privado de tipo float llamado Radio.
    
          • Un constructor que permita declarar objetos sin inicializar y otro que permita 
            declarar objetos de tipo circulo inicializado (con el valor del radio).
      
          • Un método llamado setRadio que permita dar valor al Radio y un método llamado 
            getRadio que permita ver el contenido del Radio.

       * Ejemplo de ejecución: primero creo un circulo con el constructor sin parámetros y 
         luego establezco un valor del radio y muestro la información. A continuación creo 
         otro circulo pero ya con un radio, es decir, utilizo el constructor con parámetros.
         
     Salida:

       Radio del circulo del primer circulo una vez establecido un radio : 6,30
       Radio del circulo del segundo circulo nada más crearlo: 10.0
 
 
```java
public class Ejercicio1{
    public static void main(String[] args){      
         circulo verRadio=new circulo();  
                 verRadio.setRadio((float) 6.3);                
         circulo verRadio2=new circulo();  
                 verRadio2.getRadio2(10);
         System.out.printf("\nRadio del circulo del primer circulo una vez establecido un radio : %,.2f",verRadio.getRadio());
         System.out.printf("\nRadio del circulo del segundo circulo nada mas crearlo: %,.2f",verRadio2.getRadio2());
    }
}
´´´


![1](https://user-images.githubusercontent.com/80227002/194963631-7e737739-cc55-4909-a336-3be9a1fb15d5.png)


```java
public class circulo { 
     private float Radio; // atributo privado de tipo float llamado Radio
     public circulo(){} //constructor que permite declarar objetos sin inicializar
     public circulo(float radio){/*this.*/Radio=radio;} // constructor, permite declarar objetos de tipo circulo inicializado (con el valor del radio)
     public circulo(double radio2){this.Radio=(float) 10.00;} 
     public float getRadio(){return Radio;} // método llamado getRadio, permite ver el contenido del Radio.
     public void setRadio(float radio){/*this.*/Radio=radio;} //método setRadio que permita dar valor al Radio
     public void getRadio2(float radio){this.Radio=radio;} //otro circulo pero ya con un radio
     public float getRadio2(){return Radio;}
}
```
