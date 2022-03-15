package com.alg.roogng.linked;

/**
 * 链表定义：链表是一种物理存储单元上非连续，非顺序的存储结构，数据元素的逻辑顺序是通过链表中的指针，链接次序来实现的
 * 数组和链表：
 * 插入：数组O(n) 链表O(1)
 * 随机访问：数组O(1) 链表O(n)
 * 其他：
 * 1.数组必须是连续的一段内存
 * 2.链表可以是分散的内存
 * 3.数组简单易用，内存是连续的，就可以借助cpu的缓存机制，来加快访问速度；链表则不是
 * 4.
 *
 */
public class LinkedTag {
    /**
     * 链表数据结构
     */
    private static class Node{
        int data; //数据
        Node next; //下一个元素指针
    }

    public static void main(String[] args) {
        Node node= new Node();
        //单链表中，最后一个元素中，node.next=null;
        System.out.println("单链表中，最后一个元素，node.next="+node.next);
        System.out.println("循环列表中，最后一个元素，node.next指向第一个元素");
    }
}
