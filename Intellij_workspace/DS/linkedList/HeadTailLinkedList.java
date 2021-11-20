package linkedList;

public class HeadTailLinkedList {
    Node head, tail;

    private void addNode(int data) {
        if (head == null) {
            tail = head = new Node(data);
        } else {
            Node temp = new Node(data);
            tail.next = temp;
            tail = temp;
        }
        print("added Node " + data);
    }

    private void addNodeAfter(int data, int afterData) {

        if (head == null) {
            System.out.println("Invalid operation on blank LinkedList");
            return;
        } else if (tail.data == afterData) {
            Node temp = new Node(data);
            tail.next = temp;
            tail = temp;
        } else {

            Node temp = head;
            while (temp.next != null && temp.next.data != afterData) {
                temp = temp.next;
            }

            if (temp.next == null) {
                System.out.println("Invalid after Data Key found :" + afterData);
                return;
            }

            if (temp.next.next == null) {
                temp.next.next = new Node(data);
            } else {

                Node x = new Node(data);
                x.next = temp.next.next;
                temp.next.next = x;

            }
        }
        print("added node " + data + " after " + afterData);
    }

    private void removeNode(int data) {

        if (head == null){
            System.out.println("Invalid Remove from empty list");
            return;
        }else if (head.data == data){
             head = head.next;
        }
        else {

            Node temp = head;
            while (temp.next != null && temp.next.data!= data){
                temp = temp.next;
            }

            if (temp.next == null){
                System.out.println("No data found to be removed as"+ data);
                return;
            }else {
                temp.next = temp.next.next;
            }


        }
        print("removeNode " + data);
    }

    private void print(String msg) {

        System.out.println(msg);

        if(tail == head){
            System.out.println( tail.data + ", ");
            return;
        }

        Node temp = head ;
        while (temp !=null) {
            System.out.print( temp.data + ", ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {

        HeadTailLinkedList linkedList = new HeadTailLinkedList();
        linkedList.addNode(9);
        linkedList.addNode(10);
        linkedList.addNode(13);
        linkedList.addNode(4);
        linkedList.addNodeAfter(5, 13);
        linkedList.addNodeAfter(6, 4);
        linkedList.addNodeAfter(15, 30);
        linkedList.removeNode(9);
        linkedList.removeNode(13);
        linkedList.removeNode(15);
        linkedList.removeNode(6);

    }

}
