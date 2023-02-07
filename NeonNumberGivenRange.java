import java.util.Scanner;
public class NeonNumberGivenRange
{
    static boolean isNeon(int number) {
        int squares = number*number,SumOfDigits = 0;
        while (squares!=0) {
            SumOfDigits=SumOfDigits+squares%10;
            squares=squares/10;
        }
        return (SumOfDigits==number);
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int r_1,r_2;
        r_1=scan.nextInt();
        r_2=scan.nextInt();
        for (int i=r_1;i<=r_2;i++)
            if (isNeon(i))
                System.out.print(i+" ");
            scan.close();
    }
}