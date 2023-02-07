import java.util.Scanner;
class Negative_Count_In_Array{
    public static void main(String args[]){
        int n;
        int count=0,i=0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the length of the array: ");
            n = scan.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the Elements");
            for (i=0 ; i<n;i++)
            {
                arr[i]=scan.nextInt();
            }
            for (i=0;i<n;i++)
            {
                if(arr[i]<0)
                {
                    count++;
                }
            }
            scan.close();
        }
        System.out.print("Negative Count: " +count);
       
    }
}