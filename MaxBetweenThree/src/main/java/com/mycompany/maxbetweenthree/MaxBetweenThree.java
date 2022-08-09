package com.mycompany.maxbetweenthree;
import java.util.Scanner;

/**
 *
 * @author alialghanay
 */
public class MaxBetweenThree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("hi there!");
        System.out.println("this programe written by @alialghanay");
        System.out.println("this app help you calculate the bigger Number of three numbers!");
        System.out.print("can you please enter your first number ->\t");
        int a = in.nextInt();
        System.out.print("ok" + (a) + " hah! can you please enter your second number ->\t");
        int b = in.nextInt();
        System.out.print("ok" + (b) + " hah! can you please enter your third number ->\t");
        int c = in.nextInt();
        int max = a;
        if(max < b)max = b;
        if(max < c)max = c;
        System.out.println("ok the bigger number is " + (max));
        System.out.println("see you!");
    }
}
