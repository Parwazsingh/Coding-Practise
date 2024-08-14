import java.util.Scanner;

public class programtofindanumberispower2ornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int pos =
                sc.nextInt();
        int bitMask = 1<<pos;
        int not_new_number = ~(bitMask & n);
      if(not_new_number == 0){
          System.out.println("It is  a power of 2");
        }
      else{
          System.out.println("It is not a power of 2");
      }
    }
}
