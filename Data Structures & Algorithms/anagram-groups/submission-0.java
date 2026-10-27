class Solution {
    public List<List<String>> getAnagrams(String[] str){
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0; i<str.length;i++){
            char[] charArr = str[i].toCharArray();
            Arrays.sort(charArr);
            String s = new String(charArr);
            if(!map.containsKey(s)){
                List<String> list = new ArrayList<>();
                list.add(str[i]);
                map.put(s,list);
            }else{
                List<String> existingKeyList = map.get(s);
                existingKeyList.add(str[i]);
                map.put(s,existingKeyList);
            }
        }
        for(String key: map.keySet()){
                List<String> list = map.get(key);
                res.add(list);
        }
    return res;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        return getAnagrams(strs);

        // List<List<String>> lst = new ArrayList<>();
        // if(strs.length()==1) return lst.add(str);

        
        // for(int i=0; i<strs.length-1; i++){
        //     for(int j=0; j<strs.length;j++){

        //     }
        //     if(s.length() != t.length()) return false;

        // }   
    }
    // public boolean isAnagram(String s, String t,List<List<String>> str) {
    //     HashMap<Character, Integer> maps = new HashMap<>();
    //     HashMap<Character, Integer> mapt = new HashMap<>();

    //     for(int i=0; i<s.length(); i++){
    //         maps.put(s.charAt(i),0);
    //         mapt.put(t.charAt(i),0);
    //     }

    //     for(int i=0; i<s.length();i++){
    //         maps.put(s.charAt(i),maps.get(s.charAt(i))+1);
    //     }
    //     for(int i=0; i<t.length();i++){
    //         mapt.put(t.charAt(i),mapt.get(t.charAt(i))+1);
    //     }

    //     for(Character val : maps.keySet()){
    //         if (!mapt.containsKey(val)) return str;
    //         if (!maps.get(val).equals(mapt.get(val))) {
    //         return str;
    //     }
    // str.add()
    // }
    // }
}
