import java.util.Scanner;
// GOAL: print out a diamond shape depending on if the user input is even or odd
public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number < 1){
            System.out.println("Please enter a positive integer: "); //ensures a positive integer if one is not provided
        }
        else{
            if(number % 2 == 0){ //even
              for(int i = 1; i <= number; i +=2){
                int spaces = (number - i) / 2;
                Spaces(spaces);
                Stars(i);
              }
              for(int i = number; i > 0; i -= 2){
                int spaces = (number - i) / 2;
                Spaces(spaces);
                Stars(i);
              }
            }
            else{ //odd
                for(int i = 1; i <= number; i += 2){
                    int spaces = (number - i) / 2;
                    Spaces(spaces);
                    Stars(i);  // Upper diamond
                }
                for(int i = number - 2; i > 0; i -=2){
                    int spaces = (number - i) / 2;
                    Spaces(spaces);
                    Stars(i); // Lower Diamond
                }
            }
        }

        scanner.close();
    }
    public static void Spaces(int count){
        for(int j = 0; j < count; j ++){
            System.out.print(" ");
        }
    }
    public static void Stars(int count){
        for(int j = 0; j < count; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
