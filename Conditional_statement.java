//import java.util.*;
public class Conditional_statement 
{
    public static void main(String arg[])
    {
        //If Else Statement
        // int age = 22;
        // if(age>=18)
        // {
        //     System.out.println("Adult : Drive, Vote");
        // }
        // if(age>13 &&age<18)
        // {
        //     System.out.println("Teenager");
        // }
        // else
        // {
        //     System.out.println("Not adult.");
        //     System.out.println();
        // }
        // Largest of 2 numbers
        // int a =1;
        // int b =5;
        // if(a>=b)
        // {
        //     System.out.println("A is greatest.");
        // }
        // else
        // {
        //     System.out.println("B is greatest.");
        // }

        // Even or Odd
        // Scanner s = new Scanner(System.in);
        // int num = s.nextInt();
        // if(num%2==0)
        // {
        //     System.out.println("Even");
        // }
        // else
        // {
        //     System.out.println("Odd");
        // }
        // s.close();

        // Else if Statements
        // int age= 13;
        // if(age>=18)
        // {
        //     System.out.println("Adult");
        // }
        // else if(age>=13 && age<18)
        // {
        //     System.out.println("Teenager");
        // }
        // else
        // {
        //     System.out.println("Child");
        // }

        // Income tax calculator
        // Scanner s = new Scanner(System.in);
        // int income = s.nextInt();
        // int tax;
        // if(income<500000)
        // {
        //     tax=0;
        // }
        // else if(income>=500000 && income<1000000)
        // {
        //     tax = (int)(income*0.2);
        // }
        // else
        // {
        //     tax = (int)(income*0.3);
        // }
        // System.out.println("Your tax is:"+ tax);
        // s.close();

        // Largest of 3 numbers
        // Scanner s = new Scanner(System.in);
        // int a = s.nextInt();
        // int b = s.nextInt();
        // int c = s.nextInt();
        // if(a>=b && a>=c)
        // {
        //     System.out.println("A is largest.");
        // }
        // else if(b>=c)
        // {
        //     System.out.println("B is greatest.");
        // }
        // else
        // {
        //     System.out.println("C is greatest.");
        // }
        // s.close();

        // Ternary Operator
        //Used for writing if else in one line 

        // int number =3;
        // String type =((number%2)==0)? "even":"odd";
        // System.out.println(type);

        // boolean larger = (5<3)?true:false;
        // System.out.println(larger);

        // pass or fail 
        // Scanner s = new Scanner(System.in);
        // int marks = s.nextInt();
        // String report = (marks>=33)? "Pass":"Fail";
        // System.out.println(report);
        // s.close();

        // Switch Statement
        // int a=2; // any data type could be taken like character, float
        // switch(a)
        // {
        //     case 1 : System.out.println("Samosa");
        //               break;
        //     case 2 : System.out.println("Burger");
        //               break;
        //     case 3 : System.out.println("Mango Shake");
        //               break;
        //     default : System.out.println("We wake up");
        // }

        // Calculator
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter a:");
        // int a = s.nextInt();
        // System.out.println("Enter b:");
        // int b = s.nextInt();
        // System.out.println("Enter operation:");
        // char operator = s.next().charAt(0);
        // switch(operator)
        // {
        //     case '+' : System.out.println(a+b);
        //     break;
        //     case '-' : System.out.println(a-b);
        //     break;
        //     case '*' : System.out.println(a*b);
        //     break;
        //     case '/' : System.out.println(a/b);
        //     break;
        //     case '%' : System.out.println(a%b);
        //     break;
        //     default : System.out.println("Invalid input");
        //     s.close();
        // }

        // Practice Problems
        //q1
        // Scanner s = new Scanner(System.in);
        // int a = s.nextInt();
        // if(a>0)
        // {
        //     System.out.println("Positive");
        // }
        // else
        // {
        //     System.out.println("Negative");
        // }
        // s.close();

        //q2
        // double temp= 103.5;
        // if(temp>100)
        // {
        //     System.out.println("You have fever.");
        // }
        // else
        // {
        //     System.out.println("You don't have fever.");
        // }

        //q3
        // Scanner s = new Scanner(System.in);
        // int number = s.nextInt();
        // switch(number)
        // { 
        //     case 1:System.out.println("Monday");
        //     break;
        //     case 2:System.out.println("Tuesday");
        //     break;
        //     case 3:System.out.println("Wednesday");
        //     break;
        //     case 4:System.out.println("Thursday");
        //     break;
        //     case 5:System.out.println("Friday");
        //     break;
        //     case 6:System.out.println("Saturday");
        //     break;
        //     case 7:System.out.println("Sunday");
        //     break;
        //     default: System.out.println("Invalid input");
        // }
        // s.close();

        //q4
        // int a=63, b=36;
        // boolean x = (a<b)? true :false;
        // int y = (a>b)? a:b;
        // System.out.println(x);
        // System.out.println(y);

        //q5
        //Leap Year
        // Scanner s = new Scanner(System.in);
        // int year = s.nextInt();
        // if(year%4==0)
        // {
        //     if(year%100==0)
        //     {
        //         if(year%400==0)
        //         {
        //             System.out.println("Leap year");
        //         }
        //         else
        //         {
        //             System.out.println("Not a leap year.");
        //         }
        //     }
        //     else
        //     {
        //         System.out.println("Leap year");
        //     }
        // }
        // else
        // {
        //     System.out.println("Not a leap year.");
        // }
        // s.close();


    }
}
