import java.util.Scanner;
// GOAL: print out a diamond shape depending on if the user input is even or odd
public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer greater than one: ");
        int number = scanner.nextInt();

            if(number % 2 == 0){ //even upper diamond
              for(int i = 1; i <= number; i +=2){
                int spaces = (number - i) / 2;
                Spaces(spaces);
                Stars(i);
              }
              for(int i = number; i > 0; i -= 2){
                int spaces = (number - i) / 2;
                Spaces(spaces);
                Stars(i); // lower diamond
              }
              Stars(1);
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
