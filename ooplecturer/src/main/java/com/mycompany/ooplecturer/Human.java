
package com.mycompany.ooplecturer;

public class Human {
   String name;
   String gender;
   int age;
   private int age2;
   private double height; //step1
   double weight;
   static int hand=2;
   
   
   public void setHeight(double height){
       this.height = height;   //step2
   }
   
   public void setage(int age2){
    this.age2 = age2;
   }
   
   public void sleep(int hour){
       System.out.println(name+ "sleeps" + hour);
    }
   
   public void eat(){
       
   }
   
   public void run(){
       
   }
   
   public void drink(){
       if height > 150{
           
       }
       
   }
}
