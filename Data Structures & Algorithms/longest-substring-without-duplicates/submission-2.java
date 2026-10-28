class Solution {
    public int lengthOfLongestSubstring(String s){
            int res=0;
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
                while(freqMap.get(ch)!=1){
                        char c = s.charAt(i);
                        if(freqMap.get(c)==1){
                            freqMap.remove(c);
                        }else{
                            freqMap.put(c,freqMap.get(c)-1);
                        }
                    i++;
                }
                res = Math.max((j-i) + 1, res);
                j++;
            }
        return res;
    }
}
