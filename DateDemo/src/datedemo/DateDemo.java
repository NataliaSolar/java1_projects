
package datedemo;

/**
 *
 * @author Natalia Solar
 */
public class DateDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // set a new object with month = "January", day = 1 and year = 1000;
        Date date_1 = new Date(); 
        date_1.printDate1(date_1.getMonth(),date_1.getDay(),date_1.getYear());
        
        //set a new object with a year passed as an parameter
        Date date_6 = new Date(1999);
        date_6.printDate1(date_6.getMonth(),date_6.getDay(),date_6.getYear());
        
        try { //testing
            
            //set a new object with given values, month is passed as an integer
            Date date_2 = new Date(12,1,1995);
            date_2.printDate1(date_2.getMonth(),date_2.getDay(),date_2.getYear());

            //set a new object and pass exception producing values
            //Date date_3 = new Date(13,1,1995);
            //date_3.printDate1(date_3.getMonth(),date_3.getDay(),date_3.getYear());
            
            //set a new object with given values, month is passed as a string
            Date date_4 = new Date("February",1,1995);
            date_4.printDate2(date_4.getMonth(),date_4.getDay(),date_4.getYear());
            
            //set a new object and pass exception producing values
            //Date date_5 = new Date("Fbruary",1,1995);
            //date_5.printDate2(date_5.getMonth(),date_5.getDay(),date_5.getYear());
            
            //set new value of year to date_4 object
            date_4.setYear(2000);
            date_4.printDate2(date_4.getMonth(),date_4.getDay(),date_4.getYear());
            
            //set new value of year to date_4 object that produce an exception
            //date_4.setYear(999);
            //date_4.printDate2(date_4.getMonth(),date_4.getDay(),date_4.getYear());
            
            //set new value of month to date_4 object 
            date_4.setMonth(4);
            date_4.printDate3(date_4.getMonth(),date_4.getDay(),date_4.getYear());
            
            //set new value of month to date_4 object that produce an exception
            //date_4.setMonth(0);
            //date_4.printDate3(date_4.getMonth(),date_4.getDay(),date_4.getYear());
            
            //set new value of day to date_4 object 
            date_4.setDay(25);
            date_4.printDate3(date_4.getMonth(),date_4.getDay(),date_4.getYear());
            
            //set new value of day to date_4 object that produce an exception
            date_4.setDay(32);
            date_4.printDate3(date_4.getMonth(),date_4.getDay(),date_4.getYear());
            
        }catch (IllegalArgumentException e)   // handle the exception below
            {
                System.out.println("Exception caught! " + e.getMessage());
            }
        
    }
    
}
