
package com.mycompany.loophole1;
import java.util.Scanner;


public class Loophole1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //for(int i=0;i<5;i++){
        //    System.out.println("*****");
        //}
        
        /*int i;    
        int x = 0;
        for(i=1;i<=500;i++){
             x = x+i;
             System.out.println(x); 
             
    }
        System.out.println(x);*/
        
       //System.out.println("NUmber of Line: ");
       //int x = sc.nextInt();
       //for(int i=x; i>0;i--){
        //   if(i%2!=0){
        //       
        //        System.out.println("******");
               
         //  }
          // else{
          //      {
          //          
           //         System.out.println("++++++");
                    
          //      }
          // }
      // }
      
        /*boolean c = true;
        String trya;
        do{
            System.out.println("First: ");
            int x = sc.nextInt();
            System.out.println("Second: ");
            int y = sc.nextInt();
            int sum = x+y;
            System.out.println(sum);
            
            trya = "";
            
            while(!trya.equals("n") || !trya.equals("y")){
                System.out.println("Try again? y/n");
                trya = sc.next();
                
                if(trya.equals("n")){
                    c = false;
                    break;    
                }
                else if(trya.equals("y")){ 
                    break;
                }
                else {
                    System.out.println("Try again"); 
                }
            }
        }while(c);*/
        
        /*String c;
        do{
            c = "n";
            System.out.println("First: ");
            int x = sc.nextInt();
            System.out.println("Second: ");
            int y = sc.nextInt();
            int sum = x+y;
            System.out.println(sum);
            do{
                System.out.println("Try again? y/n");
                c= sc.next();
                if(c.equals("y") || c.equals("n")){
                    break;
                }
                else{
                    System.out.println("Nooo");
                }
                
            }while(!c.equals("y") || !c.equals("n"));
        }while(c.equals("y"));
        
        System.out.println("End");*/
        
        
       int x;
       int d ;
       int k = 1;
       int f;
       do{
           d = 1;
           f = 100;
           System.out.println("The numbser is between " + d +"-" + f +" your answer is?");
           x = sc.nextInt();
           do{
               if(x == 63){
                   System.out.println("Correct! The answer is " + x + " ! your record is " + k +" times!");
                   break;
               }
               else if(x!=63){
                   if (x>d){
                       d = x;
                       k+=1;
                       break;
                   }
                   else if(x<d){
                       f = x;
                       k+=1;
                       break;
                   }
                   
               }
           }while(k!=0);
       }while(x!=63);
    }
}
