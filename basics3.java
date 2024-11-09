//import java.util.*;
public class basics3 {
    public static void main(String args[])
    {
        //Type Coversion
        //  int a = 25;
        //  long b = a;
        //  System.out.println(b); // It works as both two conditions are satisfied 

        // long a = 25;
        // int b = a;
        // System.out.println(b); // error: incompatible types: possible lossy conversion from long to int, second condition is not satisfied

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextFloat(); // error: incompatible types: possible lossy conversion from float to int
        // System.out.println(a);
 
        
        // Type Casting = Carrying out a lossy conversion

        //  float a = 25.12f;
        //  int b = (int)a;
        //  System.out.println(b);

        //  float marks = 99.99f;
        //  int marks2 = (int)marks;
        //  System.out.println(marks2);

        // char ch = 'a';
        // char ch2 ='b';
        // int number = ch;
        // int number2 = ch2;
        // System.out.println(number);
        // System.out.println(number2); // Type Conversion of char to number is possible in java (ASCII Values)

        // Type Promotion 

        // char a = 'a';
        // char b = 'b';
        // //char c = a-b ; // possible lossy conversion from int to char
        // System.out.println((int)b);
        // System.out.println((int)a);
        // System.out.println(b-a);
        // System.out.println(b+a);
        // System.out.println(a);

        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte) (a+b+c);
        // System.out.println(bt);

        // int a = 10;
        // float b =20.25f;
        // long c = 25;
        // double d = 30;
        // // int ans = a+b+c+d; //possible lossy conversion from double to int
        // double ans = a+b+c+d;
        // System.out.println(ans);

        // byte b = 5;
        // // byte a = b*2; //possible lossy conversion from int to byte
        // byte a = (byte) (b*2);
        // System.out.println(a);   

        //Problems

        //q1
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // float b = sc.nextFloat();
        // double c = sc.nextDouble();
        // float avg = (float)(a+b+c)/3;
        // System.out.println(avg);

        //q2
        // Scanner sc = new Scanner(System.in);
        // float side = sc.nextFloat();
        // float area = side*side;
        // System.out.println(area);

        //q3
        // Scanner sc = new Scanner(System.in);
        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // float bill = pencil + pen + eraser;
        // float bill_with_gst = bill + (bill* 0.18f);
        // System.out.println("Total bill is:"+ bill + "\n Bill with 18% tax:"+bill_with_gst);
        
        //q4
        // byte b = 4;
        // char c ='a';
        // short s = 512;
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;
        // double result = (f*b)+ (i%c) - (d*s); // Promoted to largest datatype present
        // System.out.println(result);

        //q5
        // int $ = 5;
        // System.out.println($);
    }
    
}
