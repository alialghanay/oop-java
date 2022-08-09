package com.mycompany.rectangle.area;
import java.util.Scanner;

/**
 *
 * @author alialghanay
 */
public class RectangleArea {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("hi there!");
        System.out.println("this programe written by @alialghanay");
        System.out.println("this app help you calculate area fo rectangle area!");
        System.out.print("can you please enter your rectangle lenght ->\t");
        int a = in.nextInt();
        System.out.print("ok" + (a) + " hah! can you please enter your rectangle width ->\t");
        int b = in.nextInt();
        System.out.println("ok lenght X width equls = " + (a * b));
        System.out.println("see you!");
    }
}
