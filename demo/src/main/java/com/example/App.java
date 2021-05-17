package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(factorial(120));
    }

    public static int factorial(int given){

        //return the factorial of the number given
    
        int current = given;
        int c = 1;

        do{
            c++;
            current = current/c;
            
        }while(current != 1);

        return c;

    }
}
