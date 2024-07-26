import java.util.Scanner;

public class printingthetable {

    public static void printingtable(int  n){
for(int i = 0; i < 12; i++){
System.out.println(n*i);

}
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
}
