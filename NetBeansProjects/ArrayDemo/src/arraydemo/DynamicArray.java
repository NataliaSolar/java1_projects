
package arraydemo;

import java.util.Random;

/**
 *
 * @author Natalia Solar
 */
public class DynamicArray {
    
    private int[] array;
    private int size;
    
    /**
     * Constructor with parameter.
     * @param capacity defines the capacity of initial array.
     * @throws IllegalArgumentException In case the parameter given to constructor is less than 0
     */
    public DynamicArray(int capacity) throws IllegalArgumentException
    {
        if (capacity<0) throw new IllegalArgumentException("the parameter should be non-negative number");
        array = new int[capacity];
        size = 0;
    }
    
    /**
     * No-argument constructor.
     */
    public DynamicArray()
    {
        array = new int[10];
        size = 0;
    }
    
    /**
     * Copy constructor.
     * @param objToCopyFrom object to be copied
     * @throws IllegalArgumentException if the object that was passed to copy from is null.
     */
    public DynamicArray(DynamicArray objToCopyFrom) throws IllegalArgumentException
    {
        if (objToCopyFrom == null) throw new IllegalArgumentException ("this object doesn't exist");
        this.array=objToCopyFrom.array;
        this.size = objToCopyFrom.size;
    }
    
    /**
     * Accessor for size field.
     * @return a number of occupied elements in the array.
     */
    public int getSize()
    {
        return size;
    }
    
   /**
    * Accessor returns the array.
    * @return the copy of the array field
    */
    public int [] toArray()
   {
       int[] copy = new int[array.length];//allocate memory for the new array
        for (int i=0;i<array.length; i++)
        {
            copy[i] = array[i];            
        }
        return copy;       
   }
    
    /**
     * Adds a new element to the end of the array and increments the size field.
     * @param num a new element to be added
     */
    public void push(int num)
    {
        if(size == 0)
        {
            array[size] = num;
            size++;
        }
        if (size>=array.length)//If the array is full
        {
            int newSize = array.length*2;
            int[] newArray = new int[newSize];//new array with the size equal to double the capacity of the original one.
            for (int i=0;i<array.length; i++)//copy all elements
            {
                newArray[i] = array[i];            
            }
            size++;
            newArray[size]=num;
            array = newArray;//????Use new array as an array field.
        }
        else 
        {
            array[size] = num;
            size++;
        }                        
    }
    
    /**
     * Removes the last element of the array
     * @return removed element
     * @throws RuntimeException If the array is empty 
     */
    public int pop() throws RuntimeException
    {
        if (size==0) throw new RuntimeException("Array is empty");
        int removed = array[size-1];//store the last element
        array[size-1]=0;//remove the last element
        size--;
        if(size*4<=array.length)//check the capacity of the array
        {
            int newSize = array.length/2;
            int[] newArray = new int[newSize];//new array with the size equal to half of the capacity of the original one
            for (int i=0;i<array.length; i++)//copy all elements
            {
                newArray[i] = array[i];            
            }
            array = newArray;//????Use new array as an array field.            
        }        
        return removed;
    }
    
    /**
     * Method to get an element of the array with the requested index.
     * @param index requested index
     * @return element with the requested index
     * @throws IndexOutOfBoundsException if the index provided is too large or negative
     */
    public int get(int index) throws IndexOutOfBoundsException
    {
        if(index<0||index>size-1) throw new IndexOutOfBoundsException("Illegal index");
        return array[index];
    }
    
    
    /**
     * Method to get the index of the first occurrence of the given number.
     * @param key a number to search for
     * @return the index of the first occurrence of the given number
     */
    public int indexOf(int key)
    {
        int index = -1;
        for (int i = 0; i<size;i++)
        {
            if (array[i]==key) return i;
        }
        return index;        
    }
    
