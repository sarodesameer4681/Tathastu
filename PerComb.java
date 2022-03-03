import java.util.Scanner;

public class PerComb
{
    static int factorial(int n) 
    {
        int fact = 1;
        int i = 1;
        while(i <= n) 
        {
            fact *= i;
            i++;
        }
        return fact;
   }
    public static void main(String args[]) {
        int n = 0, r = 0, comb, per;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        n = sc.nextInt();

        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of r: ");
        r = s.nextInt();

        per = factorial(n) / factorial(n-r);
        System.out.println("Permutation: " + per);
        comb = factorial(n) / (factorial(r) * factorial(n-r));
        System.out.println("Combination: " + comb);
   }
}