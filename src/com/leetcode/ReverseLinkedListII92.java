package com.leetcode;

import java.util.Scanner;

/**
 * Created by andy on 8/9/16.
 */
public class ReverseLinkedListII92 {
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

            int n=scanner.nextInt();
            int m=scanner.nextInt();


            head=reverseBetween(head,n,m);
            while (head!=null){
                System.out.println(head.val);
                head=head.next;
            }

        }


    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {

        if (m==n) return head;
        ListNode preM,headM, nextN, headN;
        preM=null;
        headM=head;
        int i=1;
        while ( headM!=null){
            if(i > m-1){
                break;
            }
            i++;
            preM=headM;
            headM=headM.next;
        }

        //System.out.println("headM:"+headM.val);

        nextN = headM;
        while (nextN!=null){
            if(i== n){
                break;
            }
            i++;
            nextN=nextN.next;
        }
        headN=nextN.next;
        nextN.next=null;

        ListNode tmp=headM;
        headM=reverse(headM);


//        ListNode listNode=headM;
//        while (listNode!=null){
//            System.out.println(":"+listNode.val);
//            listNode=listNode.next;
//        }
//
//

        if (preM == null) head=headM ;
        else preM.next=headM;
        tmp.next=headN;

        return  head;
    }
    public static ListNode reverse(ListNode head) {
        // case1: empty list
        if (head == null) return head;
        // case2: only one element list
        if (head.next == null) return head;
        // case3: reverse from the rest after head
        ListNode newHead = reverse(head.next);
        // reverse between head and head->next
        head.next.next = head;
        // unlink list from the rest
        head.next = null;

        return newHead;
    }

}
