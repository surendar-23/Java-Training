// Write a Java Program to return the nearest 10 multiple of any given number.

import java.util.Scanner;
public class Nearest_10_Multiple{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num;
        num = s.nextInt();
        int rem = num % 10;
        if(num<=5){
            System.out.println("10");
        }
        else if(rem<5){ 
        rem=num-rem; 
        System.out.println(rem); 
        } 
    else{ 
        num=num-rem+10; 
        System.out.println(num); 
    } 
    s.close();
} 
}