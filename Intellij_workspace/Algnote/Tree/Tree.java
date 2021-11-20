package Tree;

public class Tree {

	static class TreeNode {

		int val;
		private TreeNode left;
		private TreeNode right;

		public TreeNode() {
		}

		public TreeNode(int x) {
			this.val = x;
		}

		public TreeNode getLeft() {
			return left;
		}

		public void setLeft(TreeNode left) {
			this.left = left;
		}

		public TreeNode getRight() {
			return right;
		}

		public void setRight(TreeNode right) {
			this.right = right;
		}

	}

	public static void main(String[] args) {

		TreeNode treeNode = new TreeNode(5);
		System.out.println(treeNode.val);
		System.out.println(treeNode.left);
		System.out.println(treeNode.left);
		System.out.println(treeNode.right);
		System.out.println(treeNode.right);

	}

}
