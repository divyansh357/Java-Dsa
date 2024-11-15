//import java.util.*;
public class Pattern {

    //Hollow Rectangle
    public static void hollow_rectangle(int rows,int columns)
    {
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=columns;j++)
            {
                //Cell= (i,j)
                if(i==1||i==rows||j==1||j==columns) // boundry condition
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    
    // Inverted Rotated Half Pyramid 
    public static void inverted_rotated_half_pyramid(int row)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Inverted Half Pyramid Numbers 
    public static void inverted_half_pyramid_numbers(int row)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Floyds Triangle 

    public static void floyd_triangle(int n)
    {
        int counter=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(counter+" ");
                counter++;
            } 
            System.out.println();
        }
    }

    // 0-1 Pattern 

    public static void zero_one_pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Solid Rhombus

    public static void solid_rhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Hollow Rhombus

    public static void hollow_rhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            // hollow rectangle-stars
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //Diamond Pattern

    public static void diamond_pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();   
        }
    }
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
        // int n=4;
        // char ch = 'A';
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // } 

        // Hollow Rectangle Pattern

        //hollow_rectangle(10,7);

        //Inverted and roated half pyramid

        //inverted_rotated_half_pyramid(7);

        //Inverted half pyramid numbers
        //inverted_half_pyramid_numbers(5);

        // Floyds Traingle
        //floyd_triangle(5); 
        
        // 0-1 Pattern
        //zero_one_pattern(5); 

        //Butterfly Pattern 
        //butterfly(5);

        //Solid Rhombus
        // solid_rhombus(7);

        // Hollow Rhombus
        //hollow_rhombus(7);

        // Diamond Pattern
        diamond_pattern(4);

    }
}
