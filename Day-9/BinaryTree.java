
class Node {
    int data;
    Node left, right;
    Node(int value) {
        data = value;
        left = right = null;
    }
}
public class BinaryTree {
    Node root; // Root node of the tree

    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);   // Visit left subtree
            System.out.print(node.data + " ");  // Print current node
            inorder(node.right);  // Visit right subtree
        }
    }
    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");  // Print current node
            preorder(node.left);   // Visit left subtree
            preorder(node.right);  // Visit right subtree
        }
    }
    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);   // Visit left subtree
            postorder(node.right);  // Visit right subtree
            System.out.print(node.data + " ");  // Print current node
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPreorder Traversal:");
        tree.preorder(tree.root);

        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree.root);
    }

    
}


