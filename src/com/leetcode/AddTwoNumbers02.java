package com.leetcode;

/**
 * Created by andydoo on 4/25/15.
 * email:duhongguang@foxmail.com
 */

/**
 *problem url: https://leetcode.com/problems/add-two-numbers/
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
->>>>
 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
->>>>
 Tags: LinkedList;Math

 My Runtime: 456 ms
 *
 */
// Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class AddTwoNumbers02 {


    public static void main(String[] args){
        ListNode l1, l2;
        l1=new ListNode(0);
        l2=new ListNode(1);
        //l1.next=new ListNode(9);

        ListNode ln=addTwoNumbers(l1,l2);
        while(ln!=null){
            System.out.println(ln.val);
            ln=ln.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag=0,sum=0;
        ListNode l1next=l1;
        ListNode l2next=l2;
        // merge the two lists
        while(l1next.next!=null && l2next.next!=null){
            l1next.val+=l2next.val;
            l1next=l1next.next;
            l2next=l2next.next;
        }
        l1next.val+=l2next.val;
        if(l1next.next==null) l1next.next=l2next.next;
        l1next=l1;
        while(l1next.next!=null){
            sum=l1next.val+flag;
            l1next.val=sum%10;
            if(sum >= 10) flag=1;else flag=0;
            l1next=l1next.next;
        }
        sum=l1next.val+flag;
        l1next.val=sum%10;
        if(sum>=10) l1next.next=new ListNode(1);
        return l1;
    }
}
