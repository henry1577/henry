
package com.mycompany.loophole;
import java.util.Scanner;


public class Loophole {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int i = 10;
        while(i==10){
            System.out.println(i + " in a bed and the little on said, ");
            System.out.println("Roll over, roll over");
            i--;
        }
        while(i==9){
            System.out.println("They all rolled over and one fell out");
            System.out.println(i + " in a bed and the little on said, ");
            System.out.println("Roll over, roll over");
            i--;
        }
         while(i==8){
            System.out.println("They all rolled over and one fell out");
            System.out.println(i + " in a bed and the little on said, ");
            System.out.println("Roll over, roll over");
            i--;
        }
         while(i==7){
            System.out.println("They all rolled over and one fell out");
            System.out.println(i + " in a bed and the little on said, ");
            System.out.println("Roll over, roll over");
            i--;
        }
        while(i==6){
            System.out.println("They all rolled over and one fell out");
            System.out.println(i + " in a bed and the little on said, ");
            System.out.println("Roll over, roll over");
            i--;
        }
        while(i==5){
            System.out.println("They all rolled over and one fell out");
            System.out.println(i + " in a bed and the little on said, ");
            System.out.println("Roll over, roll over");
            i--;
        }
        while(i==4){
            System.out.println("They all rolled over and one fell out");
            System.out.println(i + " in a bed and the little on said, ");
            System.out.println("Roll over, roll over");
            i--;
        }
        while(i==3){
            System.out.println("They all rolled over and one fell out");
            System.out.println(i + " in a bed and the little on said, ");
            System.out.println("Roll over, roll over");
            i--;
        }
        while(i==2){
            System.out.println("They all rolled over and one fell out");
            System.out.println(i + " in a bed and the little on said, ");
            System.out.println("Roll over, roll over");
            i--;
        }
        while(i<=1){
            System.out.println("They all rolled over and one fell out");
            System.out.println(i + " in a bed and the little on said, ");
            System.out.println("Alone at last");
            i--;
            break;
        }*/
            
        /*for(int i=10;i==10;i--);{
        if(i<=10){
            System.out.println("They all rolled over and one fell out");
            System.out.println(i + " in a bed and the little on said, ");
            System.out.println("Roll over, roll over");  
        }
    }*/
        
        /*double num = 0, sum = 0;
        for(int i=0;i<5;i++){
            num = Math.random();
            sum = sum+num;
        }
        double a = sum/5;
        System.out.println("Average = " + a);*/
        
        int sum=0,c=0;
        int max, min;
        double a;
        System.out.println("Enter score, -1 to ends: ");
        int s = sc.nextInt();
        max = s;
        min = s;
        
        while(s!=-1){
            c++;
            sum = sum+s;
            
            if(s>max){
                max =s;
            }
            
            if(s<min){
                min = s;
            }
            System.out.println("Enter score, -1 to ends: ");
            s = sc.nextInt();
        }
        
        a = s/c;
        System.out.println("Average: " + a);
        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
        
        
        
        
        
        
        
        
    }
        
        
        
        
        
    }
        
    

