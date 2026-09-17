public class ListNode{
  int val;
  ListNode next;

  ListNode(){};

  ListNode(int val){
    this.val = val;
  }

  ListNode(int val, ListNode next){
    this.val = val;
    this.next = next;
  }
}



class Sol{
  public ListNode mergeTwoLists(ListNode l1, ListNode l2){

    ListNode dummy = new ListNode(-1);
    ListNode curr = dummy;

    while(l1 != null && l2 != null){

      if(l1.val <= l2.val){
        curr.next = l1;
        l1 = l1.next;
      }else{
        curr.next = l2;
        l2= l2.next;
      }

      curr = curr.next;
    }

    while(l1 != null){
      curr.next = l1;
      l1 = l1.next;
      curr = curr.next;
    }

    while(l2 != null){
      curr.next = l2;
      l2 = l2.next;
      curr = curr.next;
    }

    return dummy.next;
  }

public static void main(String[] args) {

  //List 1: 1->3->5
  ListNode l1 = new ListNode(1);
  l1.next = new ListNode(3);
  l1.next.next = new ListNode(5);

  //List 2: 2->4->6
  ListNode l2 = new ListNode(2);
  l2.next = new ListNode(4);
  l2.next.next = new ListNode(6);

Sol solution = new Sol();

ListNode mergeList = solution.mergeTwoLists(l1,l2);

while(mergeList != null){
  System.out.print(mergeList.val + "->");
  mergeList = mergeList.next;
}
System.out.println("null");

}
}