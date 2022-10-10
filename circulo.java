/**
 * @author Daw120
 */
package com.solomongo.ejercicio1;
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
