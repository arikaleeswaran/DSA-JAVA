public class ArrayStack {
    static final int MAX_VALUE = 30;
    int[] arr = new int[MAX_VALUE];
    int top;

    ArrayStack(){
        top =-1;
    }

    public void push(int val){
        if(top == MAX_VALUE -1){
            throw new IndexOutOfBoundsException("Stack overflow!");
        }
        arr[++top] = val;
    }

    public int pop(){
        if(top ==-1){
            throw new IndexOutOfBoundsException("Stack underflow!");
        }
        return arr[top--];
    }

    public int peek(){
        System.out.println(arr[top]);
        return arr[top];
    }
}
