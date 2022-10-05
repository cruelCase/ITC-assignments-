package com.example;

import java.util.Scanner;

public class Comparison {

  public static void main(String[] args) {
    Scanner dex = new Scanner(System.in);
    
    System.out.print("Enter first Integer: ");
    int a = dex.nextInt();
    
    System.out.print("Enter second Integer: ");
    int b = dex.nextInt();
    
    if (a > b) {
     System.out.println(a + " is greater);
     
   }else if (a < b){
     System.out.println(b + " is greater);
   } else {
     System.out.println("They are equal");
   }
    
    
  }

}
