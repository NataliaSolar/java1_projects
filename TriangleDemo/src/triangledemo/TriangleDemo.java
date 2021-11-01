
package triangledemo;

/**
 *
 * @author Natalia Solar
 */
public class TriangleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            
            // set a new object with 0.0 , 0.0 values
            RightTriangle triangle_1 = new RightTriangle();
            System.out.println("leg A for triangle_1 is " + triangle_1.getLegA());
            System.out.println("leg B for triangle_1 is " + triangle_1.getLegB());
            System.out.println("---------------");
            
            // set another new object with given values
            RightTriangle triangle_2 = new RightTriangle(1.0, 2.0);
            System.out.println("leg A for triangle_2 is " + triangle_2.getLegA());
            System.out.println("leg B for triangle_2 is " + triangle_2.getLegB());
            System.out.println("---------------");
            
            // set another new object with given values that produce exception
            //RightTriangle triangle_3 = new RightTriangle(-1, 2.0);
            //System.out.println("leg A for triangle_3 is " + triangle_3.getLegA());
            //System.out.println("leg B for triangle_3 is " + triangle_3.getLegB());
            //System.out.println("---------------");
            
            // set new values to triangle_2 object
            triangle_2.setLegA(4.0);
            triangle_2.setLegA(5.0);
            System.out.println("leg A for triangle_2 is " + triangle_2.getLegA());
            System.out.println("leg B for triangle_2 is " + triangle_2.getLegB());
            System.out.println("---------------");
            
            // set new values to triangle_2 object that produce exception
            //triangle_2.setLegA(-4.0);
            //triangle_2.setLegA(-5.0);
            //System.out.println("leg A for triangle_2 is " + triangle_2.getLegA());
            //System.out.println("leg B for triangle_2 is " + triangle_2.getLegB());
            //System.out.println("---------------");
            
            //call methods to calculate the hypotenuse, area and perimeter of triangle_2 object          
            System.out.println("hypotenuse for triangle_2 is " + triangle_2.getHypotenuse());
            System.out.println("the area of triangle_2 is " + triangle_2.GetArea());
            System.out.println("the perimeter of triangle_2 is " + triangle_2.getPerimeter());
            
        }catch (IllegalArgumentException e)    // handle the exception below
        {
            System.out.println("Exception caught! " + e.getMessage());
        }
        
    }
    
}
