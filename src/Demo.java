public class Demo {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,11,13};
        int tar =7;
        //int res = linearsearch(arr,tar);
        int res = binarysearch(arr,tar,0,arr.length-1);
        System.out.println("Element in the index of :"+res);
    }
    public static int linearsearch(int[] num,int tar){
        for(int i=0;i<num.length;i++){
            if(num[i]==tar){
                return i;
            }

        }
        return -1;
    }

    // Binary Search without recursive
//    public static int binarysearch(int[] nums, int tar){
//        int strt = 0;
//        int end = nums.length -1;
//
//        while(strt<=end){
//            int mid = (strt+end)/2;
//            if(nums[mid]==tar){
//                return mid;
//            }else if(nums[mid]<tar){
//                strt = mid+1;
//            }else{
//                end = mid-1;
//            }
//        }
//
//        return -1;
//    }

    public static int binarysearch(int[] nums, int tar,int strt,int end){
        // Binary Search with recursion
//        int strt = 0;
//        int end = nums.length -1;

        if(strt<=end){
            int mid = (strt+end)/2;
            if(nums[mid]==tar){
                return mid;
            }
            else if(nums[mid]<tar){
                return  binarysearch(nums,tar,strt=mid+1,end);
            }else{
//                end = mid-1;
                return binarysearch(nums,tar,strt=0,end=mid-1);
            }
        }

        return -1;
    }
}
