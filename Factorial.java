import java.util.Scanner;

public class Factorial 
{
    
 
    static void factorialNumber(int num)
	{
        int fact = 1;
            
            if(num == 0 || num == 1)                    // Factorial of 0 and 1 is 1.
			{
				System.out.println("Factorial of " + num + " is 1.");
            }
 
            if(num > 0)                                // For Factorial number should be positive.
			{
            
				for(int i = 2; i <= num; i++)
				{
					fact = fact*i;
				}
				System.out.println("Factorial of " + num + " is " +fact);
            }
			else
			{
				System.out.println("Number should be non negative.");
            }          
    }     
 
    public static void main(String args[])
	{
        int number;
		
		Scanner sc = new Scanner(System.in); 

		System.out.println("Enter the number: ");
		number = sc.nextInt();
		
        factorialNumber(number);
    }
}