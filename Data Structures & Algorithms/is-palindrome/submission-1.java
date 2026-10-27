class Solution {
    public boolean isPalindrome(String s){
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String string = "";
        for(int i=str.length()-1; i>=0; i--){
            string = string + str.charAt(i);
        }
    return str.equals(string);
    }
}
