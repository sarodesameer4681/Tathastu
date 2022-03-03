import java.util.Scanner;
import java.util.ArrayList;

    class ArraySam
    { 
       public static void main(String[] args) 
       {  
            int num = 0;
            int n = 0;

            ArrayList<Integer> arr = new ArrayList<Integer>(5);  
           
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter how many  numbers do you want in Array: ");
            n = sc.nextInt();

            for (num = 1; num <= n; num++)
            {
                Scanner s = new Scanner(System.in);
                System.out.print("Enter number "+ num + " : ");
                num = s.nextInt();
                arr.add(num);
            }

            System.out.println("The list of the size is: " + arr.size());  
          
            Scanner c = new Scanner(System.in);
            System.out.print("Enter value of n to remove: ");
            int rem = c.nextInt();
            arr.remove(rem);            
         
            for (Integer name : arr) 
            {  
                System.out.println("Name is: " + name);  
            } 

            System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  
        }  
    }  