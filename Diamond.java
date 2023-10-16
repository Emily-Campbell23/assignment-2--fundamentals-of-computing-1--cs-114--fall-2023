import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a positive integer greater than one or type 'exit' to quit: ");
            String input = scanner.next();

            if (input.equals("exit")) {
                break;
            }

            if (isPositiveInteger(input)) {
                int shapeSize = Integer.parseInt(input);

                if (shapeSize > 1) {
                    drawDiamond(shapeSize);
                } else {
                    System.out.println("Please enter a positive integer greater than one.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer or 'exit'.");
            }
        }

        scanner.close();
    }

    public static boolean isPositiveInteger(String str) {
        try {
            int value = Integer.parseInt(str);
            return value > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void drawDiamond(int shapeSize) {
        int rows, diamond;

        if (shapeSize % 2 == 1) {
            for (rows = 1; rows <= shapeSize; rows += 2) {
                for (diamond = 0; diamond < (shapeSize - rows) / 2; diamond++) {
                    System.out.print(" ");
                }
                for (diamond = 0; diamond < rows; diamond++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (rows = shapeSize - 2; rows >= 1; rows -= 2) {
                for (diamond = 0; diamond < (shapeSize - rows) / 2; diamond++) {
                    System.out.print(" ");
                }
                for (diamond = 0; diamond < rows; diamond++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (shapeSize % 2 == 0) {
            for (int spaces = shapeSize - 1; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            System.out.println(" *");
            for (rows = 2; rows <= shapeSize / 2 + 1; rows++) {
                for (int spaces = -2 * rows + (shapeSize + 2); spaces > 0; spaces--) {
                    System.out.print(" ");
                }
                for (diamond = 2 * rows - 2; diamond > 0; diamond--) {
                    System.out.print(" *");
                }
                System.out.println();
            }
            for (rows = shapeSize / 2; rows >= 2; rows--) {
                for (int spaces = -2 * rows + (shapeSize + 2); spaces > 0; spaces--) {
                    System.out.print(" ");
                }
                for (diamond = 2 * rows - 2; diamond > 0; diamond--) {
                    System.out.print(" *");
                }
                System.out.println();
            }
            for (int spaces = shapeSize - 1; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            System.out.println(" *");
        }
    }
}
