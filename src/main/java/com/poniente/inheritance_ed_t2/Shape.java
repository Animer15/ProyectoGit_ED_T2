package com.poniente.inheritance_ed_t2;
import java.io.PrintWriter;

/**
 * Esta clase Shape representa el área y el perímetro es una clase abstracta.
 * @author Pratik Patel
 * @version 1  Date: 04/27/2014
 */

abstract class Shape {
    
   public void print(PrintWriter out) {
  
   }
   
   /**
    * Obtiene el valor del área.
    * @devuelve el valor 0.
   */
   public double getArea()
   {
       return 0;
       
   }
   
   /**
     * Obtiene el valor de Perímetro.
     * @devuelve el valor 0.
     */
   public double getPerimeter()
   {
       return 0;
   }
   
}
