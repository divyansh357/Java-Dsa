//import java.util.*;
public class fxn_mehod
{
    public static void printHelloWorld()
    {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    // Syntax with parameters
    public static int calculateSum(int num1,int num2) // parameters or formal parameters
    {
       
        int sum = num1+num2;
        return sum;
    }

    // Call by value (Swapping)

    public static void swap(int a,int b)
    {
        int temp =a;
        a=b;
        b=temp;  
    }
    
    // Product of a and b
    public static int multiply(int a,int b)
    {
        int product = a*b;
        return product;
    }

    // Factorial of n 
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i; 
        }
        return f;
    }

    // Binomial Coefficient

    public static int binomialcoeff(int n,int r)
    {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int binomialcoeff = n_fact/(r_fact*nmr_fact);
        return binomialcoeff;
    }

    // Fxn Overloading- Using Parameters

    // public static int sum(int a,int b)
    // {
    //     return a+b;
    // }
    // public static int sum(int a,int b,int c)
    // {
    //     return a+b+c;
    // }

    // Fxn Overloading- Using Datatype

    public static int sum(int a,int b)
    {
        return a+b;
    }

    public static float sum(float a,float b)
    {
        return a+b;
    }

    // Prime Checker
    // Only for n>=2
    // public static boolean isPrime(int n)
    // {

    //     //Corner Cases
    //     //2
    //     if(n==2)
    //     {
    //         return true;
    //     }

    //     for(int i=2;i<=n-1;i++)
    //     {
    //         if(n%i==0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // Prime Checker- Optimized Approach
    public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true; 
    }

    public static void primes_in_range(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    // Binary to decimal converter

    public static void converter(int bin)
    {
        int myNum=bin;
        int dec=0;
        int pow=0;
        while(bin>0)
        {
            int ld= bin%10;
            dec=dec+(ld*(int)Math.pow(2,pow));
            pow++;
            bin/=10;
        }       
        System.out.println("Decimal of "+myNum+" = "+dec);
    }

    // decimal to binary

    public static void dectobin(int dec)
    {
        int myNum = dec;
        int bin=0,pow=0,remind=0;
        while (dec>0) 
        {
            remind= dec%2;
            bin = bin + remind*(int)Math.pow(10,pow);
            dec/=2;
            pow++;
        }
        System.out.println("Binary of "+myNum+" = "+bin);
    }
    public static void avg(int a,int b, int c)
    {
        int avg = (a+b+c)/3;
        System.out.println("Average = "+avg);
    }
    public static boolean isEven(int num)
    {
        boolean isEven = true;
        if(num%2==0)
        {
            return isEven;
        }
        else
        {
            isEven= false;
            return isEven;
        }
    }

    public static boolean isPalindrome(int num)
    {
        int rem=0,rev=0,myNum=num;
        while(num>0)
        { 
            rem = num%10;
            rev = rev*10 + rem;
            num/=10;
        }
        if(myNum==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int num_sum(int num)
    {
        int r,sum=0;
        while(num>0)
        {
            r = num%10;
            sum = sum + r;
            num/=10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        //printHelloWorld(); // function call
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b =sc.nextInt();
        // int sum = calculateSum(a,b);  // arguments or actual parameters

        // System.out.println("Sum is:"+sum);
        // sc.close();

        // swap values
        // int a=5;
        // int b=10;
        // swap(a, b);
        // System.out.println("a:"+a);
        // System.out.println("b:"+b);

        // Values are not swapped as call by value is used

        // Product

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = multiply(a,b);
        // System.out.println("Product="+product);

        // product=multiply(10,20);
        // System.out.println("Product="+product);
        // sc.close();

        // Factorial

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println("Factorial:"+factorial(n));
        // sc.close();

        // Binomial Coefficient

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int r = sc.nextInt();
        // System.out.println("Binomial Coefficient:"+binomialcoeff(n,r));
        // sc.close();

        // Fxn Overloading- Using Parameter
        // System.out.println(sum(3,5));
        // System.out.println(sum(5,2,1));
         
        //Fxn Overloading- Using Datatype
        // System.out.println(sum(5,3));
        // System.out.println(sum(3.2f,4.8f));

        //Prime Checker
        //Always use the optimized Approach

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number to check:");
        // int n = sc.nextInt();
        // System.out.println(isPrime(n));
        // sc.close();

        // Print all primes in a Range
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the range:");
        // int n = sc.nextInt();
        // primes_in_range(n);
        // sc.close();

        // Bianry to decimal Converter

        // Scanner sc = new Scanner(System.in);
        // int binary = sc.nextInt();
        // converter(binary);
        // sc.close();

        // decimal to binary

        // Scanner sc = new Scanner(System.in);
        // int dec = sc.nextInt();
        // dectobin(dec);
        // sc.close();

        // Method Scope

        // System.out.println(s); // s cannot be resolved to a variable by compiler
        // int s=45;

        // Block Scope
        // int p =10;
        // {
        //     int s = 43;
        //     System.out.println(s);
        //     System.out.println(p);
        // }
        // //System.out.println(s); // s cannot be resolved to a variable by compiler
        // System.out.println(p);

        //Block Scope in for loop
        // for(int i=0;i<5;i++)
        // {

        // }
        //System.out.println(i);// i cannot be resolved to a variable by compiler
        // int i=10;
        // System.out.println(i);

        // Questions
        
        //q1
        //avg(2,3,4);

        //q2
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // boolean isEven = isEven(num);
        // System.out.println(isEven);
        // sc.close();

        //q3
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // boolean isPalindrome = isPalindrome(num);
        // System.out.println(isPalindrome);
        // sc.close();

        //q4
        // int a=2,b=4,c=-3;
        // System.out.println(Math.min(a,b));
        // System.out.println(Math.max(a,b));
        // System.out.println(Math.sqrt(b));
        // System.out.println(Math.pow(a,b));
        // //System.out.println(Math.avg()); // Average method does not exist in java
        // System.out.println(Math.abs(c));// returns absolute value -ve ko +ve kar deta hai
        
        //q5
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println("Sum: "+num_sum(num));
        // sc.close();
    }      
}
     
