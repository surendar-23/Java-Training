import java.util.Scanner;
public class Longest_Increasing_Subsequence {
	static int lis(int arr[], int n)
	{
		int lis[] = new int[n];
		int i, j, max = 0;
		for (i = 0; i < n; i++)
			lis[i] = 1;
		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;
		for (i = 0; i < n; i++)
			if (max < lis[i])
				max = lis[i];
		return max;
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int z=0;z<n;z++){
            arr[z] = scan.nextInt();
        }
		System.out.println("Length of longest increasing subsequence is: " + lis(arr, n)+ "\n");
		scan.close();
	}
}