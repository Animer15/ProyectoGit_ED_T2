package com.poniente.inheritance_ed_t2;
import java.io.PrintWriter;

/**
 * Esta es una clase de cubo hereda de la clase ThreeDimensionalShape
 * está representado por la longitud de sus lados.
 * 
 * @author Pratik Patel
 * @version 1  Date: 04/27/2014
 */

public class Cube extends ThreeDimensionalShape{
    //instancia de longitud variable que es doble.
     double length;

    public Cube() {
    }

    
    /**
     * El constructor que define una longitud de tipo double.
     * @param length tipo double.
     */
    public Cube(double length) 
    {
        this.length = length;
    }
     
     
    /**
     * Este constructor toma un objeto Cube como parámetro.
     * Crea un nuevo objeto Cube.  
     * @param cube tipo Cube.
     */
    public Cube(Cube cube)
    {
         this.length = cube.length;
    }

   
    /**
     *Obtiene el valor de la longitud.
     * @return el valor de la longitud.
     */
    public double getLength() 
    {
        return length;
    }

    
    /**
     * Establece el valor de la longitud.
     * @param length tipo double.
     */
    public void setSideLength(double length) 
    {
        this.length = length;
    }

    
    
    /**
     * Este es un método heredado que obtiene la superficie.
     * @return valor calculada
     */
    @Override
    public double getSurfaceArea() 
    {
        return 6 * this.length * this.length;
    }

    
    
    /**
     * Este es un método heredado que obtiene el volumen.
     * @return valor calculada
     */
    @Override
    public double getVolume() 
    {
        return this.length * this.length * this.length;
    }

    
    /**
     * Este es un método heredado que imprime el objeto Cube.
     * @param out tipo PrintWriter.
     */
    @Override
    public void print(PrintWriter out) 
    {
        
        super.print(out);
        out.write("\n Side  Length = " + this.getLength()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n Volume = " + this.getVolume()+ "\r\n");;
        out.write("\n\n\n");
        
    }
     
     
}
