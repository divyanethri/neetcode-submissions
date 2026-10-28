class Solution {
    public int lengthOfLongestSubstring(String s){
            int res=0;
            int len=0;
            HashMap<Character, Integer> freqMap = new HashMap<>();
            int i=0;
            int j=0;
            while(j<s.length()){
                char ch = s.charAt(j);
                if(!freqMap.containsKey(ch)){
                    freqMap.put(ch,1);
                }else{
                    freqMap.put(ch,freqMap.get(ch)+1);
                }
                //s="pwwkew"
                if(freqMap.get(ch)>1){
                    while(freqMap.get(ch)!=1){
                        char c = s.charAt(i);
                        if(freqMap.get(c)==1){
                            freqMap.remove(c);
                        }else{
                            freqMap.put(c,freqMap.get(c)-1);
                        }
                        i++;
                    }
                }
                len = (j-i) + 1;
                res = Math.max(len, res);
                j++;
            }
        return res;
    }
}
//hjikj  h -> 1
//hjik


//dbdf
//db

//h j j k i p s t k j  i  j
//   0 1 2 3 4 5 6 7 8 9 10 11
//                        i  j  
 
//  count = 2;
//  len = 7;


//   i -> 1
//   j -> 1
