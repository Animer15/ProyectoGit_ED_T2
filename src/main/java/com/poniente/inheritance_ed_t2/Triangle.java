package com.poniente.inheritance_ed_t2;
import java.io.PrintWriter;

/**
 * Esta es una clase de triángulo que tiene forma de TwoDimention.
 * Representa tres puntos de esquina que son objetos puntuales..
 * 
 * @author Pratik Patel
 * @version 1  Date: 04/27/2014
 */

public class Triangle extends TwoDimensionalShape {

    //variables de instancia point1, point2 y point3
    private Point point1, point2, point3;

    public Triangle() {
    }

    
    /**
     * El constructor que toma como parametros puntos y los define.
     * @param pt1 punto1.
     * @param py2 punto 2.
     * @param py3 punto 3.
     */
    public Triangle(Point pt1, Point py2, Point py3) 
    {
        this.point1 = pt1;
        this.point2 = py2;
        this.point3 = py3;
    }

    
    
    /**     
     * Este constructor toma un objeto Triangle como parámetro.
     * Crea un nuevo objeto Triangle.
     * @param t triangle.
     */
    public Triangle(Triangle t) 
    {
        this.point1 = t.point1;
        this.point2 = t.point2;
        this.point3 = t.point3;
    }

    
    
    /**
     * Obtiene el valor de point1.
     * @return el valor de point1.
     */
    public Point getPoint1() 
    {
        return point1;
    }

    /**
     * Establece el valor de point1.
     * @param point1 punto.
     */
    public void setPoint1(Point point1) 
    {
        this.point1 = point1;
    }

    
    /**
     * Obtiene el valor de point2.
     * @return el valor de point2.
     */
    public Point getPoint2() 
    {
        return point2;
    }

    
    /**
     * Establece el valor de point2.
     * @param point2 punto.
     */
    public void setPoint2(Point point2) 
    {
        this.point2 = point2;
    }

    
    
    /**
     * Obtiene el valor de point3.
     * @return el valor de point3.
     */
    public Point getPoint3()
    {
        return point3;
    }

    /**
     * Establece el valor de point3.
     * @param point3 punto.
     */
    public void setPoint3(Point point3) 
    {
        this.point3 = point3;
    }

    
    /**
     * Printwriteout es un método heredado, que imprime el objeto Triangle.
     * @param out escribir.
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Triangle Data => "+ "\r\n");
        out.write("\n Point 1 = " + this.point1.getX() + " , " + this.point1.getY()+ "\r\n");
        out.write("\n Point 2 = " + this.point2.getX() + " , " + this.point2.getY()+ "\r\n");
        out.write("\n Point 3 = " + this.point3.getX() + " , " + this.point3.getY()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");   
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n\n\n");;
    }

    
    /**
     * Es un método heredado que recibe la zona.
     */
    @Override
    public double getArea() 
    {

        double area;
        double perimeter = this.getPerimeter()/2;

        double a = this.point1.getX() + this.point1.getY();
        double b = this.point2.getX() + this.point2.getY();
        double c = this.point3.getX() + this.point3.getY();

        area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return area;
    }

    /**
     * Es un método heredado que obtiene el perímetro.
     */
    @Override
    public double getPerimeter() 
    {

        double sum =  0 ;
        sum +=  this.point1.getX() + this.point1.getY();
        sum += this.point2.getX() + this.point2.getY();
        sum += this.point3.getX() + this.point3.getY();
        return sum;

      
        
    }
}
