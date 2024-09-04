public class QueueArray {
    int MAX_VAL=30;
    int[] arr;
    int front,rear;
    QueueArray(){
        arr = new int[MAX_VAL];
        front =-1;
        rear = -1;
    }

    public void enqueue(int data){
        if(rear == MAX_VAL -1){
            throw new IndexOutOfBoundsException("Queue id Full!");
        }
        if(front ==-1){
            front++;
        }
        arr[++rear] = data;
    }

    public int dequeue(){
        if(front ==-1 || front>rear){
            throw new IndexOutOfBoundsException("Queue if Empty!");
        }
        return arr[front++];
    }

}
