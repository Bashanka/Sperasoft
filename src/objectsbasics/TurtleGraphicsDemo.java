package basicsobjects;

import java.util.Scanner;

public class TurtleGraphicsDemo {
    public static void main(String[] args) {
        int[][] a = new int[3][3];

        System.out.println("Input size of board");
        System.out.print("width: ");
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        System.out.print("height: ");
        int h = in.nextInt();
        System.out.println();
        TurtleGraphics t = new TurtleGraphics(w, h);

        System.out.println("Input pen position");
        System.out.print("x: ");
        int x = in.nextInt();
        System.out.print("y: ");
        int y = in.nextInt();
        System.out.println();
        t.setPenPosition(new Position(x, y));

        t.showBoard();

        System.out.println("For exit input \'x\'");
        System.out.println("For clear input \'c\'");
        System.out.println("For up input \'u x\' where x is length");
        System.out.println("For down input \'d x\' where x is length");
        System.out.println("For left input \'l x\' where x is length");
        System.out.println("For right input \'r x\' where x is length");
        in.nextLine();

        System.out.print("Print command: ");
        String command = in.nextLine();

        while (!command.equals("x")) {
            if (command.equals("c")) {
                t.clearBoard();
                System.out.println("Input pen position");
                System.out.print("x: ");
                x = in.nextInt();
                System.out.print("y: ");
                y = in.nextInt();
                System.out.println();
                t.setPenPosition(new Position(x, y));
            } else {
                String[] str = command.split(" ");
                switch (str[0]) {
                    case "u":
                        t.movePenUp(Integer.parseInt(str[1]));
                        break;
                    case "d":
                        t.movePenDown(Integer.parseInt(str[1]));
                        break;
                    case "l":
                        t.movePenLeft(Integer.parseInt(str[1]));
                        break;
                    case "r":
                        t.movePenRight(Integer.parseInt(str[1]));
                        break;
                }
                t.showBoard();
            }
            System.out.print("Print command: ");
            command = in.nextLine();

        }

        System.out.println("The end");
    }


}
