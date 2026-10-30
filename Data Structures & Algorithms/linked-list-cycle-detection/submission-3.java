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
        HashMap<ListNode, Integer> map = new HashMap<>();
        if(head == null) return false;
        while(head.next!=null){
            if(!map.containsKey(head)){
                map.put(head,1);
            }else{
                  return true;
            }
            head = head.next;
        }
    return false;
    }
}
