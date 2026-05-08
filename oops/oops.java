package oops;
import java.util.*;

public class oops {
    public static void main(String[] args) {
        // Class and Objects 
        // Pen p1 = new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tipSize);
        // p1.color = "Red";
        // System.out.println(p1.color);

        // Access Modifiers
        // Bank user = new Bank();
        // user.username = "Divyansh";
        // user.setPass("Divyansh@123");
        // System.out.println(user.username);

        // Getters and Setters to access private variables 
        // Pen_modified p1 = new Pen_modified();
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("Red");
        // System.out.println(p1.getColor());

        // Constructors
        //Student_mod s1 = new Student_mod(); // Non- parameterized
        //System.out.println(s1.name);
        // Student_mod s2 = new Student_mod("Divyansh"); // Parameterized
        // Student_mod s3 = new Student_mod(20);

        // Copy Constructor
        // Student_mod s1 = new Student_mod();
        // s1.name = "Divyansh";
        // s1.roll = 32;
        // s1.password = "abcd";
        // s1.marks[0] = 92;
        // s1.marks[1] = 95;
        // s1.marks[2] = 90;


        // Student_mod s2 = new Student_mod(s1);
        // s2.password = "xyz";

        // s1.marks[2] = 100;

        // for (int mark : s2.marks){
        //     System.out.println(mark);
        // }
            
        // Inheritence 
        // Fish shark = new Fish();
        // shark.swims();
        // shark.breathe();
        // shark.eat();

        // Multiple Inheritence 
        // Dog dobby = new Dog();
        // dobby.breed = "Golden Retriever";
        // dobby.eat();
        // dobby.legs = 2;
        // dobby.breathe();
        // System.out.println(dobby.breed);

        // Hierarchichal Inheritence 
        // Fish starFish = new Fish();
        // starFish.swim = "yes";
        // starFish.eat();
        // starFish.breathe();
        // System.out.println(starFish.swim); 

        // Method Overloading
    //     Calculator s = new Calculator();
    //    System.out.println(s.sum(10,20));
    //    System.out.println(s.sum(10.5f,20.5f));
    //    System.out.println(s.sum(10,20,30));

        
    // Method Overriding 
    
    // Deer s = new Deer();
    // s.eat();

    // Abstraction
    // Dog d = new Dog();
    // d.eat();
    // d.walk();
    // System.out.println(d.color);
    // d.changeColor();
    // System.out.println(d.color);


    // Fish f = new Fish();
    // f.eat();
    // f.walk();

    // Interface
    // Queen q = new Queen();
    // q.moves();

    // Interface implementing multiple inheritence 
    // Omnivore deer = new Omnivore();
    // deer.eatsPlants();
    // deer.eatsMeat();

    // static Keyword
    // Student s1 = new Student();
    // s1.schoolName = "PCS";

    // Student s2 = new Student();
    // System.out.println(s2.schoolName);

    // Student s3 = new Student();
    // s3.schoolName = "SVA";  
    // }

    // super Keyword
    // Horse h = new Horse();
    // System.out.println(h.color);

    // Sheet

    //q1
    Complex c1 = new Complex(1, 2);
    Complex c2  = new Complex(3, 4);

    Complex sum = c1.sum(c2);
    Complex diff = c1.diff(c2);
    Complex prod = c1.prod(c2);

    sum.display();
    diff.display();
    prod.display();

    
}

}
// Class and Objects 
class Pen{
    String color;
    int tipSize;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int new_tip_size){
        tipSize = new_tip_size;
    }
}

// class Student{
//     String name;
//     int percentage;
//     void setName(String newName){
//         name = newName;
//     }
//     void getPercentage(int phy, int chem, int math){
//         percentage = (phy+chem+math)/3;
//     }
// }

// Access Modifiers
class Bank{
    public String username;
    private String password;
    void setPass(String pwd){
        password = pwd;
    }
}

 // Getters and Setters to access private variables

 class Pen_modified{
    private String color;
    private int tipSize;
    void setColor(String newColor){
        color = newColor;
    }
    String getColor(){
        return color;
    }
    void setTip(int new_tip_size){
        tipSize = new_tip_size;
    }
    int getTip(){
        return tipSize;
    }
}

