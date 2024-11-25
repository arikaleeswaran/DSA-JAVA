public class Test {
    public static void main(String[] args) {
        int[] arr= new int[]{45,2,34,67,12,3,42};
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l] < arr[r]){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] =temp;
            }
            l++;
            r--;
        }
        for(int n:arr){
            System.out.print(n +" ");
        }
    }
}
