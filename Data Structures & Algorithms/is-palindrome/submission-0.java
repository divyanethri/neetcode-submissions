class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i =0;
        int j = str.length()-1;
        while(i<j){
            char lchar = str.charAt(i);
            char rchar = str.charAt(j);

            if(lchar!=rchar)  return false;
            i++;
            j--;
        }

    return true;
    }
}
