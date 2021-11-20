package tree.binarytree;

public class TreeUtil {

   static TreeNode insertInTree(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }

        if (data < root.data) {
          root.left = insertInTree(root.left, data);
        } else {
          root.right = insertInTree(root.right, data);
        }

        return root;
    }

    //Pre order traversal -- DFS
    static void printNode(TreeNode root){

        if(root==null)
            return;

        System.out.print(root.data+" ");
        printNode(root.left);
        printNode(root.right);

    }

}
