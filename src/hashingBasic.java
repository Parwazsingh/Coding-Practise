import java.util.HashSet;
import java.util.Iterator;

public class hashingBasic{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);


        if(set.contains(1)){
            System.out.println("set contains 1");
        }

        Iterator it = set.iterator();

        System.out.println(it.next());
        System.out.println(it.hasNext());
    }

}



