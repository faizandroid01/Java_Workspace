package tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftView {

    static int maxLevel = 0;
    static List<Integer> result = new ArrayList<>();

    static List<Integer> leftViewWithDfs(TreeNode root, int level) {

        if (root == null)
            return new ArrayList<>();

        if (level > maxLevel) {
            result.add(root.data);
            maxLevel = level;
        }
        leftViewWithDfs(root.left, level + 1);
        leftViewWithDfs(root.right, level + 1);

        return result;
    }

    static List<Integer> leftViewWithBfs(TreeNode root) {

        if(root==null)
            return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();

                if(i==0){
                    result.add(temp.data);
                }

                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);

            }

        }

        return result;
    }


}
