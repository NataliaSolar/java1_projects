
package datedemo;

/**
 *
 * @author Natalia Solar
 */
public class Date {
    private String month;
    private int day;
    private int year; //a four digit number.

    /**
     * Non-argument constructor that sets the date to 1/1/1000
     */
    public Date( )
    {
        month = "January";
        day = 1;
        year = 1000;
    }
    
    /**
     * a constructor that sets the month, day and year of the date
     * @param monthInt the month of the date (integer value)
     * @param day the day of the date
     * @param year the year of the date
     */
    public Date(int monthInt, int day, int year)
    {
        setDate(monthInt, day, year);
    }

    /**
     * a constructor that sets the month, day and year of the date
     * @param monthString the name of the month 
     * @param day the day of the date
     * @param year the year of the date
     */
    public Date(String monthString, int day, int year)
    {
        setDate(monthString, day, year);
    }

    /**
     * a constructor that sets the year, taking it as a parameter, the month and are set to 1
     * @param year the year of the date
     */
    public Date(int year) 
    {
        setDate(1, 1, year);
    }

    /**
     * the mutator for month, day and year fields
     * @param monthInt  the month of the date (integer value)
     * @param day the day of the date
     * @param year the year of the date
     * @throws IllegalArgumentException when any of the fields doesn't meet the requirements
     */
    public void setDate(int monthInt, int day, int year) throws IllegalArgumentException
    {
        if (dateOK(monthInt, day, year))
        {
            this.month = monthString(monthInt);
            this.day = day;
            this.year = year;
        }
        else
        {
            throw new IllegalArgumentException("This date doesn't exist");
        }
    }

    /**
     * the mutator for month, day and year fields
     * @param monthString the name of the month
     * @param day the day of the date
     * @param year the year of the date
     * @throws IllegalArgumentException when any of the fields doesn't meet the requirements
     */
    public void setDate(String monthString, int day, int year) throws IllegalArgumentException
    {
        if (dateOK(monthString, day, year))
        {
            this.month = monthString;
            this.day = day;
            this.year = year;
        }
        else
        {
            throw new IllegalArgumentException("This date doesn't exist");
        }
    }

    /**
     * the mutator for month, day and year fields, the year is passed as a parameter, and month and day are set to 1
     * @param year the year of the date
     */
    public void setDate(int year)
    {
        setDate(1, 1, year);
    }

    /**
     * the mutator for year field
     * @param year the year of the date
     * @throws IllegalArgumentException when year is smaller than 1000 or greater than 9999
     */
    public void setYear(int year)  throws IllegalArgumentException
    {
        if ( (year < 1000) || (year > 9999) )
        {
            throw new IllegalArgumentException("This year doesn't exist, the year must be in range [1000;9999]");
        }
        else
            this.year = year;
    }
    
    /**
     * the mutator for month field
     * @param monthNumber number of the month in date
     * @throws IllegalArgumentException when the month is smaller than 1 or greater than 12
     */
    public void setMonth(int monthNumber)  throws IllegalArgumentException
    {
        if ((monthNumber <= 0) || (monthNumber > 12))
        {
            throw new IllegalArgumentException("This month doesn't exist, the month must be in range [1;12]");
        }
        else
            month = monthString(monthNumber);
    }

    /**
     * the mutator for day field
     * @param day the day of the date
     * @throws IllegalArgumentException when the day is smaller than 1 or greater than 31
     */
    public void setDay(int day)  throws IllegalArgumentException
    {
        if ((day <= 0) || (day > 31))
        {
            throw new IllegalArgumentException("This day doesn't exist, the day must be in range [1;31]");            
        }
        else
            this.day = day;
    }

