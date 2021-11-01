/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysclasswork;

import java.util.Random;
import java.util.*;

/**
 *
 * @author User Account
 */
public class ArraysClasswork {

    
    
    public static void printArray(int[] nums)
    {
        System.out.println("--------------");
        for (int i=0;i<nums.length; i++)
        {
            System.out.printf("nums[%d] = %d\n", i, nums[i]);            
        }
    }
    /**
     * Finds  all values in array that are divisible by 3 and replace the with value 100
     * @param nums the array to be modified
     */
    public static void changeArray(int[] nums)
    {
        for (int i=0;i<nums.length; i++)
        {
            if (nums[i]%3==0) nums[i] = 100;
        }
    }
    /**
     * create a copy of array 
     * @param nums array to be copied
     * @return a copy of an array
     */
    public static int[] copyArray(int[] nums)
    {
        int[] copy = new int[nums.length];//allocate memory for the new array]
        for (int i=0;i<nums.length; i++)
        {
            copy[i] = nums[i];            
        }
        return copy;
    }
    
    public static boolean compareArrays(int[] a, int[] b)
    {
        //boolean equal = true;
        if(a.length != b.length) return false;
        for(int i=0; i<a.length;i++)
        {            
            if(a[i] != b[i])return false;
        }
        return true;
    }
    /**
     * 
     * @param numbers
     * @return the index of the first occurrence of the largest value in array
     */
    public static int findLargestElement01(int[] numbers)
    {
        int highest = numbers[0];
        int highestIndex =0;
        for (int i=0;i<numbers.length; i++)
        {
            if (numbers[i]>highest)//if we want to get the last index of occurence of the largest number use >=
            {
                highest = numbers[i];
                highestIndex = i;
            }                
        }
        return highestIndex;
    }
    
    public static int[] readArrayFromUserInput()
    {
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Please input the size of the array");
        int size = keyboard.nextInt();
        int[] inputArray = new int[size];
        for (int i = 0; i<size; i++)
        {
            System.out.println("please input the next element: ");
            inputArray[i] = keyboard.nextInt();
        }
        return inputArray;
    }
    
    public static void readArrayFromUserInput(int[] inputArray)
    {
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Please input the size of the array");
        int size = keyboard.nextInt();
        inputArray = new int[size];
        for (int i = 0; i<size; i++)
        {
            System.out.println("please input the next element: ");
            inputArray[i] = keyboard.nextInt();
        }     
    }
    
    public static int linearSearch (int[] a, int key)
    {
        int index = -1;
        for (int i = 0; i<a.length;i++)
        {
            if (a[i]==key) return i;
        }
        return index;
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Create a Scanner object to read input.
        Scanner keyboard= new Scanner(System.in);
        
        
        /*int size = 10;
        int [] numbers = new int[size];
        
        printArray(numbers);
        
        Random rand  = new Random();
        for (int i=0;i<numbers.length; i++)
        {
            numbers[i] = rand.nextInt(30)+1;            
        }
        
        printArray(numbers);
        changeArray(numbers);
        printArray(numbers);
        int[]c = copyArray(numbers);
        printArray(c);
        
        System.out.println("--------------");
        for(int num : numbers)
        {
            System.out.printf("%d\n", num);
        }
        System.out.println("--------------");
        for(int num : numbers)//you cannot change the array if num is a primitive type
        {
            num =0;
        }
        printArray(numbers);
        
        
        int[] a = {1,2,3,4};
        int[] b = {1,2,3};
        boolean t = compareArrays(a,b);
        System.out.println(t);  
        
        ArrayList<Integer> superArray = new ArrayList<Integer>();
        int length = rand.nextInt(15) + 1;
        for (int i = 0; i<length; i++)
        {
            superArray.add(i);
        }
        System.out.println(superArray.toString());
        if (superArray.size() >1) superArray.remove(0);
        System.out.println(superArray.toString());
        
        int[] ar= readArrayFromUserInput();
        printArray(ar);
        
        int [] arB = {1,2,3,4,6,7,23,43};
        readArrayFromUserInput(arB);
        printArray(arB);
        
        int i =linearSearch(arB, 23);
        if(i<0) System.out.println("Value was not found");
        else System.out.printf("Value %d was found in array in the position %d\n",23,i); */
        
        
        int[] f=new int[10];
        for(int i = 0;i<5;i++)
        {
            f[i]=i;
        }
        printArray(f);
        int inde = 5;
        for (int i = 5;i>=inde;i--)
        {
            f[i+1] = f[i];
        }
        f[inde]=10;
        printArray(f);
        
        inde = 0;
        for (int i = inde; i<6;i++)
        {
            f[i]=f[i+1];
        }
        printArray(f);
        f[1]=6;
        f[2]=5;
        f[3]=4;
        f[4]=2;
        printArray(f);
    
   
      int startScan, index, minIndex, minValue;

      for (startScan = 0; startScan < 4; startScan++)
      {
         minIndex = startScan;
         minValue = f[startScan];
         for(index = startScan + 1; index < 5; index++)
         {
            if (f[index] < minValue)
            {
               minValue = f[index];
               minIndex = index;
            }
         }
         f[minIndex] = f[startScan];
         f[startScan] = minValue;
      }
      printArray(f);
      
      
    
        Random random = new Random();
        // Loop over array.
        for (int i = 0; i < 5; i++) {
            // Get a random index of the array past the current index.
            // ... The argument is an exclusive bound.
            //     It will not go past the array's end.
            int randomValue = i + random.nextInt(5 - i);
            // Swap the random element with the present element.
            int randomElement = f[randomValue];
            f[randomValue] = f[i];
            f[i] = randomElement;
        }
    printArray(f);
        
    
    String text ="";
       for (int i = 0; i<5;i++)
       {
           String element = Integer.toString(f[i]) + ", ";
           text += element;
       }
       System.out.println(text);
    }
    
}
