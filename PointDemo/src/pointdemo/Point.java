
package pointdemo;

/**
 *
 * @author Natalia Solar
 */

public class Point {
    //the x field will hold the x coordinate of a point
    private double x;
    //the y field will hold the y coordinate of a point
    private double y;
    
    
    /**
     * Non-argument constructor that sets the point coordinates to (0,0)
     */    
    public Point()
    {
        x = 0;
        y = 0;
    }
    
    /**
     * A constructor that takes x and y coordinate of the point and sets member variables.
     * @param x the value of x coordinate the field x is going to be set to
     * @param y the value of y coordinate the field y is going to be set to
     */
    public Point(double x, double y)
    {        
        this.x = x;
        this.y = y;
    }
    
    
    /**
     * Accessor for x field
     * @return the value of x coordinate
     */
    public double getX()
    {
        return x;
    }
    
    /**
     * Accessor for y field
     * @return the value of y coordinate
     */
    public double getY()
    {
        return y;
    }
    
    /**
     * Mutator method for x field
     * @param x x value to be set     
     */
    public void setX(double x)
    {
        this.x = x;
    }
    
    /**
     * Mutator method for y field
     * @param y y value to be set
     */
    public void setY(double y)
    {
        this.y = y;
    }
    
    /**
     * A method to move the point by an amount along the vertical and horizontal directions specified by the first and second arguments
     * @param dx an amount to move the point along the vertical directions
     * @param dy an amount to move the point along the horizontal directions
     */
    public void move(double dx, double dy)
    {
        this.x +=dx;
        this.y +=dy;
    }
    
    /**
     * The method to rotate the point by 90 degrees clockwise around the origin.
     */
    public void rotate()
    {
        double temp;
        temp = this.x;
        this.x = y;
        this.y = -temp;
    }
}

