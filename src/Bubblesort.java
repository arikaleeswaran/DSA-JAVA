public class Bubblesort {
    public static void main(String[] args) {
        int[] nums = {6,7,2,9,4,1,5};

        System.out.println("Before Swap:");
        for(int n:nums){
            System.out.print(n);
        }
        int temp;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Swap:");
        for(int n:nums){
            System.out.print(n);
        }
    }
}
