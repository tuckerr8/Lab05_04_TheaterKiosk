import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int patronAge = 0;
        System.out.print("Enter your age: ");

        if (in.hasNext()){
            patronAge = in.nextInt();
            in.nextLine();
        }

        if (patronAge >= 21){
            System.out.println("You get a wrist band. Drink responsibly.");
        } else if (patronAge < 21){
            System.out.println("You do not get a wrist band.");
        }
    }
}
