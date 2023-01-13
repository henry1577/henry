
package com.mycompany.arraytuto;
import java.util.Scanner;
import java.util.Arrays;

public class Arraytuto {
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int ar[] = {25,28,46,71,80,58};
        int even=0,odd=0;
        int n;
        for(int i=0;i<ar.length;i++){
            if(ar[i]%2==0){
                odd++;
            }
            else{
                even++;
            }
        
        System.out.println("Array: " + Arrays.toString(ar));
        System.out.println("Odd got: " + odd);
        System.out.println("Even got: " + even);
        }*/
        
        /*int numbers[] = {75,49,30,83,203,102};
        int small = numbers[0];
        int large = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>large){
                large = numbers[i];
            }
            else if(numbers[i]<small){
                small = numbers[i];
            }
        }
        System.out.println("Largest" + large);
        System.out.println("Smallest" +small);*/
        
        int a1[] = {26,3,14,8,10};
        int a2[] = {11,28,24,30,12};
        
        int p = arsum(a1,a2);
        System.out.println(p);
            
       
    }
       private static int arsum(int a[], int b[]){
        int a3[]=new int[5];
        for(int i=0;i<a.length;i++){
            a3[i]=a[i]*b[i];
        }
        int sum = Arrays.stream(a3).sum();
        return sum;
        }
}
