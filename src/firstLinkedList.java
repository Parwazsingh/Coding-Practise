import java.util.LinkedList;

public class firstLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> Firstlist = new LinkedList<Integer>();

int value = 0;

        Firstlist.add(1);
        Firstlist.add(5);
        Firstlist.add(7);
        Firstlist.add(3);
        Firstlist.add(8);
        Firstlist.add(2);
        Firstlist.add(3);

        System.out.println(Firstlist);

        for(int i = 0; i<Firstlist.size(); i++) {
            if (Firstlist.get(i) == 7) {
                System.out.println(i);
                return;
            }

        }

    }
}
