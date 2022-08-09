package com.mycompany.classlevel;

/**
 *
 * @author alialghanay
 */
public class X1 {
    int max(int[] a){
        int temp = 0;
        for(int i = 0; i<a.length; i++){
            temp = Math.max(temp, a[i]);
        }
        return temp;
    } 
}
