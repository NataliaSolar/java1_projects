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
public class Box {
    
    private Rectangle base;//aggrigation (a field of a class type)
    private double heigth;
    
    public Box()
    {
        base = new Rectangle();
        heigth =1;
    }
    
    public Box(double len, double wid, double h)
    {
        base = new Rectangle(len, wid);
        if (h<=0) throw new IllegalArgumentException ("heigth cannot be negative" + h);
        else this.heigth = h;
    }
    
    public Box(Rectangle b, double h)
    {
       // base = b; //shallow copy
        base = new Rectangle(b);//deep copy
        if (h<=0) throw new IllegalArgumentException ("heigth cannot be negative" + h);
        else this.heigth = h;
    }
    
    public void setBase(Rectangle b)
    {
        base  = new Rectangle(b);
    }
    
    //privacy leak
   // public Rectangle getBase()
    //{
       // return base;//mistake
    //}
    
    public Rectangle getBase()
    {
        //return a copy of the private field
        return new Rectangle(base);
    }
    
    @Override public String toString()
    {
        return  "Width = " + base.getWidth() + "; Length = "+ base.getLength()+" Heigth = "+ heigth;
        
    }
    
}
