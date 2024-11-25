public class BinaryTree {
    Node root;
    class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            data = d;
            left = null;
            right =null;
        }
    }
    BinaryTree(int data){
        root = new Node(data);
    }
    public void insertLeft(Node root, int d){
        Node newNode = new  Node(d);
        root.left = newNode;
    }

    public void insertRight(Node root, int d){
        Node newNode = new Node(d);
        root.right = newNode;
    }

    public static void preOrder(Node root){
        if(root != null){
            System.out.print(root.data +" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data +" ");
            inOrder(root.right);
        }
    }

    public static void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data +" ");
        }
    }
}
