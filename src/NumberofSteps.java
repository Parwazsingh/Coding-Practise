import java.util.Scanner;

public class NumberofSteps {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
int num = scan.nextInt();

        int i = 0;
        int j = 0;
        while(num!=0){
            if(num%2 ==0){
                num = num/2;
                i++;

            }
            else{
                num--;
               j++;
            }

        }
        int sum = i + j;
        System.out.println(sum);

    }
}
