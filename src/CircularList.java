public class CircularList {
    Node last;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    CircularList(){
        last = null;
    }

    public void insertAtBeg(int val){
        Node newNode = new Node(val);
        if(last == null){
            newNode.next = newNode;
            last = newNode;
        }else {
            newNode.next = last.next;
            last.next = newNode;

        }
    }

    public void insertEnd(int val){
        Node newNode = new Node(val);
        if(last == null){
            newNode.next = newNode;
            last = newNode;
        }else{
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }
    public void display(){
        Node temp = last.next;
        do{
            System.out.print(temp.data +" ");
            temp = temp.next;
        }while (temp != last.next);
    }

    public void deleteAtBeg(){
        if(last == null){
            throw new NullPointerException("The list was Empty!");
        }else{
            last.next = last.next.next;
        }
    }

    public void deleteAtEnd(){

        if(last == null){
            throw new NullPointerException("The list was Empty!");
        }
        if(last.next == last){
            last =null;
        }
        Node temp = last.next;
        while (temp.next != last){
            temp = temp.next;
        }
        temp.next = last.next;
        last = temp;

    }

}
