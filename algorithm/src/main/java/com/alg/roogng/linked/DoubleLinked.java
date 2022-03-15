package com.alg.roogng.linked;

/**
 * 双向链表定义：双向l链表是在单链表的每个节点中，再设置一个指向其前驱节点的指针；
 *
 */
public class DoubleLinked {

    /**
     * 双向链表
     */
    private static class Node{
        int data; //数据
        Node next; //下一个元素指针
        Node prev;  //前一个元素指针
    }
}
