package tree.binarytree;

public class LeftViewMain {

    public static void main(String[] args) {

        System.out.println("\n-----------------------------1st Test Case--------------------------------------------");

        //Build Tree 1
        TreeNode root = TreeUtil.insertInTree(null, 55);
        TreeUtil.insertInTree(root, 22);
        TreeUtil.insertInTree(root, 11);
        TreeUtil.insertInTree(root, 44);
        TreeUtil.insertInTree(root, 33);
        TreeUtil.insertInTree(root, 77);
        TreeUtil.insertInTree(root, 99);
        TreeUtil.insertInTree(root, 66);

        //View  Pre Order Traversal
        TreeUtil.printNode(root);

        //LeftView
        System.out.println("\n-----------------------------LEFTVIEW THROUGH DFS--------------------------------------------");
        LeftView.leftViewWithDfs(root,1).forEach(System.out::println);
        LeftView.result.clear();
        LeftView.maxLevel = 0 ;
        System.out.println("\n-----------------------------LEFTVIEW THROUGH BFS--------------------------------------------");
        LeftView.leftViewWithBfs(root).forEach(System.out::println);
        LeftView.result.clear();
        LeftView.maxLevel = 0 ;
        System.out.println("\n-----------------------------2nd Test Case--------------------------------------------");


        //Build Tree 2
        TreeNode root2 = TreeUtil.insertInTree(null, 55);
        TreeUtil.insertInTree(root2, 99);
        TreeUtil.insertInTree(root2, 66);
        TreeUtil.insertInTree(root2, 77);
        TreeUtil.insertInTree(root2, 33);
        TreeUtil.insertInTree(root2, 44);
        TreeUtil.insertInTree(root2, 11);
        TreeUtil.insertInTree(root2, 22);

        //View  Pre Order Traversal
        TreeUtil.printNode(root2);

        //LeftView
        System.out.println("\n-----------------------------LEFTVIEW THROUGH DFS--------------------------------------------");
        LeftView.leftViewWithDfs(root2,1).forEach(System.out::println);
        LeftView.result.clear();
        LeftView.maxLevel = 0 ;
        System.out.println("\n-----------------------------LEFTVIEW THROUGH BFS--------------------------------------------");
        LeftView.leftViewWithBfs(root2).forEach(System.out::println);
        LeftView.result.clear();
        LeftView.maxLevel = 0 ;
        System.out.println("\n-----------------------------3rd Test Case--------------------------------------------");


        //Build Tree 2
        TreeNode root3 = TreeUtil.insertInTree(null, 55);
        TreeUtil.insertInTree(root3, 33);
        TreeUtil.insertInTree(root3, 77);
        TreeUtil.insertInTree(root3, 44);
        TreeUtil.insertInTree(root3, 110);
        TreeUtil.insertInTree(root3, 88);
        TreeUtil.insertInTree(root3, 99);

        //View  Pre Order Traversal
        TreeUtil.printNode(root3);

        //LeftView
        System.out.println("\n-----------------------------LEFTVIEW THROUGH DFS--------------------------------------------");
        LeftView.leftViewWithDfs(root3,1).forEach(System.out::println);

        LeftView.result.clear();
        LeftView.maxLevel = 0 ;
        System.out.println("\n-----------------------------LEFTVIEW THROUGH BFS--------------------------------------------");
        LeftView.leftViewWithBfs(root3).forEach(System.out::println);



    }


}
