package com.alg.roogng.linked.ques;

import com.alibaba.fastjson.JSON;

/**
 * 题目1：反转链表
 * 难度：简单
 * 反转一个简单的链表;
 * 输入: 1->2->3->4->5->null
 * 输出: 5->4->3->2->1->null
 */
public class Ques1 {
    /**
     * 反转链表
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode perv = head;
        ListNode current = head.next;
        perv.next = null;
        while (current != null){
            //先把current中的next指针存起来
            ListNode next = current.next;
            //开发反转，由于对象中有对象，所以需要两步来操作
            /**
             * 1.当前位置的next指向前一个节点
             * 2.再把当前节点赋值给前一个节点
             */
            current.next = perv;
            perv = current;
            //开始为下一个循环准备数据
            current = next;
        }
        return perv;
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        //未反转前
        ListNode bef =  ListNode.init();
        System.out.println("未反转前:"+ JSON.toJSONString(bef));
        //反转后
        Ques1 ques1 = new Ques1();
        ListNode after = ques1.reverseList(bef);
        System.out.println("反转后:"+JSON.toJSONString(after));
    }
}
