public class Tree {
    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree(10);
//        tree.insertLeft(tree.root,5);
//        tree.insertRight(tree.root,15);
//        tree.insertLeft(tree.root.left,34);
//        tree.insertRight(tree.root.right, 12);
//        tree.insertLeft(tree.root.right,77);
//        tree.insertRight(tree.root.left,90);
//
//        BinaryTree.inOrder(tree.root);
//        System.out.println();
//        BinaryTree.preOrder(tree.root);

//        Binary Search Tree

        BinarySearchTree bst = new BinarySearchTree(43);
        bst.insert(bst.root, 54);
        bst.insert(bst.root, 120);
        bst.insert(bst.root,10);
        bst.insert(bst.root,5);
        bst.insert(40);
        bst.insert(2);

        bst.inOrder(bst.root);
    }
}
