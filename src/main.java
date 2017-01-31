import java.util.Scanner;

/**
 * Created by hyunchoi on 1/30/17.
 */
public class main {
    public static float calculateArea(float length, float width) {
        return length * width;
    }

    public static float calculatePerimeter(float length, float width) {
        return (2 * (length + width));
    }

    public static void printAnswers(float length, float width) {
        System.out.println("Area: " + calculateArea(length, width));
        System.out.println("Perimeter: " + calculatePerimeter(length, width));
    }

    public static void main (String[] args) {
        float length;
        float width;
        char continueAnswer;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Grand Circus' Room Detail Generator!");

        while (true) {
            System.out.print("Enter Length: ");
            length = sc.nextFloat();

            System.out.print("Enter Width: ");
            width = sc.nextFloat();

            calculateArea(length, width);
            calculatePerimeter(length, width);
            printAnswers(length, width);

            System.out.print("Continue? (y/n): ");
            continueAnswer = sc.next().charAt(0);

            if (continueAnswer == 'n' || continueAnswer == 'N') {
                break;
            }
        }
    }
}
