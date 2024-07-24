import java.util.LinkedList;
import java.util.Scanner;

public class secondLinkedlisthomework {
    public static void main(String[] args) {
        LinkedList<Integer> sirjii = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 6; i++) {
            int number = sc.nextInt();
            // Ensure the number is within the desired range before adding
            if (number >= 1 && number <= 50) {
                sirjii.add(number);
            } else {
                System.out.println("Number is out of range. Please enter a number within 1-50.");
                i--; // Decrement to redo the input for this iteration
            }
        }

        for (int i = 0; i < 6; i++) {
            if (sirjii.get(i) > 25) {
                sirjii.remove(i);


            }

        }
        System.out.println(sirjii);
    }
}

