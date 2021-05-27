package com.poniente.inheritance_ed_t2;
/**
 * Esta es la clase threeDimensionalShape que apunta hacia las otras clases en la jerarquía.
 * da superficie y volumen a esas clases.
 * 
 * @author Pratik Patel
 * @version 1 Date: 04/27/2014
 */

public class ThreeDimensionalShape extends Shape{
 
    /**
     * Este método obtiene el área de la superficie.
     * @return valor 0.
     */
    public double getSurfaceArea()
    {
        return 0 ;
    }
    
    
    /**
     * Este método obtiene el volumen.
     * @return valor 0.
     */
    public double getVolume()
    {
        return 0;
    }
    
}
