class Solution {
    public int binarySearch(int[] nums, int target, int low, int high){
        while(low<=high){
            int mid = low + (high - low)/2;
           if(nums[mid] == target) return mid;
           if(nums[low]<=nums[mid]){
                if(target>= nums[low] && target<nums[mid]){
                    high=mid-1;
                }else{
                    low = mid+1;
                }
           }else{
                if(target<=nums[high] && target>nums[mid]){
                        low=mid+1;
                    }else{
                        high = mid-1;
                    }
           }
        }
    return  -1;
    }
    public int search(int[] nums, int target) {
        if(nums[0]== target) return 0;
        if(nums[nums.length-1] == target) return nums.length-1; 
        return binarySearch(nums, target, 0, nums.length-1);
    }
}
