package com.poniente.inheritance_ed_t2;
import java.io.PrintWriter;

/**
 * Esta es una clase círculo que representa el radio y el centro del círculo.
 * hereda de la clase TwoDimensionalShape.
 * El centro es un objeto Point.
 * 
 * @author  Pratik Patel
 * @version 1 Date: 04/27/2014
 */

public class Circle  extends TwoDimensionalShape{
    //variables de instancia radio y centro
    private double  radius ;
    private Point center;

    /**
     * El constructor que toma double y punto inicializa el radio y el centro.
     * @param center Primer parametro de tipo Clase Point
     * @param radius segundo parametro de tipo double
     */
    public Circle( Point center, double radius) 
    {
        this.radius = radius;
        this.center = center;
    }
    
    
    /**
     * El constructor que llama al constructor definido anteriormente.
     * @param circle tipo clase Circle
     */
    public Circle(Circle circle)
    {
        this.radius = circle.radius;
        this.center = circle.center;
    }

    
    /**
     *Obtiene el valor del radio.
     * 
     * @return valor
     */
    public double getRadius() 
    {
        return radius;
    }

    
    
    /**
     * Establece el valor del radio.
     * @param radius tipo double
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    /**
     * Obtiene el valor del centro.
     * @return info center.
     */
    public Point getCenter() 
    {
        return center;
    }

    
    
    /**
     * Establece el valor del centro.
     * @param center tipo Clase Point.
     */
    public void setCenter(Point center) 
    {
        this.center = center;
    }

    
    
    /**
     * Este es un método heredado que imprime el objeto circular.
     * @param out Escribir fichero.
     */
    @Override
    @SuppressWarnings("empty-statement")
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Cirle: "+ "\r\n");
        out.print("\n Center = " + this.center.getX() + " " + this.center.getY()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");;
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n Radius = " + this.getRadius()+ "\r\n");;
        out.write("\n\n\n");
    }

    
    /**
     * Este es un método heredado que obtiene el zona.
     * @return  calculo area.
     */
    @Override
    public double getArea() 
    {
        return Math.PI * this.radius * this.radius ;
    }

    
    /**
     * Este es un método heredado que obtiene el Perímetro.
     * @return  calculo perimetro.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}

    

