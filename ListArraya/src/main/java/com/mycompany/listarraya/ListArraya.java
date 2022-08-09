package com.mycompany.listarraya;
import java.util.Scanner;

/**
 *
 * @author alialghanay
 */
public class ListArraya {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("hi there!");
        System.out.println("this programe written by @alialghanay");
        System.out.println("this app help you calculate the bigger Number of your students grades, avg and!");
        System.out.println("please enter how many student you have -> \t");
        int a = in.nextInt();
        int[] std = new int[a];
        int temp;
        for(int i=0;i<a;i++){
            System.out.println("please enter student number " + (i + 1) + " grade -> \t");
            temp = in.nextInt();
            std[i] = temp;
        }
        while(true){
            System.out.println("now what is youn want to see from the data you entered?");
            System.out.println("1. Avrege of the grades");
            System.out.println("2. the highist grade of your student");
            System.out.println("3. print all the grades");
            System.out.println("chose by number:");
            System.out.print("can you please enter your number ->\t");
            int num = in.nextInt();
            switch (num) {
                case 1 -> System.out.println("the grades Avrege of your Student is " + avgArray(std));
                case 2 -> System.out.println("the highist grade of your student is" + maxNum(std));
                case 3 -> readArray(std);
                default -> System.err.println("the number you entered not in the range");
            }
           System.out.println("is that it or you want to countuine?");
           System.out.println("(Y) for countuine any ohter key for stop!");
           char s = in.next().charAt(0);
           if(s == 'y' || s == 'Y'){
               continue;
           }else break;
        }
        System.out.println("see you!");
    }
    
    private static void readArray(int[] arr){
        int a = arr.length;
        for(int i=0;i<a;i++){
            System.out.println(i + " -> " + (arr[i]) + " ");
        }
        System.out.println();
    }
    private static int maxNum(int[] arr){
        int a = arr.length;
        int max = 0;
        for(int i=0;i<a;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    private static int avgArray(int[] arr){
        int a = arr.length;
        int sum = 0;
        for(int i=0;i<a;i++){
            sum += arr[i];
        }
        int avg = sum / a;
        return avg;
    }
}
