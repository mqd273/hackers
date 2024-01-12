package com.tujia.collectTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * @Author:lidongw_1
 * @Date 2020/3/28
 * @Description: TODO
 **/
public class LinkedListTest {

    public static void main(String[] args) {


        HashMap hm = new HashMap<String, String>();

        ArrayList<String> strings = new ArrayList<>();

        strings.add("abc");
        strings.add("d");
        strings.add("e");

        List<String> collect = strings.stream().map(p -> {
            if (p == "d") return null;
            return p;
        }).collect(Collectors.toList());


        System.out.println(collect);

        Queue<Object> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);


        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue);


        PriorityQueue<Integer> pq = new PriorityQueue<>(2, Collections.reverseOrder());
        pq.add(1);
        pq.add(2);

        System.out.println(pq.poll());
        pq.add(3);
        pq.add(4);

        System.out.println(pq);
        pq.clear();
        System.out.println(pq.size());




    }

}
