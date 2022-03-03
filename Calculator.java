import java.util.Scanner;
class Calculator 
{
    public static void main(String[] args) 
    {
        int operator;
        double num1, num2, result;
        
        Scanner input = new Scanner(System.in);
            
            System.out.print("Choose the Operation: ");
            operator = input.nextInt();
            
            System.out.print("Enter Number 1: ");
            num1 = input.nextDouble();
            
            System.out.print("Enter Number 2: ");
            num2 = input.nextDouble();
            
            
                switch(operator)
                {
                    case 1:
                        {
                            result = num1 + num2;
                            System.out.println(result);
                            break;
                        }
                    
                    case 2:
                        {
                            result = num1 - num2;
                            System.out.println(result);
                            break;
                        }
                        
                    case 3:
                        {
                            result = num1 * num2;
                            System.out.println(result);
                            break;
                        }
                        
                    case 4:
                        {
                            result = num1 / num2;
                            System.out.println(result);
                            break;
                        }
                        
                    default:
                        {
                            System.out.println("Invalid Operator.");
                            break;
                        }    
                }
            
        
    }
}