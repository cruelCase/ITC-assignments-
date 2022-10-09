package com.example;

import java.util.Scanner;

public class OddEven {

  public static void main(String[] args) {
    
    Scanner ds = new Scanner(System.in);
    
    System.out.print("Enter a number integer: ");
    int a = ds.nextInt();
    
    int b = a % 2;
    
    
    if (b == 0) {
      System.out.println(a + " is an Even number.");
      }
    else {
       
      System.out.println(a + " is an Odd number. ");
     
      }
    }
    
  }


