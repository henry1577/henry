package com.mycompany.arrays;
import java.util.Arrays;
import java.util.Scanner;


public class Arrays {
    
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n[] = {4,5,6,3,4,55,6,4,34,6,34,54};
        //n[2] = 50;
        //for(int i=0;i<n.length;i++){
        //    System.out.println(n[i]);
        //}
        /*
        System.out.println("Key in how many number u want key in: ");
        int keyin = sc.nextInt();
        int n[] = new int[keyin];
        
        int c = 0;
        while(c<n.length){
        System.out.println("Key in number: ");
        n[c] = sc.nextInt();
        c++;
        }
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
        */
        int n[] = {27,12,3,18,11,7};
        int c = 0;
        //Arrays.sort(n);
      
        //System.out.println(Arrays.toString(n));
        System.out.println("Key in the search word");
        int keyin = sc.nextInt();
        for(int i = 0; i<n.length;i++){
            if(n[i]==(keyin)){
                c++;
            }
        }
        if(c>0){
            System.out.println("Found it");
        }
        else{
            System.out.println("Cannot found");
        }
    }
}
