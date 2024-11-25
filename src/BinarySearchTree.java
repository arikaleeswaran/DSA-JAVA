public class BinarySearchTree {
    Node root;
    class Node{
        int key;
        Node left;
        Node right;

        Node(int data){
            key = data;
            left =null;
            right =null;
        }
    }
    BinarySearchTree(int data){
            root = new Node(data);
    }
    BinarySearchTree(){
            root = null;
    }

    public void insert(int val){
        insert(root,val);
    }

    public Node insert(Node root,int val){

        if(root == null) return new Node(val);

        if(val< root.key){
            root.left = insert(root.left,val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
    }

    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }
}
