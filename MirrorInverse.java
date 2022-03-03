import java.util.Scanner;

public class MirrorInverse
{
    public static void main(String args[])
    {
        int num;
        int i = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements do you want in array: ");
        num = input.nextInt();
        int arr[] = new int [num];
        System.out.println("Enter elements: ");
        for (i = 0; i < num; i++)
        {
            arr[i] = input.nextInt();

        }

        System.out.println("Array elements are: ");
        for (i = 0; i < num; i++);
        {
            System.out.println(arr[i]);
        }
        for (i = 0; i < arr.length; i++);
        {
            if (arr[arr[i]] == i)
            {
                count++;
            }

        }
        if (count != 0)
        {
            System.out.println("The given array " + arr[i] +" is Mirror Inverse.");
        }

        else
        {
            System.out.println("The given array " + arr[i] + "is not a Mirror Inverse.");
        }
    }
}