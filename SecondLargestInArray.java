import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestInArray{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
    }
    sc.close();
    Arrays.sort(arr);
    System.out.println(arr[size-2]);

}
}