package com.poniente.inheritance_ed_t2;
import java.io.PrintWriter;

/**
 * La clase Esfera es un ThreeDimensionalShape 
 * representa su radio.
 * 
 * @author Pratik Patel
 * @version 1 Date: 04/27/2014
 */

public class Sphere extends ThreeDimensionalShape{
    //radio variable de instancia.
    double radius ;

    public Sphere() {
    }
    
    
    /**
     * El constructor define el radio.
     */
    public Sphere(double radius) 
    {
        this.radius = radius;
    }
    
    
    /**
     * El constructor que llama al constructor definido anteriormente.
     */
    public Sphere(Sphere sp)
    {
        this.radius = sp.radius;
    }

    
     /**
     * Obtiene el valor del radio.
     * @devuelve el valor de radio.
     */
    public double getRadius() 
    {
        return radius;
    }

    
    
    /**
     * Establece el valor del radio.
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    /**
     * Este es un método heredado que obtiene el área de la superficie.
     */
    @Override
    public double getSurfaceArea() 
    {
        
        return 4 * Math.PI * this.radius * this.radius;
        
    }

    
    /**
     * Este es un método heredado que obtiene el volumen.
     */
    @Override
    public double getVolume() 
    {
        return (4 * Math.PI * this.radius * this.radius * this.radius ) / 3;
    }

    
    /**
     * Este es un método heredado que imprime el objeto Esfera.
     */
    @Override
    public void print(PrintWriter out)
    {
        
        super.print(out);
        out.write("\n Radius = " + this.getRadius()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n Volume = " + this.getVolume()+ "\r\n");
        out.write("\n\n\n");
        
    }
   
    
}
