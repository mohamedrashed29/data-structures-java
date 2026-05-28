package BinarySearchTree;

public class BST {

    public class Node {

        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    private Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node temp, int value) {

        if (temp == null) {
            return new Node(value);
        }

        if (value > temp.data) {
            temp.right = insertRec(temp.right, value);
        } else if (value < temp.data) {
            temp.left = insertRec(temp.left, value);
        }
        return temp;
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public void DescendingOrder(Node root) {
        if (root == null) {
            return;
        }
        DescendingOrder(root.right);
        System.out.println(root.data);
        DescendingOrder(root.left);
    }

    public boolean find(int value) {
        if (root == null) {
            return false;
        }
        Node temp = root;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            } else if (value > temp.data) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        return false;
    }

    public void delete(int value) {
        root = removeHelper(root, value);
    }

    private Node removeHelper(Node temp, int value) {
        if (temp == null) {
            return null;
        }

        if (value > temp.data) {
            temp.right = removeHelper(temp.right, value);
        } else if (value < temp.data) {
            temp.left = removeHelper(temp.left, value);
        } else {
            if (temp.left == null) {
                return temp.right;
            } else if (temp.right == null) {
                return temp.left;
            } else {
                temp.data = successor(temp);
                temp.right = removeHelper(temp.right, temp.data);
            }
        }
        return temp;
    }

    private int successor(Node temp) {
        temp = temp.right;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.data;
    }

    public static void main(String[] args) {

        BST tree = new BST();
        // =====================================
        // INSERT
        // =====================================
        tree.insert(50);
        tree.insert(25);
        tree.insert(75);
        tree.insert(10);
        tree.insert(30);
        tree.insert(60);
        tree.insert(80);

        // =====================================
        // ASCENDING
        // =====================================
        System.out.println("Ascending:");
        tree.inOrder(tree.root);
        System.out.println();

        // =====================================
        // DESCENDING
        // =====================================
//        System.out.println("Descending:");
//
//        tree.descending(tree.root);
//
//        System.out.println();
        // =====================================
        // FIND
        // =====================================
        boolean found = tree.find(30);

        if (found) {
            System.out.println("30 Found");
        } else {
            System.out.println("30 Not Found");
        }

        // =====================================
        // DELETE LEAF
        // =====================================
        System.out.println("\nDelete Leaf (10)");

        tree.delete(10);

        tree.inOrder(tree.root);

        System.out.println();

        // =====================================
        // DELETE NODE WITH ONE CHILD
        // =====================================
        System.out.println("\nDelete Node With One Child (25)");

        tree.delete(25);

        tree.inOrder(tree.root);

        System.out.println();

        // =====================================
        // DELETE NODE WITH TWO CHILDREN
        // =====================================
        System.out.println("\nDelete Node With Two Children (50)");

        tree.delete(50);

        tree.inOrder(tree.root);

        System.out.println();
    }
}
