public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.root = tree.insertNode(tree.root, 33);
        tree.root = tree.insertNode(tree.root, 13);
        tree.root = tree.insertNode(tree.root, 53);
        tree.root = tree.insertNode(tree.root, 9);
        tree.root = tree.insertNode(tree.root, 21);
        tree.root = tree.insertNode(tree.root, 61);
        tree.root = tree.insertNode(tree.root, 8);
        tree.root = tree.insertNode(tree.root, 11);
        tree.printTree(tree.root, "", true);
        tree.root = tree.deleteNode(tree.root, 13);
        System.out.println("After Deletion: ");
        tree.printTree(tree.root, "", true);

        RedBlackTree bst = new RedBlackTree();
        bst.insert(55);
        bst.insert(40);
        bst.insert(65);
        bst.insert(60);
        bst.insert(75);
        bst.insert(57);
        bst.printTree();

        System.out.println("\nAfter deleting:");
        bst.deleteNode(40);
        bst.printTree();
    }
}