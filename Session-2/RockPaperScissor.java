import java.util.Scanner;

abstract class RockPaperScissor {
    String user = "";

    abstract String computerChoice();

    public String userChoice(int n) {
        switch (n) {
            case 1:
                user = "Rock";
                break;
            case 2:
                user = "Paper";
                break;
            case 3:
                user = "Scissor";
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        return user;
    }
}

class WinnerCheck extends RockPaperScissor {
    String userChoice = super.user;
    String ComputerChoice = "";

    public String computerChoice() {
        int system = (int) (Math.random() * (3) + 1);
        switch (system) {
            case 1:
                ComputerChoice = "Rock";
                break;
            case 2:
                ComputerChoice = "Paper";
                break;
            default:
                ComputerChoice = "Scissor";
        }
        return ComputerChoice;
    }
}

class Main1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String interest = "Y";
        do {
            System.out.println("Select your choice : 1.Rock 2.Paper 3.Scissor");
            int choice = sc.nextInt();
            WinnerCheck x = new WinnerCheck();
            String ch = x.userChoice(choice);
            String comChoice = x.computerChoice();
            System.out.println("Computer chose : " + comChoice);
            System.out.println("User chose : " + ch);
            if (comChoice.equals(x.userChoice))
                System.out.println("Draw Match");
            else if ((comChoice.equals("Rock") && ch.equals("Scissor"))
                    || (comChoice.equals("Rock") && ch.equals("Paper"))
                    || (comChoice.equals("Scissor") && ch.equals("Paper"))) {
                System.out.println("Computer Won");
            } else
                System.out.println("You Won");
            System.out.println("Are you interested to play?(Y/N)");
            interest = sc.next();
        } while (interest.equals("Y"));

    }
}