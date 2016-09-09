package com.leetcode;

import java.util.List;
import java.util.Scanner;

/**
 * Created by andy on 8/9/16.
 *
 *
 * 使用快慢指针找到链表的中位数,同时反转前半部分链表,比较是否是回文字串
 */
public class PalindromeLinkedList234 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()){
            int num=scanner.nextInt();
            ListNode head=new ListNode(scanner.nextInt());
            ListNode l=head;
            for (int i = 1; i < num; i++) {
                l.next=new ListNode(scanner.nextInt());
                l=l.next;
            }
            System.out.println(isPalindrome(head));
        }
    }

    public static boolean isPalindrome(ListNode head) {


        ListNode fast=head,slow=head,part1=head,part2=head;

        while (true){
            if(fast==null || fast.next==null){
                break;
            }
            fast=fast.next.next;
            part2=part1;
            part1=slow;
            slow=slow.next;
            if(part1==null){
                part1.next=null;
            }else {
                part1.next=part2;
            }

        }
//        System.out.println(fast);
//        System.out.println("slow:"+slow.val+"part1:"+part1.val);

        if(fast != null){
            slow=slow.next;
        }
        while (slow!=null){
            if(slow.val != part1.val){
                return false;
            }
            slow=slow.next;
            part1=part1.next;
        }


        return true;

    }

}
