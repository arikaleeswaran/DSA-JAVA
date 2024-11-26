import com.sun.source.tree.BreakTree;

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

    public Node search(Node root,int val){
        if(root == null || root.key == val) {
            return root;
        }

        if(val< root.key) {
            return search(root.left, val);
        }
        return search(root.right,val);
    }

    public void insertLoop(Node root,int val){
        Node newNode = new Node(val);
        Node cur = root;
        Node par =null;

        while(cur != null){
            par = cur;
            if(val<cur.key){
                cur = cur.left;
            }else{
                cur = cur.right;
            }
        }

        if(val<par.key){
            par.left = newNode;
        }else{
            par.right = newNode;
        }
    }
    public boolean searchLoop(int val){
        Node cur = root;
        while(cur != null){
            if(cur.key == val) return true;
            else if(val< cur.key) cur = cur.left;
            else cur = cur.right;
        }
        return true;
    }

    public Node delete(Node root, int val){

        if(root == null){
            return root;
        }
        if(val< root.key){
            root.left = delete(root.left,val);
        }else if(val> root.key) {
            root.right = delete(root.right, val);
        }else{
            if(root.right == null){
                return root.left;
            }else if(root.left == null){
                return root.right;
            }
            root.key = min(root.right);
            root.right = delete(root.right,root.key);
        }
        return root;
    }
    public int min(Node root){
        int minV = root.key;
        while (root != null){
            minV = root.key;;
            root = root.left;
        }
        return minV;
    }
}
