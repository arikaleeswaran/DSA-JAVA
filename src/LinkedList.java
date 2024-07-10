public class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }

    LinkedList(){
        head=null;
    }

    public void insertAtBeg(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        return;
    }

    public void insertAtPost(int pos,int val){
        Node newNode = new Node(val);
        Node temp = head;
        if(pos == 0){
            insertAtBeg(val);
            return;
        }
        for(int i=1;i<pos;i++){
            temp = temp.next;
            if(temp == null){
                throw new IllegalArgumentException("Invalid index");
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return;
    }
    public void insertAtEnd(int val){
        Node newNode = new Node(val);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

    }
    public void deleteAtBeg(){
        Node temp = head;
        if(head == null){
            System.out.println("List Empty");
            return;
        }
        head = temp.next;
        return;
    }
    public void deleteAtEnd(){
        Node temp = head;
        Node prev = null;
        if(head == null ){
            throw new IndexOutOfBoundsException("No items in list");
            //return;
        }
        while(temp.next!= null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return;
    }

    public void deleteAtPos(int pos){
        Node temp = head;
        Node prev = null;
        if(pos == 0 ){
            deleteAtBeg();
            return;
        }
        for(int i = 1;i<pos;i++){
            prev = temp;
            temp = temp.next;
            if(temp == null ){
                throw new IndexOutOfBoundsException("Check index");
            }
        }
        prev.next = temp.next;
        return;
    }

    public int get(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
            if(temp == null){
                throw new IndexOutOfBoundsException("Check you index value");
            }
        }
        System.out.println(temp.data);
        return temp.data;
    }

    public void update(int ind,int val){
        Node temp = head;
        Node newNode = new Node(val);
        if(ind == 0){
            insertAtBeg(val);
            return;
        }
        for(int i=0;i<ind-1;i++){
            temp = temp.next;
            if(temp == null){
                throw new IndexOutOfBoundsException();
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return;
    }
    public int search(int val){
        Node temp = head;
        int ind =0;
        while(temp != null){
            if(temp.data == val){
                System.out.println("Index " + ind);
                break;
            }
            temp = temp.next;
            ind++;
        }
        if(temp == null){
            System.out.println("Value not found");
            return 0;
        }
        return ind;
    }
    public boolean contains(int val){
        Node temp  = head;
        while(temp != null){
            if(temp.data == val){
                System.out.println(true);
                return true;
            }
            temp = temp.next;

        }
        System.out.println(false);
        return false;
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next = curr.next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return;
    }
}