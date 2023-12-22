package linkedList;

public class LinkedList {

    Node head;

    //add
    protected void addNode(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
        print("after Adding " + data);
    }

    //del
    private void removeNode(int data) {
        Node temp = head;
        if(head.data == data){
            head = head.next;
        }else {
            while (temp.next != null && temp.next.data != data) {
                temp = temp.next;
            }
            if(temp.next == null){
                System.out.println("Invalid Node to be removed :"+ data);
                return;
            }
            if (temp.next.next != null) {
                temp.next = temp.next.next;
            } else {
                temp.next = null;
            }
        }
        print("after Del");
    }

    //add Node in between
    private void addNodeAfter(int data , int afterData){

        Node temp = head;
        while (temp.next != null && temp.next.data != afterData){
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("Invalid After Node "+afterData);
            return;
        }

        Node x= new Node(data);
        x.next = temp.next.next;
        temp.next.next = x;

        print("after insertion in between for "+data + " after "+afterData);

    }
    //print
    private void print(String msg) {

        System.out.println(msg);

        Node temp = head;

        if (head == null) {
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
        System.out.println();

    }

    protected Node getFirstNode(){
        Node first = head;
        return first!=null ? first : null;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(9);
        linkedList.addNode(10);
        linkedList.addNode(13);
        linkedList.addNode(4);
        linkedList.addNodeAfter(5,13);
        linkedList.addNodeAfter(6,4);
        linkedList.addNodeAfter(15,30);
        linkedList.removeNode(9);
        linkedList.removeNode(13);
        linkedList.removeNode(15);
    }

}
