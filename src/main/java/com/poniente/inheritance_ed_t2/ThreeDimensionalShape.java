package com.poniente.inheritance_ed_t2;
/**
 * Esta es la clase threeDimensionalShape que apunta hacia las otras clases en la jerarquía.
 * da superficie y volumen a esas clases.
 * 
 * @author Pratik Patel
 * @version 1 Date: 04/27/2014
 */

abstract class ThreeDimensionalShape extends Shape{
 
    /**
     * Este método obtiene el área de la superficie.
     * @devuelve el valor 0.
     */
    public double getSurfaceArea()
    {
        return 0 ;
    }
    
    
    /**
     * Este método obtiene el volumen.
     * @devuelve el valor 0.
     */
    public double getVolume()
    {
        return 0;
    }
    
}
