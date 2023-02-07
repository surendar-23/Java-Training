public class N_queen {
	static int queens(boolean[][] arr,int row)
	{
		if(row==arr.length)
		{
			disp(arr);
			return 1;
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(isSafe(arr,row,i)) {
				arr[row][i]=true;
				count += queens(arr,row+1);
				arr[row][i]=false;
			}
			
		}
		return count;	
	}
	private static boolean isSafe(boolean[][] arr, int row, int col) {	
		for(int i=0;i<row;i++)
		{
			if(arr[i][col]) return false;
		}
		for(int i=1;i<=Math.min(row,col);i++)
		{
			if(arr[row-i][col-i]) return false;
		}
		for(int i=1;i<=Math.min(row, arr.length-col-1);i++)
		{
			if(arr[row-i][col+i]) return false;
		}
		return true;
	}
	private static void disp(boolean[][] arr) {
		for(boolean[] row:arr)
		{
			for(boolean element:row)
			{
				if(element)	System.out.print("Q ");
				else System.out.print("X ");
			}
			System.out.println();
		}
		System.out.println();
	}	
	public static void main(String[] args) {
		int n =8;
		boolean[][] arr= new boolean[n][n];
		System.out.print(queens(arr,0));
	}
}