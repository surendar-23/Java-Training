/* Given an array representing heights of buildings. 
You have to count the buildings which will see the sunrise 
(Assume : Sun rise on the side of array starting point). */

import java.util.*; 
public class Logical_Sol2
{ 
 public static void main(String[] args) throws Exception 
 { 
 // Your code here! 
 Scanner sc=new Scanner(System.in); 
 int n; 
 n=sc.nextInt(); 
 int a[]=new int[n]; 
 
 for (int i = 0; i < n; i++) 
 { 
 a[i]=sc.nextInt(); 
 } 
 
 int cnt = 1; 
 int x = a[0]; 
 for (int i = 1; i < n; i++) 
 { 
 if (a[i] >= x) 
 { 
 cnt++; 
 x = a[i]; 
 } 
 } 
 System.out.print(cnt); 
 sc.close();
 } 
} 
