class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

// Class managing the Binary Search Tree operations
class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Method to insert a new key
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node root, int data) {
        // If the tree/subtree is empty, create and return a new node
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursive(root.right, data);
        }
        return root;
    }

    // 1. In-order Traversal (Left, Root, Right) - Displays elements in sorted order
    public void displayInorder() {
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(Node root) {
        if (root != null) {
            inorderRecursive(root.left);
            System.out.print(root.data + " ");
            inorderRecursive(root.right);
        }
    }

    // 2. Pre-order Traversal (Root, Left, Right)
    public void displayPreorder() {
        preorderRecursive(root);
        System.out.println();
    }

    private void preorderRecursive(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRecursive(root.left);
            preorderRecursive(root.right);
        }
    }

    // 3. Post-order Traversal (Left, Right, Root)
    public void displayPostorder() {
        postorderRecursive(root);
        System.out.println();
    }

    private void postorderRecursive(Node root) {
        if (root != null) {
            postorderRecursive(root.left);
            postorderRecursive(root.right);
            System.out.print(root.data + " ");
        }
    }
}

class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(2);
        bst.insert(4);
        bst.insert(7);
        bst.insert(6);
        bst.insert(8);

        System.out.print("In-order Traversal (Sorted): ");
        bst.displayInorder();
        System.out.print("Pre-order Traversal: ");
        bst.displayPreorder();
        System.out.print("Post-order Traversal: ");
        bst.displayPostorder();
    }
}
