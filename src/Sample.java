public class Sample {
    public static void main(String[] args){
//        LinkedList list = new LinkedList();
//        list.insertAtBeg(2);
//        list.insertAtBeg(3);
//        list.insertAtPost(2,65);
//        list.insertAtPost(1,10);
//        list.insertAtPost(0,77);
//        //list.insertAtPost(8,2);
//        list.insertAtEnd(100);
//        list.deleteAtBeg();
//        list.deleteAtEnd();
//        list.deleteAtPos(2);
//        list.get(0);
//        //list.get(10);
//        list.update(1,99);
//        list.update(0,100);
//        //list.update(20,12);
//        //list.search(99);
//        //list.contains(199);
//        list.reverse();
//        list.display();

//        DoublyList lst = new DoublyList();
//        lst.insertAtBegin(87);
//        lst.insertAtBegin(23);
//        lst.insertAtBegin(99);
//        lst.insertAtPos(1,44);
//        lst.insertAtPos(4,100);
//        lst.insertAtEnd(11);
//        lst.deletAtBeg();
//        lst.deleteAtPos(4);
//        lst.insertAtBeg(77);
//        lst.display();
//        System.out.println();
//        lst.displayRev();

        CircularList lst = new CircularList();
        lst.insertAtBeg(10);
        lst.insertAtBeg(99);
        lst.insertEnd(120);
        lst.insertAtBeg(56);
        lst.insertAtBeg(33);
        lst.insertEnd(1);
        lst.deleteAtBeg();
        lst.deleteAtEnd();
        lst.display();

    }
}
