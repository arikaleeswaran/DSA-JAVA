public class Insertionsort {
    public static void main(String[] args) {
        int[] nums={3,6,2,9,5,8,3,1};

        System.out.println("Before sorting:");
        for(int n:nums){
            System.out.print(n+" ");
        }
        for(int i=1; i<nums.length;i++){
            int key=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
        System.out.println();
        System.out.println("After sorting:");
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}
