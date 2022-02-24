package mergeTwoLists_21;
//定义的单链表
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
    /***
     * 两个单链表有序，使用两个链表引用完成
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList=new ListNode();
        ListNode returnLsit =newList;
        ListNode tmpNode;
        //将list1链表和list2链表插入到新链表中
        while (list1!=null&&list2!=null){
            if(list1.val< list2.val){
                tmpNode=list1;
                list1=list1.next;
            }else {
                tmpNode=list2;
                list2=list2.next;
            }
            newList.next=tmpNode;
            newList=newList.next;
        }
        if (list1!=null){
            newList.next=list1;
        }
        if(list2!=null){
            newList.next=list2;
        }
        return returnLsit.next;
    }
    public static void main(String[] args){

    }
}
