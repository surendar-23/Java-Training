import java.util.*;
public class ChecksDateValidation{
    static boolean leap(int year){
        return((year%4==0) && year%100!=0 || year%400==0);
    }
    static boolean date(int a,int b,int c)
    {
        if(c<1900 || c>9999)
            return false;
        if(b<1 || b>12)
            return false;
        if(a<1 || a>31)
            return false;
        if(b==2)
        {
            if(leap(c))
                return (a<=29);
            else
                return(a<=28);
        }
        if(b==4 || b==6 || b==9 || b==11)
            return (a<=30);
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String [] st = str.split("/");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        int c = Integer.parseInt(st[2]);
        if(date(a,b,c))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
        scan.close();
    }
}