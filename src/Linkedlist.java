public class Linkedlist {

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next  = null;
            size++;
        }

    }
    Node head;
    private int size;
    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode ;
                    return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode ;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;

        }
        currNode.next = newNode;

    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data +"  -> ");
            currNode = currNode.next;

        }
        System.out.println("NULL");
    }
    public void reverseList() {
        if(head == null || head.next == null) {
            return;
        }


        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }


    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addfirst("a");
        list.addfirst("is");
    }
}
