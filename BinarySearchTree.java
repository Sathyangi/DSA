class BSTNode {
    int data;
    BSTNode left, right;

    BSTNode(int value) {
        data = value;
        left = right = null;
    }
}

public class BinarySearchTree {
    BSTNode root;

    boolean isEmpty() {
        return root == null;
    }

    BSTNode insert(BSTNode node, int value) {
        if (node == null)
            return new BSTNode(value);

        if (value < node.data)
            node.left = insert(node.left, value);
        else if (value > node.data)
            node.right = insert(node.right, value);

        return node;
    }

    boolean search(BSTNode node, int key) {
        if (node == null) return false;
        if (key == node.data) return true;
        if (key < node.data) return search(node.left, key);
        return search(node.right, key);
    }

    void inorder(BSTNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    void preorder(BSTNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    void postorder(BSTNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    BSTNode minValueNode(BSTNode node) {
        BSTNode current = node;
        while (current != null && current.left != null)
            current = current.left;
        return current;
    }

    BSTNode deleteNode(BSTNode node, int key) {
        if (node == null) return node;

        if (key < node.data)
            node.left = deleteNode(node.left, key);
        else if (key > node.data)
            node.right = deleteNode(node.right, key);
        else {
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;

            BSTNode temp = minValueNode(node.right);
            node.data = temp.data;
            node.right = deleteNode(node.right, temp.data);
        }
        return node;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int v : values)
            tree.root = tree.insert(tree.root, v);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.println("\nSearch 40: " + tree.search(tree.root, 40));

        tree.root = tree.deleteNode(tree.root, 20);

        System.out.print("After Deletion: ");
        tree.inorder(tree.root);
    }
}
