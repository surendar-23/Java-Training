import java.util.Arrays;
public class Median_Of_Two_Sorted_Arrays{
    public static void main(String args[]){
        int arr1[] = new int[]{25,35,45,55,65};
        int arr2[] = new int[]{5,10,15,20,25,65};
        int arr3[] = new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i] = arr1[i];
        }
        for(int j=arr1.length;j<arr3.length;j++){
            arr3[j]=arr2[j-arr1.length];
        }
        Arrays.sort(arr3);
        int k = arr3.length;
        if(arr3.length%2==0){
            System.out.println((arr3[k/2]+arr3[k/2-1]/2));
        }
        else{
            System.out.println(arr3[k/2]);
        }
    }
}