// Constructors
class Student_mod{
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow Copy Constructor
    // Student_mod(Student_mod s1){
        // marks = new int[3]; 
        // this.name = s1.name;
        // this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // Deep Copy Constructor
    Student_mod(Student_mod s1){
            marks = new int[3]; 
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i=0;i<marks.length;i++){
                this.marks[i] = s1.marks[i];
            }
    }

    // Non-parameterized
    Student_mod(){
        marks = new int[3];
        System.out.println("This is a constructor");
    } 

    // Parameterized
    Student_mod(String name){
        marks = new int[3];
        this.name = name;
    }
    Student_mod(int roll){
        marks = new int[3];
        this.roll = roll; 
    }
    

}

// Inheritence
// class Animal {
//     String color;

//     void breathe(){
//         System.out.println("breathe");
//     }
//     void eat(){
//         System.out.println("eats");
//     }
// }

// class Mammal extends Animal{
//     int legs;
// }

// class Dog extends Mammal{
//     String breed;
// }

// class Fish extends Animal{
//     int fins;

//     void swims(){
//         System.out.println("Swims in water");
//     }
// }

// Hierarchichal Inheritence 

// class Animal {
//     String color;

//     void breathe(){
//         System.out.println("breathe");
//     }
//     void eat(){
//         System.out.println("eats");
//     }
// }

// class Mammal extends Animal{
//     int legs;
// }

// class Fish extends Animal {
//     String swim;
// }

// class Dog extends Animal{
//     String breed;
// }

// Method Overloading

// class Calculator {
//     int sum(int a, int b){
//         return a+b;
//     }
//     float sum(float a, float b){
//         return a+b;
//     }
//     int sum(int a, int b, int c){
//         return a+b+c;
//     }
// }

// Method Overriding 

// class Animal{
//     void eat(){
//         System.out.println("eats everything");
//     }
// }
 
// class Deer extends Animal {
//     void eat(){
//         System.out.println("eats grass");
//     }  
// } 

// Abstraction

// abstract class Animal{
//     String color;
//     Animal(){
//         color = "brown";
//     }
//     void eat(){
//         System.out.println("Animal Eats");
//     }

//     abstract void walk();
// }

// class Dog extends Animal{
//     void changeColor(){
//         color = "dark brown";
//     }
//     void walk(){
//         System.out.println("Dog walks on four legs");
//     }
// }

// class Fish extends Animal{
//     void changeColor(){
//         color = "Blue";
//     }
//     void walk(){
//         System.out.println("Fish do not walk it swims");
//     }
// }

// Interface

// interface chessPlayers{
//     void moves();
// }

// class Queen implements chessPlayers{
//     public void moves(){
//         System.out.println("up,down,left,right and diagonally(in all 4 dirns)");
//     }
// }

// class King implements chessPlayers{
//     public void moves(){
//         System.out.println("Up, down, left, right by one unit only");
//     }
// }

// class Rook implements chessPlayers {
//     public void moves() {
//         System.out.println("Up, down, left and right");
//     }    
// }

// class Pawn implements chessPlayers  {
//     public void moves(){
//         System.out.println("Only forward by one and initially two");
//     }
// }

// Interface implementing multiple inheritence 
// interface Herbivorous {
//     void eatsPlants();
// }

// interface Carnivorous {
//     void eatsMeat();
// }

// class Omnivore implements Herbivorous, Carnivorous {
//     public void eatsPlants() {
//         System.out.println("Eats plants");
//     }
//     public void eatsMeat() {
//         System.out.println("Eats meat");
//     }
// }

//static Keyword

// class Student {

//     // same shared by all objects 
//     static int percentage(int maths, int phys, int chem){
//         return (maths+phys+chem)/3;
//     }
//     int rollNo;
//     String name;

//     static String schoolName;

//     void setRoll(int rollNo){
//         this.rollNo = rollNo;
//     }
//     int getRoll(){
//         return this.rollNo;
//     }
    
// }

//super Keyword
// class Animal {
//     String color;
//     Animal(){
//         System.out.println("Animal constructor is called");
//     }
// }

// class Horse extends Animal  {
//     Horse(){
//         super.color = "brown";
//         System.out.println("Horse constructor is called");
//     }
// }

// Sheet

//q1 
class Complex{
    double real, img;
    Complex(double real, double img){
        this.real = real;
        this.img = img;
    }
    Complex sum(Complex c){
        return new Complex(this.real+c.real,this.img+c.img);
    }
    Complex diff(Complex c){
        return new Complex(this.real-c.real, this.img-c.img);
    }
    Complex prod(Complex c){
        double realPart = this.real * c.real - this.img * c.img;
        double imgPart = this.real * c.real + this.img * c.img;
        return new Complex(realPart, imgPart);
    }

    void display(){
        System.out.println("Real Part: "+this.real+ "\nImaginary Part: "+ this.img);
    }
}
    
    