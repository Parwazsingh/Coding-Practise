import java.util.Scanner;

public class Recursionquestion1 {

    public static void printRecursion(int n){

        if(n==5){
            return;
        }

        System.out.println(n);
        printRecursion(n +1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printRecursion(n);

    }
}
