import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Josephus_Prob{
    static void Jos(List<Integer> person , int k , int index){
        if(person.size() == 1){
            System.out.println("Freedom is given for: "+person.get(0));
            return;
        }
        index = ((index + k ) % person.size());
        person.remove(index);
        Jos(person,k,index);
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of ppl: ");
        int n = scan.nextInt();
        System.out.print("Enter the no of steps: ");
        int k = scan.nextInt();
        k--;
        int index = 0;
        List<Integer> person = new ArrayList<>();
        for(int i = 1;i <= n ; i++){
            person.add(i);
        }
        Jos(person,k,index);
        scan.close();
    }
}