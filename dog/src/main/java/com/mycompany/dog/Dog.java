
package com.mycompany.dog;
import java.util.Scanner;

public class Dog {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int humanYears = sc.nextInt();
    
    
    if (humanYears==1){
      int catYears = 1*15;
      int dogYears = 1*15;
      System.out.println("Cat is " + catYears);
      System.out.println("Dog is " + dogYears);
    }
    else if (humanYears==2){
      int catYears = (1*15)+9;
      int dogYears = (1*15)+9;
      System.out.println("Cat is " + catYears);
      System.out.println("Dog is " + dogYears);
    }
    else if (humanYears>=3){
      int catYears = ((1*15)+9)+(humanYears*4);
      int dogYears = ((1*15)+9)+(humanYears*5);
      System.out.println("Cat is " + catYears);
      System.out.println("Dog is " + dogYears);
    }
    }
}
