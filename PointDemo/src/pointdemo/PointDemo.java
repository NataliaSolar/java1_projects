
package pointdemo;

/**
 *
 * @author Natalia Solar
 */
public class PointDemo {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args)
    {   
        // set a new object with 0.0 , 0.0 values
        Point myPoint = new Point(); 
        System.out.println("x for myPoint is " + myPoint.getX());
        System.out.println("y for myPoint is " + myPoint.getY());
        System.out.println("---------------");
        
        // set another new object with given values
        Point mySecondPoint = new Point(-12, 24); 
        System.out.println("x for myPoint is " + mySecondPoint.getX());
        System.out.println("y for myPoint is " + mySecondPoint.getY());
        System.out.println("---------------");
        
        // set new values to myPoint object
        myPoint.setX(20); 
        myPoint.setY(60);
        System.out.println("x for myPoint is " + myPoint.getX());
        System.out.println("y for myPoint is " + myPoint.getY());
        System.out.println("---------------");
        
        // moving the object. Point is set to (32, 50)
        myPoint.move(12, -10);
        System.out.println("x for myPoint is " + myPoint.getX());
        System.out.println("y for myPoint is " + myPoint.getY());
        System.out.println("---------------");
        
        // rotating the object - point becomes (50,-32)
        myPoint.rotate();
        System.out.println("x for myPoint is " + myPoint.getX());
        System.out.println("y for myPoint is " + myPoint.getY());
        
    }
}
    

