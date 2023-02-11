import java.util.*; 
public class Missing_Alphabets
{ 
 public static void main(String args[]) 
 { 
 Scanner sc=new Scanner(System.in); 
 String str=sc.nextLine(); 
 int num=str.length(); 
 int arr[]=new int[26]; 
 for(int i=0;i<26;i++) 
 { 
 arr[i]=0; 
 } 
 for(int i=0;i<num;i++) 
 { 
 char ch=str.charAt(i); 
 if(ch>='a'&&ch<='z') 
 { 
 int offset=ch-'a'; 
 arr[offset]++; 
 } 
 else if(ch>='A'&&ch<='Z') 
 { 
 int offset=ch-'A'; 
 arr[offset]++; 
 } 
 } 
 for(int j=0;j<26;j++) 
 { 
 if(arr[j]==0) 
 { 
 System.out.print((char)('a'+j)+ " "); 
 } 
 }
 sc.close();         
 }
}