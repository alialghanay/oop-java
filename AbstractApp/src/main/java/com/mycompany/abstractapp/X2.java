/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractapp;

import java.util.Scanner;

/**
 *
 * @author alialghanay
 */
final public class X2 extends X1{
  private Scanner in = new Scanner(System.in);
  int n1, n2, n3;
  public void numbers(){
          System.out.println("please enter a number:");
          this.n1 = in.nextInt();
          System.out.println("please enter a number:");
          this.n2 = in.nextInt();
          System.out.println("please enter a number:");
          this.n3 = in.nextInt();

  }
  @Override
  int max(){
      int n1 = this.n1;
      int n2 = this.n2;
      int n3 = this.n3;
      int result = Math.max(n1, n2);
      result = Math.max(result, n3);
      return result;
  }   
}
