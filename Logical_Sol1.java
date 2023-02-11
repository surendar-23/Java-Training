/* Arya Stark of Winterfell is very much interested in gardening and she decides to plant more trees in 
her garden. She plants trees in the order of rows and columns. She numbered the trees in row-wise 
order. She planted the orange trees only in the second row from both first and last. But later when the 
trees grew up, she forgot where she planted orange trees. So help her find out whether the given tree 
number is a number of orange trees or not. Display whether It is an orange tree or It is not an orange 
tree. */

import java.util.*; 
class Logical_Sol1
{ 
 public static void main(String args[]) 
 { 
 Scanner sc = new Scanner(System.in); 
 
 int r = sc.nextInt(), c = sc.nextInt(); 
 int num = sc.nextInt(); 
 int total = r * c; 
 
 int f = c + 1;
 int e = 2 * c; 
 
 int se = total - c; 
 int sf = (total - 2 * c) + 1; 
 
 if((num >= f && num <= e) || (num >= sf && num <= se))
    System.out.println("It is an orange tree"); 

 else 
 System.out.println("It is not an orange tree"); 
 sc.close();
} 
} 