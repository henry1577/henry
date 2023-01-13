
package com.mycompany.if_condiiont;
import java.util.Scanner;
import java.text.DecimalFormat;

    public class If_condiiont {
        private static final DecimalFormat df = new DecimalFormat("0.00");

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            /*System.out.println("Key in valuer:");
            double f = sc.nextDouble();
            double c= 5*(f-32)/9;

            if(c>75)
                System.out.println("The tempeture of " + df.format(c) + "C is over 75 already!");
            else
                System.out.println(c + "C is nice!");*/
            
            /*System.out.println("Key in value x: ");
            int x = sc.nextInt();
            System.out.println("Key in value y: ");
            int y = sc.nextInt();
            
            if(x>y){
                System.out.println("x is bigger than y");
            }else if(x==y);{
                System.out.println("x same as y");
            }else{
                System.out.println("y is bigger than x");*/
                    
            
            /*System.out.println("Key in value x: ");
            int x = sc.nextInt();
            System.out.println("Key in value y: ");
            int y = sc.nextInt();
            System.out.println("Key in value z: ");
            int z = sc.nextInt();
            
            if(x>y && x>z)
                System.out.println("x is bigger than y and z");
            else if(y>x && y>z)
                System.out.println("y is bigger than x and z");
            else if(z>x && z>y)
                System.out.println("z is bigger than x and y");*/
            
            /*double n1 = 76, n2 = 80, n3 = 60;
            double largest;
            
            if(n1 > n2 && n1 > n3){
                largest = n2;*/
            /*String gender = "female";
            switch(gender){
                case "male": System.out.println("Gneder is male");
                case "female": System.out.println("Gender is female");
                default:
            }*/
            
            int index = 0;
            while(index<6){
                System.out.println("Key in age: ");
                int age = sc.nextInt();
                double price;
                if(age<=5){
                    System.out.println("Kiddy is free i know my park all not child friendly anywhere, go play rubbish can"); 
                }
                else if(age>5 && age<=64){
                    price = 2.50;
                    System.out.println("Please give RM" + df.format(price) + " " + " or else get the hell out of here");
                }
                else if(age>=65){
                    price = 1.50;
                    System.out.println("Welcome old people play i know will have sudden heart attack anytime but please pay RM"+ df.format(price) + " " +
                            "or still need to get out of here");    
                }
            index++;
            if(index == 6){
                System.out.println("This is it");
                break;
                }
            }
                   
                 
            
            
        }
        }
    
            
                
    
            
   
    
            

        
    

    
    

