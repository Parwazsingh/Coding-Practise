import java.util.Scanner;

public class Recursionquestion2 {


    public static void sumofNnaturalNumbers(int n){


        if(n == 20){
            return;
        }
        int sum = 0;
        sum = sum + n;
        System.out.println(sum);
        sumofNnaturalNumbers(n + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        sumofNnaturalNumbers(n);
    }
}
