import java.util.*;
public class RemoveSpecifiedCharacterInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String MyString = scan.nextLine();
        String Char = scan.nextLine();
        String Str_New = MyString.replace(Char,"");
        System.out.println(Str_New);
        scan.close();
    }
}