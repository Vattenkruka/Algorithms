package Oscar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.right = new BST(5);
        root.right = new BST(15);
        root.right.left = new BST(13);
        root.right.left.right = new BST(14);
        root.right.right = new BST(22);

        int test = findClosestValueInBst(root,12);
        System.out.println(test);
    }


    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBst(tree, target, tree.value);
    }

    public static int findClosestValueInBst(BST tree, int target, int closest){
        if(Math.abs(target - closest) > Math.abs(target - tree.value)){
                closest = tree.value;
        }
        if(tree.left != null && tree.value > target){
            return findClosestValueInBst(tree.left,target,closest);
        }
        else if(tree.right != null && tree.value < target){
            return findClosestValueInBst(tree.right, target, closest);
        }
        else{
            return closest;
        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}

/*
    How to solve with while loop instead
public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBst(tree, target, tree.value);
    }

    public static int findClosestValueInBst(BST tree, int target, int closest){
        if(Math.abs(target - closest) > Math.abs(target - tree.value)){
                closest = tree.value;
        }
        if(tree.left != null && tree.value > target){
            return findClosestValueInBst(tree.left,target,closest);
        }
        else if(tree.right != null && tree.value < target){
            return findClosestValueInBst(tree.right, target, closest);
        }
        else{
            return closest;
        }
    }
 */