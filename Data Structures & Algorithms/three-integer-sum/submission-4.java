class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
       

        Arrays.sort(nums);
        //-4, -1, -1, 0, 1, 2
        for(int i=0; i<nums.length; i++){
            int j = nums.length-1;
            int k = i+1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while(k<j){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> lst = new ArrayList<>();
                    lst.add(nums[i]);
                    lst.add(nums[k]);
                    lst.add(nums[j]);
                    ans.add(lst);
                    k++;
                    j--;
                    
                    while (k < j && nums[k] == nums[k - 1]) {
                        k++;
                    }

                    while (k < j && nums[j] == nums[j + 1]) {
                        j--;
                    }
                }
                else if(sum < 0) k++;
                else j--;
            }

        }




        return ans;
//         // while(i<j && k<j){
//         //     int sum = (nums[i]) + (nums[k]) + (nums[j]);
//         //     //-1, 0 , 1, 2, -1, -4
//         //     if(sum == 0){
//         //         List<Integer> lst = new ArrayList<>();
//         //         lst.add(nums[i]);
//         //         lst.add(nums[k]);
//         //         lst.add(nums[j]);
//         //         ans.add(lst);
//         //     }
//         //     if(k==j-1){
//         //         i++; k = i+1; j--;
//         //     }else k++;
//         // }
//         Arrays.sort(nums);
//         // -4, -1, -1, 0 , 1 , 2
//         for(int i=0; i<nums.length; i++){
//             if(i>0 && nums[i] == nums[i - 1]) continue;
//             int target = 0 - nums[i];
//             List<List<Integer>> res = twoSum(nums, target, i+1, nums.length-1);
//             for(List<Integer> val: res){
//                 val.add(nums[i]);
//                 ans.add(val);
//             }
//         }
//         return ans;
//     }

//   //-1, 0 , 1 , 2
//   // 2,5
//     public List<List<Integer>> twoSum(int[] nums, int target, int i, int j){
//             List<List<Integer>> res = new ArrayList<>();
//             while(i<j){
//                 int sum = nums[i] + nums[j];
//                 if(sum == target) {
//                     List<Integer> temp = new ArrayList<>();
//                     temp.add(nums[i]);
//                     temp.add(nums[j]);
//                     res.add(temp);
//                     i++;
//                     j--;
//                     break;
//                 }
//                 if(sum < target) i++;
//                 else j--;
//             }
//         return res;
    }
}

//a b c

// a + b + c = 0

// a+b = -c







