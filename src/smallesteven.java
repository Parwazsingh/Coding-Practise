import java.util.Scanner;

public class smallesteven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 100 ;
        int sum = 0;
        while(true){
            if(i%n == 0 & i%2 == 0){
                sum = i;
                return;
            }
        }

    }

}

