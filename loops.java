// import java.util.*;

public class loops
{
    public static void printMultiplication(int number)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(number+"*"+i+"="+number*i);
        }
    }
    public static void main(String args[])
    {
        // While loops
        //int counter=0;
        // while(counter<100)
        // {
        //     System.out.println("Hello World");
        //     counter++;
        // }

        // while(true)
        // {
        //     System.out.println("Hello");
        // }

        //System.out.println("hello");

        // Print numbers from 1 to 10
        
        // int counter=1;
        // while(counter<=10)
        // {
        //     System.out.print(counter+" ");
        //     counter++;
        // }

        // Print numbers from 1 to n 
        // Scanner s = new Scanner(System.in);
        // int counter=1;
        // int range = s.nextInt();
        // while(counter<=range)
        // {
        //     System.out.print(counter+" ");
        //     counter++;
        // }
        // s.close();

        // Sum of n natural numbers
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int sum=0;
        // int i=1;
        // while(i<=n)
        // {
        //     sum+=i;
        //     i++;
        // }
        // System.out.println("Sum is="+sum);
        // s.close(); 

        //For loop
        // for(int i=1;i<=10;i++)
        // {
        //     System.out.println("Hello World");
        // }

        //Square Pattern
        // for(int i=1;i<=4;i++)
        // {
        //     System.out.println("****");
        // }

        // int line=1;
        // while(line<=4)
        // {
        //     System.out.println("****");
        //     line++;
        // }

        //Print reverse of a number 
        // Scanner s = new Scanner(System.in);
        // int num = s.nextInt();
        // int lastdigit;
        // while(num>0)
        // {
        //     lastdigit=num%10;
        //     System.out.print(lastdigit);
        //     num/=10;
        // }
        // s.close();

        //Reverse the og number
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int rev=0, last_digit=0;
        // while(n>0)
        // {
        //     last_digit= n%10;
        //     rev =(rev*10)+last_digit;
        //     n=n/10;        
        // }
        // System.out.println(rev);
        // s.close();

        // Do While Loop
        // int counter =1;
        // do
        // {
        //     System.out.println("Hello World");
        //     counter++;
        // }while(counter<=10);

        //break statement

        // for(int i=1;i<=5;i++)
        // {
        //     if(i==3)
        //     {
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("Loop escaped");

        //question (Scanner for multiple of 10)

        // Scanner s = new Scanner(System.in);
        // while(true)
        // {
        //     int number = s.nextInt();
        //     if(number%10==0)
        //     {
        //         break;
        //     }
        //     System.out.println("Number="+number);
        // }
        // System.out.println("Loop escaped");
        // s.close();

        // Countinue Keyword
        // for(int i=1;i<=5;i++)
        // {
        //     if(i==3)
        //     {
        //       continue;
        //     }
        //     System.out.println(i);
        // }

        // 
        // Scanner s = new Scanner(System.in);
        // do
        // {
        //     System.out.print("Enter your number :");
        //     int number = s.nextInt();
        //     if(number%10==0)
        //     {
        //         continue;
        //     }
        //     System.out.println("Number was="+number);
        // }while(true);

        // Prime number Checker
        // Scanner s = new Scanner(System.in);
        // int num = s.nextInt();
        // if(num==2)
        // {
        //     System.out.println("Prime number");
        // }
        // else
        // {
        //     boolean isPrime = true;
        //     for(int i=2;i<=Math.sqrt(num);i++) // Using  math class to find square root
        //     {
        //         if(num%i==0) // n is multiple of i (i is not equal to 1 or n)
        //         {
        //             isPrime = false;
        //         }
        //     }

        //     if(isPrime==true)
        //     {
        //         System.out.println("Prime Number.");
        //     }
        //     else
        //     {
        //         System.out.println("Not a prime number.");
        //     }
        // }
        // s.close();

        // Questions 
        //q1
        // for(int i=0;i<5;i++)
        // {
        //     System.out.println("Hello");
        //     i+=2;
        // }

        //q2
        // Scanner sc = new Scanner(System.in);
        // int choice,temp,sum_even=0,sum_odd=0;
        // do
        // {
        //     System.out.print("Enter a number:");
        //     temp=sc.nextInt();
        //     if(temp%2==0)
        //     {
        //         sum_even+=temp;
        //     }
        //     else
        //     {
        //         sum_odd+=temp;
        //     }
        //     System.out.print("Do you want continue ? Press 1 for yes and 0 for no:");
        //     choice = sc.nextInt();
        
        // }while(choice==1);
        // System.out.println("Sum of even terms:"+sum_even);
        // System.out.println("Sum of odd terms:"+sum_odd);
        // sc.close();

        //q3
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number:");
        // int num = sc.nextInt(); 
        // int factorial=1;
        // while (num>0) 
        // {
        //     factorial*=num;
        //     num--;
        // }      
        // System.out.println("Factorial="+factorial);

        //q4

        // printMultiplication(8);

        // q5

        // for(int i=0;i<=5;i++)
        // {
        //     System.out.println(i);
        // }
        // System.out.println("i after loop is:"+i);// i cannot be used here as scope of i ends after for loop.
    } 
}
