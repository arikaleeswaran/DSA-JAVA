public class QueueArray2 {
    int MAX_VALUE =30;
    int[] arr;
    int front,rear;
    QueueArray2(){
        arr = new int[MAX_VALUE];
        front =0;
        rear =-1;
    }

    public void enqueue(int val){
        if(rear == MAX_VALUE-1){
            throw new IndexOutOfBoundsException("Queue is full!");
        }

        arr[++rear] = val;
    }

    public int dequeue(){
        if(rear == -1){
            throw new IndexOutOfBoundsException("Queue is Empty!");
        }
        int temp = arr[0];
        for(int i=1;i<= rear;i++){
            arr[i-1] = arr[i];
        }
        rear--;
        return temp;
    }
}