    /**
     * Adds a new element (passed as parameter num) to the location of the array specified by index parameter
     * @param index location in the array foe the new element
     * @param num new element
     * @throws IndexOutOfBoundsException if the index is larger than size of the array or less than 0
     */
    public void add(int index, int num) throws IndexOutOfBoundsException
    {
        if(index<0||index>size)throw new IndexOutOfBoundsException("Illegal index");
        if (size>=array.length)//If the array is full
        {
            int newSize = array.length*2;
            int[] newArray = new int[newSize];//new array with the size equal to double the capacity of the original one.
            for (int i=0;i<array.length; i++)//copy all elements
            {
                newArray[i] = array[i];            
            }
            array = newArray;//????Use new array as an array field.
        }
        for (int i = size;i>=index;i--)
        {
            array[i+1] = array[i];
        }
        size++;
    }
    
    /**
     * Removes the element at the specified position in this array.
     * @param index index of the removed element
     * @return value of the removed element
     * @throws IndexOutOfBoundsException if the index value passed into the method is more or equal to the size or less than 0
     */
    public int remove ( int index) throws IndexOutOfBoundsException
    {
        if(index<0||index>size-1)throw new IndexOutOfBoundsException("Illegal index");
        int removed = array[index];
        for (int i = index; i<size;i++)//shifting elements
        {
            array[i]=array[i+1];
        }
        size--;
        if(size*4<=array.length)//check the capacity of the array
        {
            int newSize = array.length/2;
            int[] newArray = new int[newSize];//new array with the size equal to half of the capacity of the original one
            for (int i=0;i<array.length; i++)//copy all elements
            {
                newArray[i] = array[i];            
            }
            array = newArray;//????Use new array as an array field. 
        }
        return removed;
    }
    
    /**
     * Method to check if the array is empty
     * @return true if the size of the array is 0
     */
    public boolean isEmpty()
    {
        if (size==0) return true;
        else return false;
    }
    
    /**
     * The sort method performs a selection sort on an array. The array is sorted in ascending order.
     */
    public void sort()
   {
      int startScan, index, minIndex, minValue;

      for (startScan = 0; startScan < size-1; startScan++)
      {
         minIndex = startScan;
         minValue = array[startScan];
         for(index = startScan + 1; index < size; index++)
         {
            if (array[index] < minValue)
            {
               minValue = array[index];
               minIndex = index;
            }
         }
         array[minIndex] = array[startScan];
         array[startScan] = minValue;
      }
   }
    
    /**
     * Method to shuffle the elements of the array using Fisher–Yates shuffle algorithm.
     */
    public void shuffle() {
        Random random = new Random();
        // Loop over array.
        for (int i = 0; i < size; i++) {
            // Get a random index of the array past the current index.
            int randomValue = i + random.nextInt(size - i);
            // Swap the random element with the present element.
            int randomElement = array[randomValue];
            array[randomValue] = array[i];
            array[i] = randomElement;
        }
    }
    
    /**
     * Method to find the smallest element in the array
     * @return the smallest element
     * @throws RuntimeException if the array is empty
     */
    public int findMin()throws RuntimeException
    {
        if (size==0) throw new RuntimeException("Array is empty");
        int smallest = array[0];
        for (int i=0;i<size; i++)
        {
            if (array[i]<smallest)
            {
                smallest = array[i];
            }                
        }
        return smallest;
    }
    
    /**
     * Method to find the largest element in the array
     * @return the largest element
     * @throws RuntimeException if the array is empty
     */
    public int findMax()throws RuntimeException
    {
        if (size==0) throw new RuntimeException("Array is empty");
        int highest = array[0];
        for (int i=0;i<size; i++)
        {
            if (array[i]>highest)
            {
                highest = array[i];
            }                
        }
        return highest;
    }
    
    @Override public String toString()
    {
       String text ="";
       for (int i = 0; i<size;i++)
       {
           String element = Integer.toString(array[i]) + ", ";
           text += element;
       }
       return text;
    }
}
