package com.mycompany.wee3lab;

import java.util.Scanner;


public class Wee3lab {
    
public static double smallest(double n1, double n2, double n3)
        {
            return Math.min(Math.min(n1,n2),n3);
        }
   
   public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Pleaae enter an integer number: ");
        int ger = sc.nextInt();
        
        if (ger<=-1){
            System.out.println("The number " + ger + " " + "is a negative number");
        }else
            System.out.println("The number " + ger + " " + "is a positive number");
        }*/
        
        /*System.out.println("Key in 1 to 7 only");
        int v = sc.nextInt();
        
        switch(v){
           case 1 :System.out.println(v + " " + "is Monday");
           break;
           case 2 :System.out.println(v + " " + "is Tuesday");
           break;
           case 3 :System.out.println(v + " " + "is Wednesday");
           break;
           case 4 :System.out.println(v + " " + "is Thursday");
           break;
           case 5 :System.out.println(v + " " + "is Friday");
           break;
           case 6 :System.out.println(v + " " + "is Saturday");
           break;
           case 7 :System.out.println(v + " " + "is Sunday");
           break;
           default:
               System.out.println("Only 1 to 7! rechhose again");
              
            }*/
        
        
        /*System.out.println("Key in the score");
        int score = sc.nextInt();
        if(score>80 && score<=100){
            System.out.println(score + " " + "is A+");
        }
        else if(score<=79 && score>=75){
            System.out.println(score + " " + "is A");
        }
        else if(score<=74 && score>=70){
            System.out.println(score + " " + "is B+");
        }
        else if(score<=69 && score>=65){
            System.out.println(score + " " + "is B");
        }
        else if(score<=64 && score>=55){
            System.out.println(score + " " + "is C");
        }
        else if(score<=54 && score>=50){
            System.out.println(score + " " + "is D");   
        }
        else if(score<=49 && score>=40){
            System.out.println(score + " " + "is F+");
        }
        else if(score<=39 && score>=0){
            System.out.println(score + " " + "is F");
        }*/
        
        /*System.out.println("Please enter your first number: ");
        double n1 = sc.nextDouble();
        System.out.println("Please enter your second number: ");
        double n2 = sc.nextDouble();
        System.out.println("Please enter your third number: ");
        double n3 = sc.nextDouble();
        if(n1>n2 && n1>n3){
            System.out.println("The largeset number is "+ " " + n1 + " "+ "and the smallest number is "+ " "+ smallest(n1,n2,n3));
        }
        else if(n2>n1 && n2>n3){
            System.out.println("The largeset number is "+ " " + n2 + " "+ "and the smallest number is "+ " "+ smallest(n1,n2,n3));
        }
        else if(n3>n1 && n3>n2){
            System.out.println("The largeset number is "+ " " + n3 + " "+ "and the smallest number is "+ " "+ smallest(n1,n2,n3));
        }
        else if(n1==n2 || n1==n3){
            System.out.println("Same");
        }
        else if(n2==n1 || n2==n3){
            System.out.println("Same");
        }
        else if(n3==n2 || n3==n1){
            System.out.println("Same");
        }*/
        
        
        /*System.out.println("Key in nunmber - 1 to 9999 only!");
        int num = sc.nextInt();
        if (1<=num && num<10){
            System.out.println(num + " is single digit");      
        }
        else if(10<num && num<100){
            System.out.println(num + " is two digit");
        }
        else if(100<num && num<1000){
            System.out.println(num + " is three digit");
        }
        else if(1000<num && num<10000){
            System.out.println(num + " is four digit");
        }
        else{
            System.out.println("Only 1 to 9999 walau!");
        }*/
        
        System.out.println("Are you self emplyed? 1 for yes, 0 for no");
        int choice = sc.nextInt();
        do{
            if (choice == 1){
                System.out.println("Key in salary: ");
                double salary = sc.nextDouble();
                if(salary>=67500){
                    double cal = 67500*(15.3/100);
                    double withoutm = salary - cal;
                    double totalm = withoutm * (2.9/100);
                    double totals = totalm + cal;
                    System.out.println("Your FICA tax is: " + cal);
                    System.out.println("Your MEdicare tax is: " + totalm);
                    System.out.println("Your total security tax is: " + totals);
                    break;
                }
                else{
                    double cal2 = salary*(15.3/100);
                    double totalm2 = 0;
                    System.out.println("Your FICA tax is: " + cal2);
                    System.out.println("Your MEdicare tax is: " + totalm2);
                    System.out.println("Your total security tax is: " + cal2);
                    break;
                }
            }else if(choice == 0){    
                System.out.println("Key in salary: ");
                double salarys = sc.nextDouble();
                if(salarys>=67500){
                    double cal3 = 67500*(7.65/100);
                    double withoutm2 = salarys - cal3;
                    double totalm3 = withoutm2 *(1.45/100);
                    double totals3 = totalm3 + cal3;
                    System.out.println("Your FICA tax is: " + cal3);
                    System.out.println("Your MEdicare tax is: " + totalm3);
                    System.out.println("Your total security tax is: " + totals3);
                }
                else{
                    double cal4 = salarys*(15.3/100);
                    double totalm4 = 0;
                    System.out.println("Your FICA tax is: " + cal4);
                    System.out.println("Your MEdicare tax is: " + totalm4);
                    System.out.println("Your total security tax is: " + cal4);
                    break;
                }
            }
        while(choice>=2){
                
            System.out.println("Key in again! ");}
        
        
        
        

        
        
                
        
        
        


        
        
        
        
        
   
        
        
   

