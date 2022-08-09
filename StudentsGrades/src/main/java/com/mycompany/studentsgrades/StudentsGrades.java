package com.mycompany.studentsgrades;
import java.util.Scanner;

/**
 *
 * @author alialghanay
 */
public class StudentsGrades {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("hi there!");
        System.out.println("this programe written by @alialghanay");
        System.out.println("this app help you calculate the bigger Number of your students grades and avg!");
        System.out.println("please enter how many student you have -> \t");
        int a = in.nextInt();
        int[] std = new int[a];
        int temp;
        for(int i=0;i<a;i++){
            System.out.println("please enter student number " + (i + 1) + " grade -> \t");
            temp = in.nextInt();
            std[i] = temp;
        }
        int max = 0;
        int index = 0;
        int sum = 0;
        for(int i=0;i<a;i++){
            if(std[i] > max){
                max = std[i];
                index = i + 1;
            }
            sum += std[i];
        }
        int avg = sum / a;
        System.out.println("the higher grade is " + (max) + " for student number " + (index));
        System.out.println("& your student grades averge is" + (avg));
    }
}
