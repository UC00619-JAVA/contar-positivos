import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numbers = { 10, -1, -2, 3, 10 };

        int positiveNumbers = 0;


        /*
        for (int i=1; i < numbers.length; i++) {
            if(numbers[i] > 0) {
                positiveNumbers++;
            }
        }

         */

        for (int number : numbers) {
            if(number > 0) {
                positiveNumbers++;
            }
        }

        System.out.println("Positive numbers: " + positiveNumbers);
    }
}