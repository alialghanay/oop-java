package com.mycompany.studentgradesclasslevle;
import java.util.Scanner;

/**
 *
 * @author alialghanay
 */
public class StudentGradesClassLevle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("hi there!");
        System.out.println("this programe written by @alialghanay");
        System.out.println("this app help you calculate the bigger Number of your students grades, avg and!");
        System.out.println("please enter how many student you have -> \t");
        int a = in.nextInt();
        Student[] std = new Student[a];
        for(int i=0;i<a;i++){
            System.out.println("please enter student number " + (i + 1) + " id -> \t");
            int tempid = in.nextInt();
            std[i] = new Student(tempid);
            System.out.println("please enter student number " + (i + 1) + " name -> \t");
            String tempname = in.next();
            std[i].name = tempname;
            System.out.println("please enter student number " + (i + 1) + " born year -> \t");
            int tempbornyear =  in.nextInt();
            std[i].bornYear = tempbornyear;
            System.out.println("please enter student number " + (i + 1) + " grade -> \t");
            int tempgrede =  in.nextInt();
            std[i].grade = tempgrede;
        }
        while(true){
            System.out.println("now what is youn want to see from the data you entered?");
            System.out.println("1. Avrege age of your student");
            System.out.println("2. the highist grade of your student");
            System.out.println("3. print all names of your student");
            System.out.println("chose by number:");
            System.out.print("can you please enter your number ->\t");
            int num = in.nextInt();
            switch (num) {
                case 1 -> System.out.println("the age Avrege of your Student is " + avgArray(std));
                case 2 -> System.out.println("the highist grade of your student is" + maxNum(std));
                case 3 -> readArray(std);
                default -> System.err.println("the number you entered not in the range");
            }
           System.out.println("is that it or you want to countuine?");
           System.out.println("(Y) for countuine any ohter key for stop!");
           char s = in.next().charAt(0);
           if(s != 'y' || s != 'Y'){
           }else break;
        }
        System.out.println("see you!");
    }
    
    private static void readArray(Student[] arr){
        int a = arr.length;
        for(int i=0;i<a;i++){
            System.out.println((arr[i].id) + " -> " + (arr[i].name) + " ");
        }
        System.out.println();
    }
    private static int maxNum(Student[] arr){
        int a = arr.length;
        int max = 0;
        for(int i=0;i<a;i++){
            if(arr[i].grade > max){
                max = arr[i].grade;
            }
        }
        return max;
    }
    private static int avgArray(Student[] arr){
        int a = arr.length;
        int sum = 0;
        for(int i=0;i<a;i++){
            sum += arr[i].age();
        }
        int avg = sum / a;
        return avg;
    }

}

