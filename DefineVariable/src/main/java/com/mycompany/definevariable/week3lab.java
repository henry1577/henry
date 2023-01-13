package com.mycompany.definevariable;
import java.util.Scanner;

public class week3lab {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleaae enter an integer number: ");
        int ger = sc.nextInt();
        
        if (ger<=-1){
            System.out.println("The number " + ger + " " + "is a negative number");
        }else
            System.out.println("The number " + ger + " " + "is a positive number");
        
        
    }
    
}
