import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Rock Paper Scissors");
        String[] playItems = {"Rock", "Paper", "Scissors"};

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter...\n");
        String userPlay = userInput.nextLine();

        String computerChoice = playItems[(int) Math.random() * 3];


        System.out.println("You choose "+userPlay+", computer chooses "+computerChoice);
        if (userPlay.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        }

        //Player chooses Rock
        if (userPlay.equalsIgnoreCase(playItems[0])&& computerChoice.equalsIgnoreCase(playItems[1])){
            System.out.println("Paper covers Rock, you loose!");
        } else if (userPlay.equalsIgnoreCase(playItems[0])&& computerChoice.equalsIgnoreCase(playItems[2])) {
            System.out.println("Rock smashes scissors, you win!");
        }
        //Player chooses Paper
        else if (userPlay.equalsIgnoreCase(playItems[1])&& computerChoice.equalsIgnoreCase(playItems[2])) {
            System.out.println("Scissors cuts paper, you loose!");
        }
        else if (userPlay.equalsIgnoreCase(playItems[1])&& computerChoice.equalsIgnoreCase(playItems[0])) {
            System.out.println("Paper covers Rock, you win!");
        }
        //Player chooses Scissors
        else if (userPlay.equalsIgnoreCase(playItems[2])&& computerChoice.equalsIgnoreCase(playItems[0])) {
            System.out.println("Rock mashes scissors, you loose!");
        }
        else if (userPlay.equalsIgnoreCase(playItems[2])&& computerChoice.equalsIgnoreCase(playItems[1])) {
            System.out.println("Scissors cuts paper, you win!");
        }
    }
}
