package week3.Friday;

import java.util.*;

class RockPaperScissor {
    static int randomNumber() {
        int a = (int) (Math.random() * 3 + 1);
        return a;
    }

    static void printChoice(int ch) {
        switch (ch) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Scissor");
                break;
            default:
                System.out.println("Incorrect choice");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************Welcome to Rock Paper Scissor Game!****************");
        char continues;
        int choice;
        int random;
        int x = 1;
        while (x == 1) {
            System.out.println("Choose your option :\n1) Rock\t2)Paper\t3)Scissor");
            choice = scanner.nextInt();
            random = randomNumber();
            System.out.print("The computer choose ");
            printChoice(random);
            if (choice == random) {
                System.out.println("It is a draw.\nStarting Rematch\n\n");
                continue;
            }
            if ((choice == 1 && random == 3) || (choice == 2 && random == 1) || (choice == 3 && random == 2)) {
                System.out.println("Congratulations have Won");
            } else {
                System.out.println("Tough Luck! You have lost.");
            }
            System.out.println("Do you want to continue?(y/n)");
            continues = scanner.next().charAt(0);
            if (continues == 'y') {
                System.out.println("\n\n");
            } else {
                System.out.println("Thank you for playing!\n\n");
                x = 2;
            }
        }
        scanner.close();

    }
}