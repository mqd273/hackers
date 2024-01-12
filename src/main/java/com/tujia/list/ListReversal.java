package com.tujia.list;

import java.util.List;

/**
 * @Author:lidongw_1
 * @Date 2023/12/24
 * @Description: 单链表反转
 **/
public class ListReversal {


    public static void main(String[] args) {

        ListNote listNote = createListNote();
        ListNote cur = listNote.getNext();
        while (cur != null) {
            System.out.println(cur.getData());
            cur = cur.getNext();
        }

        System.out.println("----------- reversal --------------");
        ListNote reversal = reversal(listNote);
        cur = reversal.getNext();
        while (cur != null) {
            System.out.println(cur.getData());
            cur = cur.getNext();
        }

    }


    private static ListNote createListNote() {

        ListNote head = new ListNote();
        ListNote lastNote = new ListNote();
        head.setNext(lastNote);
        for (int i = 1; i < 10; i++) {
            ListNote note = new ListNote();
            note.setData(i);
            if (i == 1) {
                head.setNext(note);
                lastNote = note;
            } else {
                lastNote.setNext(note);
                lastNote = note;
            }

        }

        return head;
    }


    private static ListNote reversal(ListNote head) {
        ListNote newHead = new ListNote();
        ListNote cur;
        ListNote next;

        cur = head;
        next = cur.getNext();

        while (cur != null) {
            cur.setNext(newHead.getNext());
            newHead.setNext(cur);
            cur = next;

            if (next != null) next = next.getNext();
        }
        return newHead;
    }
}
