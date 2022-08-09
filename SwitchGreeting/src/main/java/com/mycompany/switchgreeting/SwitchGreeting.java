package com.mycompany.switchgreeting;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 *
 * @author alialghanay
 */

public class SwitchGreeting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("hi there!");
        System.out.println("this programe written by @alialghanay");
        System.out.println("this app let you chose how computer greet you you can choice numbers between 1 to 3!");
        System.out.print("can you please enter your number ->\t");
        int num = in.nextInt();
        System.out.print("can you please enter your name ->\t");
        String name = in.next();
        switch (num) {
            case 1 -> System.out.println("hello " + name);
            case 2 -> System.out.println("hi " + name);
            case 3 -> System.out.println("how are you " + name);
            default -> System.err.println("the number you entered not in the range");
        }
        System.out.println("see you!");
    }
}
