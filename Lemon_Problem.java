import java.util.Scanner;
public class Lemon_Problem{
    public static void main(String[] args) {
        int req_lemon = 21;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of Lemon you have: ");
        int in_hand = in.nextInt();
        if (in_hand>0)
        {
            if (in_hand > req_lemon)
            {
                System.out.println("You have: " + (in_hand - req_lemon) + " Lemons extra in hand");
            }
            else if (in_hand < req_lemon)
            {
                System.out.println("You need: " + (req_lemon - in_hand) + " Lemons more to visit the Temple");
            }
            else if (in_hand == req_lemon)
            {
                System.out.println("You have: " + (req_lemon) + " Lemons which is sufficient");
            }
        }
        else
        {
            System.out.println("Enter the vaild count for Lemons ");
        }
        in.close();
    }
}