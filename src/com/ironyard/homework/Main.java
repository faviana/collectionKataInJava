package com.ironyard.homework;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by favianalopez on 10/18/16.
 */
public class Main {

    public static void main (String[] args){

        // create your list
        List<Integer> a = new ArrayList<>();
        // add integers to it
        a.add(1);
        a.add(2);
        a.add(6);
        // send list into this method
        Kata.firstLast(a);

        List<Integer> b = new ArrayList<>();
        b.add(6);
        b.add(1);
        b.add(2);
        b.add(3);
        Kata.firstLast(b);

        List<Integer> c = new ArrayList<>();
        c.add(13);
        c.add(6);
        c.add(1);
        c.add(2);
        c.add(3);
        Kata.firstLast(c);

        //SAME FIRST LAST

        List<Integer> d = new ArrayList<>();
        d.add(1);
        d.add(2);
        d.add(3);
        Kata.sameFirstLast(d);

        List<Integer> e = new ArrayList<>();
        e.add(1);
        e.add(2);
        e.add(3);
        e.add(1);
        Kata.sameFirstLast(e);

        List<Integer> f = new ArrayList<>();
        f.add(1);
        f.add(2);
        f.add(1);
        Kata.sameFirstLast(f);

        List<Integer> g = new ArrayList<>();
        g.add(1);
        g.add(2);
        g.add(3);
        Kata.rotateLeft(g);

        List<Integer> h = new ArrayList<>();
        h.add(5);
        h.add(11);
        h.add(9);
        Kata.rotateLeft(h);

        List<Integer> i = new ArrayList<>();
        i.add(7);
        i.add(0);
        i.add(0);
        Kata.rotateLeft(i);

        List<Integer> j = new ArrayList<>();
        j.add(1);
        j.add(2);
        j.add(3);
        Kata.reversed(j);

        List<Integer> k = new ArrayList<>();
        k.add(5);
        k.add(11);
        k.add(9);
        Kata.reversed(k);

        List<Integer> l = new ArrayList<>();
        l.add(7);
        l.add(0);
        l.add(0);
        Kata.reversed(l);

        List<Integer> m = new ArrayList<>();
        m.add(1);
        m.add(2);
        m.add(3);
        Kata.sumFirstPenultimate(m);

        List<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(1);
        Kata.sumFirstPenultimate(n);

        List<Integer> o = new ArrayList<>();
        o.add(1);
        o.add(1);
        o.add(1);
        o.add(1);
        Kata.sumFirstPenultimate(o);

        List<Integer> p = new ArrayList<>();
        p.add(1);
        p.add(2);
        p.add(3);
        p.add(4);
        Kata.sumFirstPenultimate(p);

        HashMap<String, String> q = new HashMap<>();
        q.put("b", "dirt");
        q.put("a", "candy");
        Kata.mapBully(q);





    }
}
