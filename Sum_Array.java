import java.util.Scanner; 
public class Sum_Array
{ 
 public static void main(String args[]) 
 { 
 int arr[] = new int[50]; 
 int n, i,sum=0; 
 Scanner scan = new Scanner(System.in); 
 n = scan.nextInt(); 
 for(i=0; i<n; i++) 
 { 
 arr[i] = scan.nextInt(); 
 } 
 for(i=0; i<n; i++) 
 { 
 sum=sum+arr[i]; 
 } 
 System.out.println(sum); 
 if(sum>=0) 
 { 
 System.out.println("Positive number"); 
 } 
 else 
 { 
 System.out.println("Negative number"); 
 }
 scan.close();
 }
}