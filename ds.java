package com.example;

import java.util.Scanner;

public class ds{

  public static void main(String[] args) {
  
    Scanner scan = new Scanner(System.in);
    
    int smallest;
    int largest;
    
    
    System.out.print("Enter your first Interger: ");
    int a = scan.nextInt();
    
    System.out.print("Enter your Second Integer: ");
    int b = scan.nextInt();
    
    System.out.print("Enter your third Integer: ");
    int c = scan.nextInt();
    System.out.println("");
    
    System.out.println("The Sum is " + (a + b + c));
    System.out.println("The Product is " + (a * b * c));
    
    int total = (a + b + c);
    int average = total / 3;
    
    largest = a;
    if (b > largest){
      largest = b;
      
    }else if (c > largest){
      
      largest = c;
    }
    System.out.println("Largest is " + largest);
    
   smallest = a;
    if (b < smallest){
      
      smallest = b;
    } else if (c < smallest){
      
      smallest = c;
    }
    
    System.out.println("Smallest is " + smallest);
    System.out.println("Average is " + average);
    
  }

}
