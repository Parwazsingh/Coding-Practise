public class countthedigits {
    public static void main(String[] args) {
      int arr[] = {1, 15, 23, 45, 9, 18};
       int i = 0;
       int sum = 0;


        for(i = 0; i< arr.length;i++){
            while(arr[i]>0){
                int answer = arr[i]%10;
                 sum = sum + answer;
                 arr[i] = arr[i]/10;
            }

        }
        System.out.println(sum);
    }
            }



