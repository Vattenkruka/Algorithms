package Oscar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.left.left = new BinaryTree(4);
        root.left.left.left = new BinaryTree(8);
        root.left.left.right = new BinaryTree(9);
        root.left.right = new BinaryTree(5);
        root.right = new BinaryTree(3);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);
        int test= 0;
        test = nodeDepths(root);
        System.out.println(test);
    }

    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        return calculateNodeDepths(root,0);
    }
    public static int calculateNodeDepths(BinaryTree root, int parentDepth){
    if(root == null) return 0;
        return parentDepth + calculateNodeDepths(root.left, parentDepth+1) + calculateNodeDepths(root.right, parentDepth+1);
    }



    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    /*
    * Loop solution:
    * public static int nodeDepths(Binarytree root) {
    * int sumOfDepths = 0;
    * List<Level> stack = new ArrayList<Level>();
    * stack.add(new Level(root,0));
    * while (stack.size() > 0) {
    *   Level top = stack.remove(stack.size() - 1);
    *   BinaryTree node = top.root;
    *   int depth = top.depth;
    *   if (node == null) continue;
    *   sumOfDepths += depth;
    *   stack.add(new Level(node.left, depth + 1));
    *   stack.add(new Level(node.right, depth + 1));
    *   }
    *   return sumOfDepths;
    * }
    *
    * static class Level {
    *   public BinaryTree root;
    *   int depth;
    *
    *   public Level(BinaryTree root, int depth) {
    *   this.root = root;
    *   this.depth = depth;
    *   }
    * }
    *
    *  */
}
