import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean gaming = true;
        Scanner s = new Scanner(System.in);
        while (gaming == true) {
            System.out.println("1- New Game, 2-Quit");
            String choose = s.nextLine();
            if (choose.equals("1")) {
                System.out.println("Welcome to the New Game");
            }
            else if (choose.equals("2")) {
                System.out.println("Successfully Quit");
                gaming = false;
            }
            else {
                System.out.println("Please enter a correct value");
            }
        }
    }
}
