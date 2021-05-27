package com.poniente.inheritance_ed_t2;
import java.io.PrintWriter;

/**
 *  Una clase de puntos se representa como un par de coordenadas cartesianas.
 *  Esta clase no forma parte de la jerarquía, pero otras clases la utilizarán.
 *  x e y puntos coordenadas en el sistema.
 *  
 * @author  Pratik Patel 
 * @version 1  Date 04/27/2014
 */
public class Point {
    // X e Y son variables de instancia que son de tipo dobles.
    private double x ;
    private double y;

    /**
     * El constructor predeterminado que establece las coordenadas x e y.
     */
    public Point() 
    {
        this.x = 0.0;
        this.y = 0.0 ;
    }

    
    /**
     * Este es un constructor que toma dos dobles e inicializa x e y.
     * @param x tipo double.
     * @param y tipo double.
     */
    public Point(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }
    
    
     /**
     * Este constructor toma un objeto Point como parámetro.
     * Crea un nuevo objeto Point.
     * @param pnt tipo Point.
     */
    public Point(Point pnt)
    {
        this.x = pnt.x;
        this.y = pnt.y;
    }
    
   
     /**
     * Obtiene un valor de x.
     * @return el valor de x.
     */
    public double getX() 
    {
        return x;
    }
    
    
     /**
     * Establece un valor de x.
     * @param x tipo double.
     * 
     */
    public void setX(double x) 
    {
        this.x = x;
    }
    
    
    /**
     * Obtiene un valor de y.
     * @return el valor de y.
     */
    public double getY() 
    {
        return y;
    }
    
    
     /**
     * Establece un valor de y.
     * @param y tipo double.
     */
    public void setY(double y) 
    {
        this.y = y;
    }
    
    
    /**
     * Este es un método de distancia que devuelve la distancia entre este punto y otro punto.
     * toma el objeto puntual como parámetro.
     * a traves del parametro calcula la longitud de la línea.
     * @param p tipo Point.
     * @return valor calculada
     */
    public double  distance(Point p)
    {
        return Math.sqrt( ((this.x - p.x)  * (this.x - p.x))  + ((this.y - p.y)  * (this.y - p.y)));
  
    }
    
    
    
    /**
     * PrintWriter out es un método que imprime el punto en x e y para el archivo de salida.
     * @param out tipo PrintWriter.
     */
    public void print(PrintWriter out)
    {
        
        out.write("\n Point Data => ");
        out.write("\nPrint Data = x = " + x + " y = " + y);
        out.write("\n\n\n");;
    }
    
    
}
