import java.util.Scanner;
public class Login_Method{
    public static void main(String[] args){
        String username="-",password="-"; // Replace '-' with example uname and pass
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the username: ");
        String username_1 = in.nextLine();
        System.out.print(("Enter the password: "));
        String password_1 = in.nextLine();
        if(username.equals(username_1) && password.equals(password_1))
        {
            System.out.println("Login Successful");
        }
        else
        {
            System.out.println("Login Failed");
        }
        in.close();
    }
}