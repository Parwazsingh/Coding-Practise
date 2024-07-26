public class GetBitMask {
    public static void main(String[] args) {
int n = 5;
int pos = 1;
int bitMask = 1<<pos;

if((bitMask & n)==0){
    System.out.println("The output would be zero");
}else{
    System.out.println("The output is not zero");
}
    }
}
