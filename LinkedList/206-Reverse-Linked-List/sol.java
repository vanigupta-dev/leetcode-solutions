class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class sol {
public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode curr = head;
        ListNode prev = null;
        while( curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev ;


        return head;
    }

}
