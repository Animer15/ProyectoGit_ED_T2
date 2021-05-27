package com.poniente.inheritance_ed_t2;
/**
 * Esta es la clase twoDimensionalShape que apunta a las otras clases en la jerarquía.
 * da el perímetro y el área de cada una de las formas.
 * 
 * @author Pratik Patel
 * @version 1 Date: 04/27/2014
 */

abstract  class TwoDimensionalShape extends Shape{
    
  
   /**
     * Este método obtiene el perímetro.
     * @devuelve el valor 0.
     */ 
   public double getPerimeter()
   {
        return 0 ;
   }
    
   /**
     * Este método obtiene el área.
     * @devuelve el valor 0.
     */
   public double getArea()
   {
        return 0;
   }


}
