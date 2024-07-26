import java.util.Scanner;

public class factorialofnumberusingRecursion {

    public static int factiheh(int n){
if(n == 1 || n == 0){
return 1;
}

        int i  = factiheh(n - 1);
                int q = n * i;
return q;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factiheh(n));
    }
}
