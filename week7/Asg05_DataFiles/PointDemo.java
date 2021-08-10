
/**
 *
 * @author Alexandra Vaschillo
 * Driver code for Point class
 */
public class PointDemo
{
      
        public static void main(String[] args)
    {   
        // set a new object with 0.0 , 0.0 values
        Point myPoint = new Point(); 
        System.out.println("x for myPoint is " + myPoint.getX());
        System.out.println("y for myPoint is " + myPoint.getY());
        
        // set another new object with given values
        Point mySecondPoint = new Point(-12, 24); 
        System.out.println("x for myPoint is " + mySecondPoint.getX());
        System.out.println("y for myPoint is " + mySecondPoint.getY());
        
        // set new values to myPoint object
        myPoint.setX(20); 
        myPoint.setY(60);
        System.out.println("x for myPoint is " + myPoint.getX());
        System.out.println("y for myPoint is " + myPoint.getY());
        
        // moving the object. Point is set to (32, 50)
        myPoint.move(12, -10);
        System.out.println("x for myPoint is " + myPoint.getX());
        System.out.println("y for myPoint is " + myPoint.getY());
        
        // rotating the object - point becomes (50,-32)
        myPoint.rotate();
        System.out.println("x for myPoint is " + myPoint.getX());
        System.out.println("y for myPoint is " + myPoint.getY());
        
    }
}
