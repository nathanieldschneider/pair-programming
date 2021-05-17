package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(factorial(120));
        System.out.println(goldilocks(70,30).toString());
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

    public static List<Integer> goldilocks(int weight,int tempTolerance){
        //supremely lazy
        int[] chair1 = {30,30};
        int[] chair2 = {130,130};
        int[] chair3 = {60,50};
        int[] chair4 = {150,150};
        int[] chair5 = {120,90};
        int[] chair6 = {120,10};
        int[] chair7 = {110,110};
        //define our list of chairsz
        List<int[]>  l = new ArrayList<int[]>();
        l.add(chair1);
        l.add(chair2);
        l.add(chair3);
        l.add(chair4);
        l.add(chair5);
        l.add(chair6);
        l.add(chair7);
        //define our return list
        List<Integer> ans = new ArrayList<Integer>();
        //loop through each chair array to find suitable matches for this needy bitch
        for(int[] chair: l){
            if(chair[0] >= weight && chair[1] <= tempTolerance){
                ans.add(l.indexOf(chair) + 1);
            }
        }

        return ans;
    }
}
