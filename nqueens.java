import java.util.Scanner;
public class nqueens{
    static int n;
    public static void printMatrix(int n,char[][] board){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean isSafe(int n,char[][] board,int r,int c){
        for (int i = 0; i < n; i++)
		{
			if (board[i][c] == 'Q') {
				return false;
			}
		}
		for (int j=0;j<n;j++)
            if (board[r][j] == 'Q')
				return false;
		for (int i = r, j = c; i >= 0 && j>=0;i--,j--)
			if (board[i][j] == 'Q')
				return false; for(int i=r,j=c;i>=0 && j<n;i--,j++)
            if(board[i][j]=='Q')
                return false;
		    return true;
	    }
        public static void nqueensolution(int n,char[][] board,int r){
            if(r==n){
                printMatrix(n,board);
            }
            else{
                for(int c=0;c<n;c++){
                    if(isSafe(n,board,r,c)){
                        board[r][c] = 'Q';
                        nqueensolution(n,board,r+1);
                        board[r][c] = '_';
                    }
                }
            }
            }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println();
            char[][] board = new char[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    board[i][j] ='_';
                }
            }
            nqueensolution(n, board, 0);
            sc.close();
        }
        }