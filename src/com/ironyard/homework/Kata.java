package com.ironyard.homework;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by favianalopez on 10/18/16.
 */
public class Kata {

    public static void firstLast(List<Integer> a) {
        if (a.get(0) == 6 || a.get(a.size() - 1) == 6) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }


    public static void sameFirstLast(List<Integer> f) {
        if ((f.size() >= 1) && (f.get(0) == f.get(f.size() - 1))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void rotateLeft(List<Integer> g) {

        // remove
        int removed = g.remove(0);
        // add at position
        g.add(2, removed );

        System.out.println(g);

        }

        public static void reversed(List<Integer> j){

            Collections.reverse(j);

            System.out.println(j);
        }

        public static void sumFirstPenultimate(List<Integer> m){

            int sum = m.get(0) + m.get(m.size() - 2);

            System.out.println(sum);
        }

        public static void mapBully(HashMap<String, String> q){

            //swap value b to a
            q.put(a, q.put(b, q.get(a)));
            //set value a to ""
            q.put(a, q.put(""));

            System.out.print(q);

        }






    }



