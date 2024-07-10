public class Selectionsort {
    public static void main(String[] args) {
        int[] nums = {6,5,2,8,3,7};
        int temp=0;
        int minIndex=-1;
        System.out.println("Before sorting:");
        for(int n:nums){
            System.out.print(n+" ");
        }

        for(int i=0;i<nums.length-1;i++){
            minIndex =i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;
                }
            }
            temp = nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=temp;

            System.out.println();
            for(int n:nums){
                System.out.print(n+" ");
            }
        }

        System.out.println();
        System.out.println("After swapping:");
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}
