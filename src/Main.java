import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean getout = true;

        while (getout) {
            System.out.println("Enter a Word: ");
            String wordOne = sc.nextLine();
            System.out.println("Enter a second Word");
            String wordTwo = sc.nextLine();

            if (wordOne.endsWith(wordTwo.substring(0, 2))) {
                System.out.println("Equals.");
            } else {
                System.out.println("Not equals.");
            }
            System.out.println("Do you want to continue? (y/n)");
            String answer = sc.nextLine();
            if (answer.equals("n")) {
                getout = false;
                System.out.println("Goodbye!");
            }

        }
    }

}