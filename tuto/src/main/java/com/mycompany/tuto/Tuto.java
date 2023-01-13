
package com.mycompany.tuto;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Tuto {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        /*System.out.println("Are you self emplyed? 1 for yes, 0 for no");
        int choice = sc.nextInt();
        while(choice<1){
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
                    break;
                }
                else{
                    double cal4 = salarys*(15.3/100);
                    double totalm4 = 0;
                    System.out.println("Your FICA tax is: " + cal4);
                    System.out.println("Your MEdicare tax is: " + totalm4);
                    System.out.println("Your total security tax is: " + cal4);
                    break;
                }
            }else{
                System.out.println("Try Again");
            }
        
                }*/
        
        System.out.println("Enter your gender, 0 for male, 1 for female");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Enter your heights in inches: ");
            double inches = sc.nextDouble();
            System.out.println("Enter your weight in pounds: ");
            double pounds = sc.nextDouble();
            double kg = pounds/2.2;
            double m = inches/39.37;
            double m2 = Math.pow(m, 2);
            double bmi = kg/m2;
            if (bmi>27.3){
                System.out.println("Your bmi is " + df.format(bmi) + " ; you fat.");
            }
            else{
                System.out.println("Your bmi is " + df.format(bmi) + " ; thin like stick.");
            }
        }
        else if(choice == 0){
            System.out.println("Enter your heights in inches: ");
            double inches = sc.nextDouble();
            System.out.println("Enter your weight in pounds: ");
            double pounds = sc.nextDouble();
            double kg = pounds/2.2;
            double m = inches/39.37;
            double m2 = Math.pow(m, 2);
            double bmi = kg/m2;
            if (bmi>27.8){
                System.out.println("Your bmi is " + df.format(bmi) + " ; you fat.");
            }
            else{
                System.out.println("Your bmi is " + df.format(bmi) + " ; thin like stick.");
            }
        }
        else{
            System.out.println("no no no");
            System.exit(0);
        }
        
        
        
        System.out.println("Enter Day: ");
        int day = sc.nextInt();
        System.out.println("Enter Month: ");
        int month = sc.nextInt();
        System.out.println("Enter Year: ");
        int year = sc.nextInt();
        
        
       switch(month){
           case 1: System.out.println("The date entered is a valid date.");
           break;
           case 3: System.out.println("The date entered is a valid date.");
           break;
           case 5: System.out.println("The date entered is a valid date.");
           break;
           case 7: System.out.println("The date entered is a valid date.");
           break;
           case 8: System.out.println("The date entered is a valid date.");
           break;
           case 10: System.out.println("The date entered is a valid date.");
           break;
           case 12: System.out.println("The date entered is a valid date.");
           day=31;
           break;
           case 4: System.out.println("The date entered is a valid date.");
           break;
           case 6: System.out.println("The date entered is a valid date.");
           break;
           case 9: System.out.println("The date entered is a valid date.");
           break;
           case 11: System.out.println("The date entered is a valid date.");
           day=30;
           default:
                System.out.println("The date entered is not a valid date. ");
           break;
           
           case 2: 
               if((year%4==0 && year % 100 !=0) || (year%400==0)){
                   day = 29;
                     System.out.println("The date entered is a valid date. ");
                }
               else if(day<=28){
                   System.out.println("The date entered is a valid date. ");
               }
                else if((year%4!=0 && year % 100 ==0) || (year%400!=0)){
                    day = 29;
                     System.out.println("The date entered is a valid date. ");
                }
        
               
               
               
     
  }

       /*int xx;
       xx++;
       ++xx;
       xx+=1;
       xx=xx+1;*/
       
       //int x5, y5, z5;
       //z5 = x5+y5;
       //x++;
       
       //int x
       //(2b): x*=2
       //(2c): x-x*2
       
       //?:
       // int count = 5;
       //(count>10 ? "count is greather than 10":"");
       
       //int x
       //x-- / --x
       //total = total = --x
       
       //int x = 20
       //total total +x--;
       
       //int x = 123.4567
       //System.out.println("df.format(x)")
       
       //Float x = 3.14159
       //System.out.println("df.format(x)")
       //System.out.println("%.3f", value)
       
       //int q = 5
       // total = q % total;
       //q % value
       // q % = value
       
       
       
       
               
}

    
}
       
       
            
            
       
            
            
            
        
            
            
        
        
       
        
    
        
        
    

            
        
