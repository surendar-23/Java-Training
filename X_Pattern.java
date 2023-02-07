import java.util.Scanner;
public class X_Pattern {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = scan.nextLine();
        int len = (name.length());
        for(int i = 0;i<len;i++)
        {
            int j=len-1-i;
            for(int k=0;k<len;k++)
            {
                if(k==i || k==j)
                {
                    System.out.print(name.charAt(k));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        scan.close();
    }
}