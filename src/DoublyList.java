public class DoublyList {
    Node head;
    Node tail;
    class Node{
        Node prev;
        int data;
        Node next;
        Node(int val){
            prev = null;
            data = val;
            next = null;
        }
    }
    DoublyList(){
        head = null;
        tail = null;
    }
    public void insertAtBegin(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty!");
        }
        while (temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public void displayRev(){
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
    }
    public void insertAtPos(int pos, int val){
        Node newNode = new Node(val);
        Node temp=head;
        if(pos == 0){
            insertAtBegin(val);
            return;
        }
        for(int i=0;i<pos -1;i++){
            temp = temp.next;
            if(temp == null){
                throw new IndexOutOfBoundsException("List Empty Check position");
            }

        }

        newNode.next = temp.next;
        newNode.prev = temp;
        if(temp == tail){
            tail = newNode;
        }else
            temp.next.prev = newNode;
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
    newNode.prev = temp;
    tail = newNode;
    return;
    }

    public void deletAtBeg(){
        if(head == null){
            throw new NullPointerException("The List is empty");
        }
        head = head.next;
        if(head == null){
            tail = null;
        }else
            head.prev = null;
        return;
    }

    public void deleteAtPos(int pos){
        Node temp = head;
        Node prev = null;
        if(pos == 0){
            deletAtBeg();
        }

        for (int i=0;i<pos;i++){
            prev = temp;
            temp = temp.next;
            if(temp == null){
                throw new NullPointerException("Check index!");
            }
        }
        prev.next = temp.next;
        if(temp.next == null){
            tail = prev;
        }else
            temp.next.prev = prev;
    }

    public void insertAtBeg(int val){
        Node newNode = new Node(val);
        head.prev = newNode;
        newNode.next = head;
        head = head.prev;
    }

}