    /**
     * accessor for month field
     * @return the number of the month
     * @throws IllegalArgumentException when the name of the month is misspelled
     */
    public int getMonth( )  throws IllegalArgumentException
    {
        if (month.equals("January"))
            return 1;
        else if (month.equals("February"))
            return 2;
        else if (month.equalsIgnoreCase("March"))
            return 3;
        else if (month.equalsIgnoreCase("April"))
            return 4;
        else if (month.equalsIgnoreCase("May"))
            return 5;
        else if (month.equals("June"))
            return 6;
        else if (month.equalsIgnoreCase("July"))
            return 7;
        else if (month.equalsIgnoreCase("August"))
            return 8;
        else if (month.equalsIgnoreCase("September"))
            return 9;
        else if (month.equalsIgnoreCase("October"))
            return 10;
        else if (month.equals("November"))
            return 11;
        else if (month.equals("December"))
            return 12;
        else
        {
            throw new IllegalArgumentException("This month doesn't exist, check the spelling");
        }
    }

    /**
     * accessor for day field
     * @return the day of the date
     */
    public int getDay( )
    {
        return day;
    }

    /**
     * accessor for year field
     * @return the year of the date
     */
    public int getYear( )
    {
        return year;
    }

   
    /**
     * method to check if all parameters meet the requirements
     * @param monthInt the month of the date
     * @param dayInt the day of the date
     * @param yearInt the year of the date
     * @return true or false
     */
    private boolean dateOK(int monthInt, int dayInt, int yearInt)
    {
        return ( (monthInt >= 1) && (monthInt <= 12) &&
                 (dayInt >= 1) && (dayInt <= 31) &&
                 (yearInt >= 1000) && (yearInt <= 9999) );
    }

    /**
     * method to check if all parameters meet the requirements
     * @param monthString the name of the month 
     * @param dayInt the day of the date
     * @param yearInt the year of the date
     * @return true or false 
     */
    private boolean dateOK(String monthString, int dayInt, int yearInt)
    {
        return ( monthOK(monthString) &&
                 (dayInt >= 1) && (dayInt <= 31) &&
                 (yearInt >= 1000) && (yearInt <= 9999) );
    }

    /**
     * method to check if the month is ok
     * @param month the name of the month
     * @return true or false
     */
    private boolean monthOK(String month)
    {
        return (month.equals("January") || month.equals("February") ||
                month.equals("March") || month.equals("April") ||
                month.equals("May") || month.equals("June") ||
                month.equals("July") || month.equals("August") ||
                month.equals("September") || month.equals("October") ||
                month.equals("November") || month.equals("December") );
    }

    /**
     * method to convert the number of the month to the name of the month
     * @param monthNumber the number of the month
     * @return the name of the month
     * @throws IllegalArgumentException when the number of the month is not in the range between 1 and 12
     */
    private String monthString(int monthNumber) throws IllegalArgumentException
    {
        switch (monthNumber)
        {
        case 1:
            return "January";            
        case 2:
            return "February";
        case 3:
            return "March";
        case 4:
            return "April";
        case 5:
            return "May";
        case 6:
            return "June";
        case 7:
            return "July";
        case 8:
            return "August";
        case 9:
            return "September";
        case 10:
            return "October";
        case 11:
            return "November";
        case 12:
            return "December";
        default:
            throw new IllegalArgumentException("This month doesn't exist, the month must be in range [1;12] ");
        }
    }
    
    /**
     * method to print the date in mm/dd/yyyy format
     * @param monthInt month of the date (integer)
     * @param dayInt day of the date
     * @param yearInt year of the date
     */
    public void printDate1(int monthInt, int dayInt, int yearInt)
        {
            System.out.printf("%d/%d/%d\n", monthInt, dayInt, yearInt);
            System.out.println("---------------");
        }
    
    /**
     * method to print the date in "Month dd yyyy" format
     * @param monthInt month of the date (integer)
     * @param dayInt day of the date
     * @param yearInt year of the date 
     */
    public void printDate2(int monthInt, int dayInt, int yearInt)
        {
            String monthString = monthString(monthInt);
            System.out.printf("%s %d, %d\n", monthString, dayInt, yearInt);
            System.out.println("---------------");
        }
    
    /**
     * method to print the date in "dd Month yyyy" format
     * @param monthInt month of the date (integer)
     * @param dayInt day of the date
     * @param yearInt year of the date 
     */
    public void printDate3(int monthInt, int dayInt, int yearInt)
        {
            String monthString = monthString(monthInt);
            System.out.printf("%d %s %d\n", dayInt, monthString, yearInt);
            System.out.println("---------------");
        }
}

