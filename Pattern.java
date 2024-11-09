//import java.util.*;
public class Pattern {
    public static void main(String arg[])
    {
        //Nested Loops
        // Star Pattern
        // for(int line=1;line<=4;line++)
        // {
        //     for(int star=1;star<=line;star++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Inverted Star Pattern 

        // int n = 4;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=n-i+1;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 

        // Half Pyramid Pattern
        // int n=4;
        // for(int line=1;line<=n;line++)
        // {
        //     for(int number=1;number<=line;number++)
        //     {
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }

        // Character Pattern
        int n=4;
        char ch = 'A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        } 

        
        

    }
}
