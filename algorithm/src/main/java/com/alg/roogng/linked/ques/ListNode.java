package com.alg.roogng.linked.ques;

/**
 * 题目要用的类，简单链表
 */
public class ListNode {
    int val;
    ListNode next;

    /**
     * 初始化链表
     * @return
     */
    public static ListNode init(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node4.setNext(node5);
        node3.setNext(node4);
        node2.setNext(node3);
        node1.setNext(node2);
        return node1;
    }

    ListNode(int x){
        val = x;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
