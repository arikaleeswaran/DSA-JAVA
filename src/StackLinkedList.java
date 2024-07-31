public class StackLinkedList {
    Node top;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next= null;
        }
    }

    StackLinkedList(){
        top = null;
    }

    //Insert at Beg and Delete at Beg
    public void push(int val){
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if(top == null){
            throw new IndexOutOfBoundsException("List Empty!");
        }
        int temp = top.data;
        top = top.next;
        System.out.println("Pop: "+ temp);
        return temp;
    }

    public int peek(){
        if (top == null){
            throw new IndexOutOfBoundsException("List empty!");
        }
        System.out.println("Element at top: "+ top.data);
        return top.data;
    }
}
