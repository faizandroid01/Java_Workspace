package linkedList;

public class LLlength {

    public static int lengthOfLL(Node node){

        if(node == null)
            return 0;

        return 1+lengthOfLL(node.next);
    }

    public static void main(String[] args) {



        
    }

}
