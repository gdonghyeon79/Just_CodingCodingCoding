package leetcode;

public class RemoveNthFromEnd {

    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int length = 0;
        ListNode first = head;

        while(first != null){
            first = first.next;
            length++;
        }

        length = length - n;

        first = dummy;

        while(length>0){
            first = first.next;
            length--;
        }

        first.next = first.next.next;

        return dummy.next;

    }
}
