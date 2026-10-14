import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Scanner sc = new Scanner(System.in);

        //System.out.print("First value: ");
        //double firstValue = sc.nextDouble();

        int[] numbers = { 10, -1, -2, 3, 10 };


        int positiveNumbers = 0;

        for (double number : numbers) {
            if(number > 0) {
                positiveNumbers++;
            }
        }

        System.out.println("Positive numbers: " + positiveNumbers);
    }
}