import java.util.Scanner;
public class Inversion_Count
{
    static int Inv(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int k=i+1;k<n;k++){
                if(arr[i] > arr[k]){
                    count++;
                }
            }
        }
        return count;
	}
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    int count = Inv(arr,n);
	    System.out.println(count);
		sc.close();
	}
}