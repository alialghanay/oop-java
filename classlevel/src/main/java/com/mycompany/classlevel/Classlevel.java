package com.mycompany.classlevel;

/**
 *
 * @author alialghanay
 */
public class Classlevel {

    public static void main(String[] args) {
        X2 x = new X2();
        x.numbers();
        int[] a = {x.n1, x.n2, x.n3};
        System.out.println(x.max(a));
    }
}
