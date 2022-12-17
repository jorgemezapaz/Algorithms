package easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates1(ListNode head) {
        Set<Integer> mem = new HashSet();
        ListNode node = head;
        ListNode lastNode = null;
        while(node != null){
            if(mem.contains(node.getVal())){
                ListNode aux = node.getNext();
                lastNode.setNext(aux);
                node = lastNode;
            }else{
                mem.add(node.getVal());
                lastNode = node;
            }
            node = node.getNext();
        }
        return head;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        ListNode list = head;

        while(list != null) {
            if (list.getNext() == null) {
                break;
            }
            if (list.getVal() == list.getNext().getVal()) {
                list.setNext(list.getNext().getNext());
            } else {
                list = list.getNext();
            }
        }

        return head;
    }
}

class ListNode{
    private Integer val;
    private ListNode next;
    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}