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
public class ClassworkRectangleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); //created a new class
        r1.setLength(1);
        r1.setWidth(1);
        System.out.printf("Length: %.2f and Width: %.2f Area is %.2f\nCount is %d\n", r1.getLength(), r1.getWidth(), r1.getArea(), Rectangle.getCount());
        
        //make a copy of object r1
        double a = r1.getLength();
        double b = r1.getWidth();
        Rectangle r1Copy = new Rectangle(a,b);
        Rectangle r1COpy2 = new Rectangle(r1);
        Rectangle n = null;
        Rectangle copyN = new Rectangle (n);//this will crash the program
        
        Box bb = new Box(r1,7);
        System.out.println("Box V1 " + bb.toString());
        Rectangle test = bb.getBase();
        test.setLength(100);
        System.out.println("Box V2 " + bb.toString());
        
        //int a = 5;
        //int b = 2;

        //double x = a/b;
       // System.out.print(x);
        
        Rectangle[] array = new Rectangle[10];//an array of references
        for (int i=0;i<array.length; i++)
        {
            array[i] = new Rectangle(i+1, i+1);
        }
        //using lenear search to look for a rectangle with specified area
        int area = 4;
        int index = -1;
        boolean go = true;
        for (int i = 0; go&&i<array.length;i++)
        {
            if (array[i].getArea() ==area) 
            {
                index = i;
                go = false;
            }
        }
        

        /*String [] strings = new String[3];
        strings[0] = "aaa";
        strings[1] = "bbb";
        strings[2] = "ccc";*/
        
        
       System.out.println("object r1: " + r1.toString());//the default prints:: 0object r1: classworkrectangledemo.Rectangle@15db9742
       
       if (r1.equals(array[0]))
       {
           System.out.println("Equal");           
       }else System.out.println("Different");

    }
    
}
