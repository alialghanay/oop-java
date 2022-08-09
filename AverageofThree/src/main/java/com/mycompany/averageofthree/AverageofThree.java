/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.averageofthree;
import java.util.Scanner;

/**
 *
 * @author alialghanay
 */
public class AverageofThree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("hi there!");
        System.out.println("this programe written by @alialghanay");
        System.out.println("this app help you calculate average of three numbers!");
        System.out.print("can you please enter your first number ->\t");
        int a = in.nextInt();
        System.out.print("ok" + (a) + " hah! can you please enter your second number ->\t");
        int b = in.nextInt();
        System.out.print("ok" + (b) + " hah! can you please enter your third number ->\t");
        int c = in.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println("ok Average equls = " + (avg));
        System.out.println("see you!");
    }
}
