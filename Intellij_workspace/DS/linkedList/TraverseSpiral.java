package linkedList;

import java.util.Arrays;
import java.util.List;

public class TraverseSpiral {

    //Problem - Print Spiral Linked List in O(n)time
    // GFG - https://www.geeksforgeeks.org/print-a-singly-linked-list-in-spiral-order/?ref=header_search

    public static void spiralTraversalWithList(List<Integer> list){
        int mid = list.size() % 2 ==0 ? (list.size()/2)-1  : list.size()/2;
        int lPointer =mid , rPointer = mid+1;
        for(int i=0; i<6 && (lPointer >=0 || rPointer < list.size());  i++) {

            if(i%2==0){
                System.out.print(list.get(lPointer));
                lPointer--;
            }else {
                System.out.print(list.get(rPointer));
                rPointer++;
            }
        }
     System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Spiral LinkedList Traversal through List");
        spiralTraversalWithList(Arrays.asList(1, 2, 3, 4, 5, 6)); // expectation -> 342516
        spiralTraversalWithList(Arrays.asList(1,2,3)); // expectation ->231

        System.out.println("Spiral LinkedList Traversal through Linked List");

       LinkedList linkedList = new LinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);
        linkedList.addNode(6);

        spiralTraversalWithLinkedList(linkedList.getFirstNode()); // expectation -> 342516
    }

    private static void spiralTraversalWithLinkedList(Node head) {

        int len = LLlength.lengthOfLL(head);
        int mid = len % 2 ==0 ? (len/2)-1 : len/2;

        if(len==1){
            System.out.print(head.data);
            return;
        }
        if(len==2){
            System.out.print(head.data);
            System.out.print(head.next.data);
            return;
        }

        int count = 0;

        // reversing the linked list
        Node temp=head,temp1 = null,head2=null;
        while(count<=mid){
            if(temp==head){
                head=head.next;
                temp.next=null;
            }else{
                temp1=head;
                head=head.next;
                temp1.next=temp;
                temp=temp1;

                if(count==mid){
                    head2=temp1;
                }
            }
            count ++;
        }

        // iterate the heads (head towards right end , head2 towards left end) and print the list

        while(head!=null || head2!=null){
            if(head2!=null)
                System.out.print(head2.data);
            if(head!=null)
                System.out.print(head.data);

            if(head!=null)
                head=head.next;
            if(head2!=null)
                head2=head2.next;
        }
    }
}
