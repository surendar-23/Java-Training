import java.util.*;

public class Count1sBit{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        while(num>0)
        {
           if(num%2==1)
            {
                count++;
            }
        num=num/2;
        }
        System.out.println(count);
        scan.close();
    }
}