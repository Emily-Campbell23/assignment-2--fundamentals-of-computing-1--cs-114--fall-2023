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
            int size = Integer.parseInt(input);
            drawDiamond(size);
        }
        scanner.close();
    }

    public static void drawDiamond(int shapeSize) {
        if (shapeSize % 2 == 0) {
            drawEvenDiamond(shapeSize);
        } else {
            drawOddDiamond(shapeSize);
        }
    }

    public static void drawOddDiamond(int shapeSize) {
        int row, diamond;
        for (row = 1; row <= shapeSize; row += 2) {
            for (diamond = 0; diamond < (shapeSize - row) / 2; diamond++) {
                System.out.print(" ");
            }
            for (diamond = 0; diamond < row; diamond++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (row = shapeSize - 2; row >= 1; row -= 2) {
            for (diamond = 0; diamond < (shapeSize - row) / 2; diamond++) {
                System.out.print(" ");
            }
            for (diamond = 0; diamond < row; diamond++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawEvenDiamond(int shapeSize) {
        int row, diamond;
        for (int space = shapeSize - 1; space > 0; space--) {
            System.out.print(" ");
        }
        System.out.println(" *");
        for (row = 2; row <= shapeSize / 2 + 1; row++) {
            for (int space = -2 * row + (shapeSize + 2); space > 0; space--) {
                System.out.print(" ");
            }
            for (diamond = 2 * row - 2; diamond > 0; diamond--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (row = shapeSize / 2; row >= 2; row--) {
            for (int space = -2 * row + (shapeSize + 2); space > 0; space--) {
                System.out.print(" ");
            }
            for (diamond = 2 * row - 2; diamond > 0; diamond--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int space = shapeSize - 1; space > 0; space--) {
            System.out.print(" ");
        }
        System.out.println(" *");
    }
}
