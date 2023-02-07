import java.util.Scanner;

public class Subset_Count
{
    static int subset_count = 0; 
   
    static void subset_sum(int list[], int sum, int starting_index, int target_sum) 
    { 
        if( target_sum == sum ) 
        { 
            subset_count++;
            if(starting_index < list.length)
                subset_sum(list, sum - list[starting_index-1], starting_index, target_sum); 
        } 
        else
        { 
            for( int i = starting_index; i < list.length; i++ ) 
            { 
                subset_sum(list, sum + list[i], i + 1, target_sum); 
            } 
        } 
    } 
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Target Sum: ");
        int target_sum = scan.nextInt();
        System.out.println("Enter the length of the array: ");
        int len = scan.nextInt();
        int list[] = new int[len];
        System.out.println("Enter the elements:");
        for(int i=0;i<len;i++){
            list[i] = scan.nextInt();
        }
        subset_sum(list, 0, 0, target_sum);
        System.out.println("Total Subset Count: "+subset_count);
        scan.close();
    }
}
