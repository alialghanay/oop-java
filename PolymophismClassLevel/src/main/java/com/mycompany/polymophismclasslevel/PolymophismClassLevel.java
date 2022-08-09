/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.polymophismclasslevel;

/**
 *
 * @author alialghanay
 */
public class PolymophismClassLevel {

    public static void main(String[] args) {
        D d = new D();
        A a = new A();
        B b = new B();
        a.Add(10, 20);
        b.Add(10, 20);
        d.Add(a, 50, 25);
        d.Add(b, 50, 25);
        System.out.println("Hello World!");
    }
}
