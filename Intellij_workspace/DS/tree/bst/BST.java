package tree.bst;

public class BST {

    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        node.left= new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right = new TreeNode(3);

        BSTTraversals bstTraversals = new BSTTraversals();

        bstTraversals.traversalInOrder(node);
        System.out.println();
        bstTraversals.traversalPreOrder(node);
        System.out.println();
        bstTraversals.traversalPostOrder(node);

    }

}
