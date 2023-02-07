import java.util.Scanner;
public class Highway_Billboard{
    static int maxRevenue(int m, int[] x,int[] revenue,int n, int t){
        int[] maxRev = new int[m + 1];
        for(int i = 0; i < m + 1; i++)
            maxRev[i] = 0;int nxtbb = 0;
        for (int i = 1; i <= m; i++){
            if (nxtbb < n){
                if (x[nxtbb] != i)
                    maxRev[i] = maxRev[i - 1];
                else{
                if (i <= t)
                    maxRev[i] = Math.max(maxRev[i - 1],revenue[nxtbb]);
                else
                    maxRev[i] = Math.max(maxRev[i - t - 1] +revenue[nxtbb],maxRev[i - 1]);
                    nxtbb++;
                    }
                }
        else
            maxRev[i] = maxRev[i - 1];
        }
    return maxRev[m];
}
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value of M and N:");
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[] x = new int[n]; int[] revenue = new int[n];
        for(int z=0;z<n;z++){
            System.out.print("Enter the Billboards: ");
            x[z] = scan.nextInt();
        }
        for(int p=0;p<n;p++){
            System.out.print("Enter the Revenue: ");
            revenue[p] = scan.nextInt();
        }
        System.out.print("Enter the value of T: ");
        int t = scan.nextInt();
        System.out.println("The Max Revenue can be obtained: "+maxRevenue(m,x,revenue,n,t));
        scan.close();
    }
}