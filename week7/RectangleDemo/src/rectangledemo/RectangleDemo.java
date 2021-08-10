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
public class RectangleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("count = "+Rectangle.getCount());
        Rectangle r0 = new Rectangle();
        Rectangle r3 = new Rectangle(45, 56);
       System.out.println("Length "+r0.getLength()+" Width: "+r0.getWidth());
        r0.setWidth(4);
        r0.setLength(5);
        System.out.println("count = "+Rectangle.getCount());
        Rectangle r1 = new Rectangle();
        System.out.println("count = "+r1.getCount());
        Rectangle r2 = new Rectangle();
        System.out.println("count = "+r2.getCount());
    }
    
}
