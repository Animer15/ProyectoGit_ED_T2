package com.poniente.inheritance_ed_t2;
import java.io.PrintWriter;
/**
 *La clase de rectángulo hereda de la clase TwoDimensionalShape 
 * y representa la longitud y el ancho.
 * 
 * @author Pratik Patel
 * @version 1   Date: 04/27/2014
 */

 class Rectangle  extends TwoDimensionalShape{

     //Variables de instancia largo y ancho. ambos son dobles.
     double length;  
     double width;   
     
    public Rectangle() {
    }

    
    /**
     * Este constructor toma dos dobles e inicializa la longitud y el ancho.
     */
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
     
     
    /**
     * Este constructor llama al constructor definido anteriormente.
     */
    public Rectangle(Rectangle rect)
    {
        this.length = rect.length;
        this.width = rect.width;
    }

    
    /**
     * Obtiene el valor de la longitud.
     * @devuelve el valor de la longitud.
     */
    public double getLength() 
    {
        return length;
    }

    
    
    /**
     * Establece el valor de la altura.
     */
    public void setHeight(double length) 
    {
        this.length = length;
    }
    
    

    /**
     * Obtiene el valor del ancho.
     * @devuelve el valor de ancho.
     */
    public double getWidth() 
    {
        return width;
    }

    
    /**
     * Establece el valor de ancho.
     */
    public void setWidth(double width) 
    {
        this.width = width;
    }
    

    
    /**
     * Este es un método heredado que imprime el objeto Rectangle.
     */
    @Override
    public void print(PrintWriter out) 
    {
       
        super.print(out);
        out.write("\n Area = " + this.getArea()+ "\r\n");
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n Is Square? = " + this.isSquare()+ "\r\n");;
        out.write("\n\n\n");
        
    }

    
    
    /**
     * Este es un método heredado que que obtiene el área.
     */
    @Override
    public double getArea() 
    {
        return this.length * this.width;
    }
    
    

    /**
     * Este es un método heredado que obtiene el perímetro.
     */
    @Override
    public double getPerimeter() 
    {
        return 2 * (this.length + this.width);
    }
    
    
    
    /**
     * Este es el método isSquare que devuelve un valor verdadero o falso de acuerdo con la longitud y el ancho.
     */
    public boolean  isSquare()
    {
        if(this.length == this.width)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     
}
