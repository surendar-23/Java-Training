import java.util.Scanner; 
public class Power_of_a_Given_Number 
{ 
 public static void main(String[] args) 
 { 
 Scanner s=new Scanner(System.in); 
 int pow, num; 
 long result; 
 num = s.nextInt(); 
 pow = s.nextInt(); 
 result = power(num, pow); 
 System.out.print(result); 
 s.close();
 } 
 public static long power(int num, int pow) 
 { 
 if(pow != 0) 
 { 
 return num * power(num, pow - 1); 
 } 
 return 1; 
 } 
}