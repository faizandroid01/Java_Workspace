package tree.bst;

public class BSTTraversals {
    TreeNode root;

    public BSTTraversals() {
        root = null;
    }

    void traversalInOrder(TreeNode node) {
        // traverse Tree in -> Left , Root , Right order

        if (node == null)
            return;

        traversalInOrder(node.left);
        System.out.print(node.data + " ");
        traversalInOrder(node.right);
    }

    void traversalPreOrder(TreeNode node) {
        // traverse Tree in -> Root , Left , Right

        if (node == null)
            return;

        System.out.print(node.data + " ");
        traversalPreOrder(node.left);
        traversalPreOrder(node.right);
    }

    void traversalPostOrder(TreeNode node) {
        // traverse Tree in -> Left , Right , Root  order

        if (node == null)
            return;

        traversalPostOrder(node.left);
        traversalPostOrder(node.right);
        System.out.print(node.data + " ");

    }


}
