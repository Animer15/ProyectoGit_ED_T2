package com.poniente.inheritance_ed_t2;
import java.io.PrintWriter;

/**
 * Esta es una clase de cono que es un ThreeDimensionalShape.
 * Representa el radio y la altura.
 * 
 * @author Pratik Patel
 * @version 1  Date: 04/27/2014
 * 
 */

 class Cone extends ThreeDimensionalShape{
    //instancia variable de radio y altura.
    double radius;
    double height;

    public Cone() 
    {
    }

    
    /**
     * El constructor que toma radio y altura como parametros.
     */
    public Cone(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
    }
     
    
    /**
     * Este constructor toma un objeto Cone como parámetro.
     * Crea un nuevo objeto Cone.  
    
     * El constructor que llama al constructor definido anteriormente.
     */ 
    public Cone(Cone con)
    {
         this.radius = con.radius;
         this.height = con.height;
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
     * Establece el valor del radio
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    
    /**
     * Obtiene el valor de la altura.
     * @devuelve el valor de la altura.
     */
    public double getHeight() 
    {
        return height;
    }

    
    
    /**
     * Establece el valor de la altura.
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

        return (Math.PI * (this.radius * this.radius) * this.height) / 3;
    }

    
    /**
     * Este es un método heredado que obtiene el volumen.
     */
    @Override
    public double getVolume() 
    {

        return (Math.PI * (this.radius)) * (this.radius  + Math.sqrt( ( this.radius * this.radius) + (this.height * this.height)));
        
    }

    
    
    /**
     * Este es un método heredado que imprime el objeto Cone.
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Radius  = " + this.getRadius()+ "\r\n");
        out.write("\n Height  = " + this.getHeight()+ "\r\n");
        out.write("\n  Surface  Area = " + this.getVolume() + "\r\n");
        out.write("\n  Volume  = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n\n\n");
    }
     
}
