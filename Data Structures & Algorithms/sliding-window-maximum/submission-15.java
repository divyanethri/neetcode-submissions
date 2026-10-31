class Solution {
  public List<Integer> getMaxAns(int[] nums, int k, int[] nextGreater){
    List<Integer> res = new ArrayList<>();
    //[1,2,1,0,4,2,6,7]  
    // 1 4 4 4 6 6 7 7
    //    i   j
    //    2
    //[2,2,4,4,6]
    int i=0;
    int j =k-1;
   
    while (j < nums.length) {
            int index = i;
            // Keep jumping to the next greater element
            while (nextGreater[index] <= j && nextGreater[index] != index) {
                index = nextGreater[index];
            }
            res.add(nums[index]);
            i++;
            j++;
        }

    return res;
  }


    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 1 || k == 1) return nums;
        int index =0;
        int[] nextGreater = getGreaterElement(nums);
        List<Integer> res = getMaxAns(nums,k,nextGreater);
        int[] ans = new int[res.size()];
        for(Integer val: res){
            ans[index] = val;
            index++;
        }
        return ans;
    }

    public int[] getGreaterElement(int[] nums){
            int[] res = new int[nums.length];
            Stack<Integer> st = new Stack<>();
            for(int i=nums.length-1; i>=0;i--){
                int element = nums[i];
                if(st.size()==0){
                    res[i]= i;
                }
                else{
                    while(st.size() !=0 && nums[st.peek()]<=element){
                        st.pop();
                    }
                    if(st.size()!=0){
                       res[i] =st.peek();
                    }else{
                        res[i] = i;
                    }
                }
                st.push(i);
            }
        return res;
    }

//     public List<Integer> getMax(int[] nums, int k){
//        List<Integer> res = new ArrayList<>();
//        int i=0; int j=k-1;
//        for(int l=0; l<(nums.length-(k-1)); l++){
//             int t=i;
//             int maxCount = -10000;
//             while(t<j && j<nums.length){
//                 if(nums[t] > maxCount){
//                     maxCount = nums[t];
//                 }
//             }
//             res.add(maxCount);
//             t++;
//             i++;
//             j++;
//        }
//     return res;
// }
}


//  k =3
    //  i
    //      j
