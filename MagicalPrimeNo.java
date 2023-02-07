import java.util.Scanner;
public class MagicalPrimeNo {
    public static void main(String[] args) {
        boolean flag1 = false, flag2 = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scan.nextInt();
        int reversed_no = Integer.reverse(number);
        for (int i = 2;i<=number / 2;++i)
        {
            if (number%i==0){
                flag1 = true;
                break;
            }
        }
        for (int i = 2;i<=reversed_no / 2;++i)
        {
            if (reversed_no%i==0){
                flag2 = true;
                break;
            }
        }
        boolean flag_1 = !flag1 , flag_2 = !flag2;
        if(flag_1 == flag_2)
        {
            System.out.println(number + " is a Magical Prime Number");
        }
        else
        {
            System.out.println(number+ " is not a Magical Prime Number");
        }
        scan.close();
    }
}