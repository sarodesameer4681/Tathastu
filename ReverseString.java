import java.util.*;

public class ReverseString
{
    public static void main(String args[]) 
    {
        String demo, reverse="";

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string to reverse: ");

        demo=in.nextLine();

        int length=demo.length();
        
        for(int i=length-1;i>=0;i--)
        reverse = reverse + demo.charAt(i);
        
        System.out.println("Reversed string: "+reverse);
    }
}