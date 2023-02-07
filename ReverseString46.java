import java.util.*;

class ReverseString{

    public static void reverse(char str[])
    {
        int r = str.length-1, l=0;
        while(l<r){
            if(!Character.isAlphabetic(str[l]))
                l++;
            else if(!Character.isAlphabetic(str[r]))
                r--;
            else{
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] charArray = str.toCharArray();
        reverse(charArray);
        String revStr = new String(charArray);
        System.out.println(revStr);
        scan.close();
    }
}