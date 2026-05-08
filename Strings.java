import java.util.*;
import java.util.Arrays;
public class Strings {
    // Traversing String
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    // Palindrome Checker
    public static boolean isPalindrome(String str){
        int length = str.length();
        for(int i=0;i<length/2;i++){
            if(str.charAt(i)!=str.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
    //Shortest Path
    public static float Shortest_path(String str){
        char ch;
        int x=0,y=0;
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            if(ch=='E') x++;
            else if(ch=='W') x--;
            else if(ch=='N') y++;
            else y--;
        }
        double displace = Math.sqrt(((x*x)+(y*y)));
        return (float)displace;
    }
    //Substring
    public static String subString(String str,int si,int ei){
        String subStr="";
        for(int i=si;i<ei;i++){
            subStr+=str.charAt(i);
        }
        return subStr;
    }
    // First letters to uppercase
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
                
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    // String Compression
    public static String stringCompress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        // char arr[] = {'a','b','c','d'};
        
        // // String declaration
        // String str = "abcd";
        // String str2 = new String("xyz@#1234");

        // // Strings are IMMUTABLE

        // // Input output in Strings 
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // Length of string 

        // String fullName = "Divyansh Gupta";
        // System.out.println(fullName.length());

        // Concatenation

        // String firstName = "Divyansh";
        // String lastName = "Gupta";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName + " is a Software Developer."); 

        // Traversing through a String
        // printLetters(fullName);

        // Palindrome Checker
        // String str = "racecar";
        // System.out.println(isPalindrome(str));

        // Shortest distance for a Path 

        // String path = "WNEENESENNN";
        // System.out.println(Shortest_path(path));

        // Comparing Strings
        // Concept of interning : String interning in Java is a process that optimizes memory usage by storing only one copy of each distinct string value in a special memory area called the "string pool." This pool is part of the Java heap memory
        // String s1 = "Tony";
        // String s2 = "Tony"; // Points to the same object as s1
        // String s3 = new String("Tony"); // Forms a new object as new is used

        // if(s1==s2){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("String are not equal");
        // }

        // if(s1==s3){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("String are not equal");
        // }
        
        // equals method : Checks only value

        // if(s1.equals(s3)){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }

        // Substring

        // String str = "HelloWorld";
        // //System.out.println(subString(str, 0, 5));
        // // Inbuilt Method 
        // System.out.println(str.substring(0,5));

        //  compareToIgnoreCase() Method : Comapres strings in lexicographic order

        // String fruits[] = {"apple","mango","banana"};
        // String largest = fruits[0];
        // for(int i=1;i<fruits.length;i++)
        // {
        //     if(largest.compareToIgnoreCase(fruits[i])<0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);
        

        // String Builder

        // StringBuilder sb = new StringBuilder("");
        // // Time Complexity : O(26)
        // for(char ch ='a';ch<='z';ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);
        // System.out.println(sb.length());
        
        // q4 : first letter uppercase
        // String str = "hi, i am divyansh full stack developer at intuit";
        // System.out.println(toUpperCase(str));

        // q5 : String Compression

        // String str = "aabbcddddd";
        // System.out.println(stringCompress(str));
        

        // Sheet 

        //q1
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string: ");
        // String s = sc.next();
        // StringBuilder sb = new StringBuilder(s);
        // int count =0;
        // for(int i=0;i<sb.length();i++){
        //     char ch = sb.charAt(i);
        //     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        //         count++;
        //     }
        // }
        // System.out.println(count);
        // sc.close();

        //q4

        String str1 = "Earth";
        String str2 = "Heart";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()==str2.length()){
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean result = Arrays.equals(str1CharArray,str2CharArray);

            if(result){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }

        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
