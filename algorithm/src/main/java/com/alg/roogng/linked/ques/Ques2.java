package com.alg.roogng.linked.ques;

import com.alibaba.fastjson.JSON;

/**
 * 题目1：反转链表2
 * 难度：中等
 * 反转一个链表中的m到n之间的记录;
 * 条件:1<=m<=n<=链表长度
 *
 * 输入: 1->2->3->4->5->null,m = 2,n = 4
 * 输出: 1->4->3->2->5->null
 */
public class Ques2 {
    /**
     * 反转链表
     * @param head 链表
     * @param m 开始位置
     * @param n 结束位置
     * @return
     */
    public ListNode reverseList(ListNode head,int m,int n){
        if(head == null || m >= n){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        //寻找m的位置
        for (int i=1;i<m;i++){
            head = dummy.next;
        }
        //保存不需要反转的部分
        ListNode prevM= head;
        //反转的开始位置和结束位置，mNode和nNode都默认到m节点
        ListNode mNode = head.next;
        ListNode nNode = head.next;
        //存储反转的下一个位置
        ListNode postNode = nNode.next;
        //开始反转从m到n的节点
        for (int i=m;i<n;i++){
            //先把postNode中的next指针存起来
            ListNode next = postNode.next;
            /**
             * 1.当前位置的next指向前一个节点
             * 2.再把当前节点赋值给前一个节点
             */
            postNode.next = nNode;
            nNode = postNode;
            //开始为下一个循环准备数据
            postNode = next;
        }
        mNode.next = postNode;
        prevM.next = nNode;
        return dummy.next;
    }

    public static void main(String[] args) {
        //未反转前
        ListNode bef =  ListNode.init();
        System.out.println("未反转前:"+ JSON.toJSONString(bef));
        //反转后
        Ques2 ques2 = new Ques2();
        ListNode after = ques2.reverseList(bef,2,4);
        System.out.println("反转后:"+JSON.toJSONString(after));
    }
}
