/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classworkrectangledemo;

/**
 *
 * @author User Account
 */
public class Rectangle {
    
    private double length;
    private double width;
    private static int count;
    //private double area; not correct
    /**
     * Non-argument constructor, sets length and width to 1
     */
    public Rectangle()
    {
        length = 1;
        width = 1;
        count++;
    }
    
    public Rectangle(double len, double wid)
    {
        if (len<0) throw new IllegalArgumentException ("Length cannot be negative" + len);
        else this.length = len;
        if (wid<0) throw new IllegalArgumentException ("Width cannot be negative" + wid);
        else this.width = wid;
    }
    
    /**
     * Copy constructor
     * @param objToCopyFrom object to be copied
     */
    public Rectangle(Rectangle objToCopyFrom)
    {
        if (objToCopyFrom == null) throw new IllegalArgumentException ("Length cannot be negative");
        this.length = objToCopyFrom.length;
        this.width = objToCopyFrom.width;
        count++;
        
    }
    
    
    public static int getCount()
    {
        return count;
    }
    
    /**
     * Accessor for length field
     * @return length of the rectangle
     */
    public double getLength()
    {
        return length;
    }
    
    /**
     * Accessor for width field
     * @return width of the rectangle
     */
    public double getWidth()
    {
        return width;
    }
    
    /**
     * Mutator method for length field
     * @param len length value to be set
     * @throws IllegalArgumentException thrown when the parameter has negative value
     */
    public void setLength(double len) throws IllegalArgumentException
    {
        if (len<0) throw new IllegalArgumentException ("Length cannot be negative" + len);
        else length = len;
    }
    
    
    /*public void setLength(double length)
    {
        if (length<0) throw new IllegalArgumentException ("Length cannot be negative" + length);
        else this.length = length;
    }*/
    
    public void setWidth(double wid)  throws IllegalArgumentException
    {
        if (wid<0) throw new IllegalArgumentException ("Width cannot be negative" + wid);
        else width = wid;
    }
    
    
    public double getArea()
    {
        return length*width;
    }
    
    @Override public String toString()
    {
        String out = "Width = " + width + "; Length = "+ length;
        return out;
    }
    
    public boolean equals(Rectangle otherObj)
    {
        boolean out = true;
        if(this.length==otherObj.length&&this.width==otherObj.width) return true;
        else return false;
    }
}
