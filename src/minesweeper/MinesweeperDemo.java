package minesweeper;

import java.util.Scanner;

public class MinesweeperDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of the game board");
        System.out.print("width > 4: ");
        int width = sc.nextInt();
        while (width < 4) {
            System.out.print("Input correct width > 4: ");
            width = sc.nextInt();
        }
        System.out.print("length > 4: ");
        int length = sc.nextInt();
        while (length < 4) {
            System.out.print("Input correct length > 4: ");
            length = sc.nextInt();
        }
        System.out.print("Input count of bombs: ");
        int bombs = sc.nextInt();
        while (bombs < 0 || bombs >= length * width) {
            System.out.print("Input correct count of bombs more than 0, less than " + width * length + ": ");
            bombs = sc.nextInt();
        }


        Minesweeper minesweeper = new Minesweeper(width, length, bombs);
        minesweeper.drawShowBoard();
        // shows real board
//        minesweeper.drawBoard();
        System.out.println("Check cell 'c x y' where 'x' and 'y' are coordinates");
        System.out.println("Set mine 'm x y' where 'x' and 'y' are coordinates");
        System.out.println("Unset mine 'm x y' where 'x' and 'y' are coordinates");
        while (!minesweeper.isGameover() && !minesweeper.isWin()) {
            String[] choice = sc.nextLine().split(" ");
            try {
                if (choice[0].equals("c")) minesweeper.cellChoice(Integer.parseInt(choice[1]), Integer.parseInt(choice[2]));
                else if (choice[0].equals("m")) minesweeper.mineChoice(Integer.parseInt(choice[1]), Integer.parseInt(choice[2]));
                minesweeper.drawShowBoard();

            } catch (Exception e) {
                System.out.println("Not correct input.");
            }
        }
        if (minesweeper.isGameover()) System.out.println("You loose");
        else if (minesweeper.isWin()) System.out.println("You win");

    }

}