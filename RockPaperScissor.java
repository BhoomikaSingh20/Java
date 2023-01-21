package practiceprograms;

import java.util.*;

public class RockPaperScissor {

    public static void main(String args[]) {
        System.out.println("Note:\n\t-> 0 = ROCK\n\t-> 1 = PAPER\n\t-> 2 = SCISSORS");
        Scanner sc = new Scanner(System.in);

        int compWin = 0;
        int userWin = 0;
        int tie = 0;
        int round = 0;

        while (round < 5) {
            System.out.println();
            System.out.print("User's choice: ");
            int user = sc.nextInt();
            Random random = new Random();
            int computer = random.nextInt(0, 2);
            System.out.println("Computer's choice: " +computer);

            if (user == computer) {
                System.out.println("There's a TIE!!" + tie);
            } else if (user == 0) {
                if (computer == 1) {
                    compWin += 1;
                    System.out.println("Computer wins: " + compWin);
                } else {
                    userWin += 1;
                    System.out.println("User wins: " + userWin);
                }
            } else if (user == 1) {
                if (computer == 2) {
                    compWin += 1;
                    System.out.println("Computer wins: " + compWin);
                } else {
                    userWin += 1;
                    System.out.println("User wins: " + userWin);
                }
            } else if (user == 2) {
                if (computer == 0) {
                    compWin += 1;
                    System.out.println("Computer wins: " + compWin);
                } else {
                    userWin += 1;
                    System.out.println("User wins: " + userWin);
                }
            }
            else{
                System.out.println();
                System.out.println("INVALID CHOICE!!!\nStart again...\nRead Note carefully for valid choices");
                break;
            }
            round += 1;
        }
        System.out.println();
        System.out.println("User Total Wins    : " +userWin);
        System.out.println("Computer Total Wins: " +compWin);
        System.out.println("Total Ties         : " +tie);
        System.out.println();
        
        if (userWin>compWin){
            System.out.println("USER WINS!");
        }
        else if (compWin>userWin) {
            System.out.println("COMPUTER WINS!");
        }
        else{
            System.out.println("SOMETHING WENT WRONG!!!");
        }
    }
}
