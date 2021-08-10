/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangledemo;

/**
 *
 * @author alexandra.vaschillo
 */
public class Rectangle {
    private double length;
    private double width;
    private static int count = 0;
//    private double area; 
    
    public Rectangle()
    {
        length = 1;
        width = 1;
        count++;
    }
    
    public Rectangle(double len, double w)
    {
        length = len;
        width = w;
        count++;
    }
    /**
     * 
     * @param length 
     */
    public void setLength(double length)
    {
        if(length<0) throw new IllegalArgumentException("negative length");
        this.length = length;
    }
    
    public void setWidth(double w)
    {
        if(w<0) throw new IllegalArgumentException("negative width");
        width = w;
    }
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    public double getArea()
    {
       return length*width; 
    }
    public static int getCount()
    {
        //length++;
        return count;
    }
}
