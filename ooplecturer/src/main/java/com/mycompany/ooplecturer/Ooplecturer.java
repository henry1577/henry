
package com.mycompany.ooplecturer;
import java.util.HashSet;
import java.util.Scanner;


public class Ooplecturer {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //Calculator obj1 = new Calculator();
        //System.out.println(obj1.getget(10, 5));
        //System.out.println(obj1.getSubtraction(10, 5));
        //String name1 = sc.nextLine();
        //obj1.printMessage(name1);
        Human shit = new Human();
        Human Dog = new Human();
        
        
        shit.name = "Shit";
        shit.age = 69;
        shit.height = 69;
        shit.weight = 50;
        shit.gender = "SHit";
        shit.sleep(5);
        
        Dog.name = "Dog";
        Dog.age = 23;
        Dog.height = 90;
        Dog.weight = 1000;
        Dog.gender = "Doggy";
        Dog.sleep(9);
        
        shit.setage(40);
        
        System.out.println(shit.name + " is" + shit.setage() + "years old");
    }
}
