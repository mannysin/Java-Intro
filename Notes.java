// Single line comment

/*
Multi
Line
Comment
*/

//importing libraries in Java
import java.util.Scanner;
import java.util.*;


// anybody can access a public

public class Animal {

    //fields are as follows
    public static final double FAVNUMBER = 1.6180;


    /*
    Private fields can be assesed by other methods in the class and thats it. Good idea to have
    all your fields labled as private
    Fields are attributes
    */

    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;


    //protected means this code can only be assessed by other files in the package
    protected static int numberOfAnimals = 0;

    //Scanner takes in user input
    static Scanner userinput = new Animal(System.in)

    //anytime an object is created, you need a constructor function
    public Animal() {
        numberOfAnimals++;


        //mathematical operators
        int sumOfNumbers = 5 + 1;
        System.out.println("5 + 1 = " + sumOfNumbers); 

        int diffOfNumbers = 5 +1;
        System.out.println("5 + 1 = " + diffOfNumbers);
        
        int multOfNumbers = 5 +1;
        System.out.println("5 + 1 = " + multOfNumbers);
        
        int divOfNumbers = 5 +1;
        System.out.println("5 + 1 = " + divOfNumbers);
        
        int sumOfNumbers = 5 +1;
        System.out.println("5 + 1 = " + sumOfNumbers);  
    }

}