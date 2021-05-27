package com.poniente.inheritance_ed_t2;
import java.io.PrintWriter;

/**
 * Esta es una clase Cylinder que es ThreeDimensionalShape.
 * está representado por su radio y altura.
 * 
 * @author Pratik Patel
 * @version 1 Date: 04/27/2014
 */

public class Cylinder extends ThreeDimensionalShape{
    //instancia variable radio y altura de tipo double.
    double radius , height;
    
    /**
     * Este es un constructor predeterminado.
     */
    public Cylinder() {
    }

    
    /**
     * Este es un constructor que toma radio y altura.
     * @param radius tipo double.
     * @param height tipo double.
     */
    public Cylinder(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
    }

    
   
    /**
    * Este constructor toma un objeto Cylinder como parámetro.
    * Crea un nuevo objeto Cylinder. 
    * @param cyl tipo Cylinder.
    */
    public Cylinder(Cylinder cyl)
    {
        this.radius = cyl.radius;
        this.height = cyl.height;
    }

    
    /**
     * Obtiene el valor del radio.
     * @return el valor de radio.
     */
    public double getRadius() 
    {
        return radius;
    }

    
    /**
     * Establece el valor del radio.
     * @param radius tipo double.
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    /**
     * Obtiene el valor de la altura.
     * @return el valor de la altura.
     */
    public double getHeight() 
    {
        return height;
    }

    
    /**
     * Establece el valor de la altura.
     * @param height tipo double.
     */
    public void setHeight(double height) 
    {
        this.height = height;
    }

    
    
    /**
     * Este es un método heredado que obtiene la superficie.
     */
    @Override
    public double getSurfaceArea() 
    {
        return 2 * Math.PI * this.radius * this.height;
    }

    
    
    
    /**
     * Este es un método heredado que obtiene el volumen.
     */
    @Override
    public double getVolume() 
    {
        return  Math.PI * this.radius * this.radius * this.height;
    }

    
    
    
    /**
     * Este es un método heredado que imprime el objeto Cylinder.
     * @param out tipo PrintWriter.
     */
    @Override
    public void print(PrintWriter out) 
    {
        
        super.print(out);
        out.write("\n Radius = " + this.getRadius()+ "\r\n");
        out.write("\n Height = " + this.getHeight()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");;
        out.write("\n Volume = " + this.getVolume()+ "\r\n");
        out.write("\n\n\n");
        
    }
    
    
}
