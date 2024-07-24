import java.util.*;
public class stack {

    public static void pushatBottom(Stack<Integer> s,    int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int temp = s.pop();
        pushatBottom( s, data);
        s.push(temp);
    }





    public static void main(String[] args) {
        int data;
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);


        pushatBottom(s,  4);

        while(!s.isEmpty()){
            System.out.println(s.pop());


        }

    }
}
