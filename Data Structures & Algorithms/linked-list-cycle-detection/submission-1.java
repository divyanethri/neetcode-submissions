/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if(head == null) return false;
        while(head.next!=null){
            if(!map.containsKey(head.val)){
                map.put(head.val,1);
            }else{
                map.put(head.val,map.get(head.val)+1);
            }
            if(map.get(head.val)>1){
                return true;
            }
            head = head.next;
        }
    return false;
    }
}
