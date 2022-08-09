/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.thousanddinarsaccount;

import java.util.Scanner;

/**
 *
 * @author alialghanay
 */
public class ThousandDinarsAccount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("hi there!");
        System.out.println("this programe written by @alialghanay");
        System.out.println("this app help you calculate your 1000 din on 40 din bugedt on sale");
        int thousand = 100;
        int thousanddivfourthiy = thousand / 40;
        int rimenfromthousand = thousand % 40;
        System.out.println(thousanddivfourthiy);
        System.out.println(rimenfromthousand);
    }
}
