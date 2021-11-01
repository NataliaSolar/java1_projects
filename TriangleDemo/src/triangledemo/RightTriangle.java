
package triangledemo;

/**
 *
 * @author Natalia Solar
 */
public class RightTriangle {
    
    private double legA;
    private double legB;
    
    /**
     * Non-argument constructor that sets fields to 0
     */    
    public RightTriangle()
    {
        legA = 0;
        legB = 0;
    }
    
    /**
     * Constructor. Accepts legs of the right triangle as arguments.
     * @param legA one leg of right triangle
     * @param legB second leg of right triangle
     * @throws IllegalArgumentException when one or both legs are set to 0 or negative number(s)
     */
    public RightTriangle(double legA, double legB) throws IllegalArgumentException
    {
        if (legA<=0||legB<=0) throw new IllegalArgumentException("legs must be positive numbers");
        this.legA = legA;
        this.legB = legB;
    }
    
    /**
     * mutator method for legA field
     * @param legA one leg of right triangle
     * @throws IllegalArgumentException  when leg is set to 0 or negative number(s)
     */
    public void setLegA(double legA) throws IllegalArgumentException
    {
        if (legA<=0) throw new IllegalArgumentException("leg must be positive number");
        this.legA = legA;
    }
    
    /**
     * mutator method for legB field
     * @param legB second leg of right triangle
     * @throws IllegalArgumentException when leg is set to 0 or negative number(s)
     */
    public void setLegB(double legB) throws IllegalArgumentException
    {
        if (legB<=0) throw new IllegalArgumentException("leg must be positive number");
        this.legB = legB;
    }
    
    /**
     * accessor method for legA
     * @return leg of right triangle
     */
    public double getLegA()
    {
        return legA;
    }
    
    /**
     * accessor method for legB
     * @return leg of right triangle 
     */
    public double getLegB()
    {
        return legB;
    }
    
    /**
     * method to calculate hypotenuse
     * @return hypotenuse of right triangle
     */
    public double getHypotenuse()
    {
        return Math.sqrt(legA*legA +legB*legB);
    }
    
    /**
     * method to calculate the area of right triangle
     * @return the area
     */
    public double GetArea()
    {
        return legA*legB/2;
    }
    
    /**
     * method to calculate perimeter
     * @return the perimeter
     */
    public double getPerimeter()
    {
        return legA+legB+getHypotenuse();
    }
}
