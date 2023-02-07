import java.util.Scanner;
public class Z_Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = scan.nextLine();
        System.out.print(name);
        for (int i = 7; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            System.out.println(name.charAt(i));
        }
        System.out.print(name);
        scan.close();
    }
}