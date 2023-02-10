package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashset {
    public static  void main (String[] args)
    {
        Logger l = Logger.getLogger("kawin");
        HashSet<String> hs = new HashSet<String>();
        hs.add("5");
        hs.add("10");
        hs.add("15");
        hs.add("20");
        hs.add("5");
        l.log(Level.INFO, ()->String.valueOf(hs));
        hs.remove("20");
        l.log(Level.INFO, ()->""+String.valueOf(hs));
        l.log(Level.INFO, ()->"size "+String.valueOf(hs.size()));
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(5);
        lhs.add(3);
        lhs.add(1);
        l.log(Level.INFO, ()->String.valueOf(lhs));

        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(100);
        ll.add(20);
        ll.add(20);
        l.log(Level.INFO, ()->String.valueOf(ll));

        LinkedHashSet e = new LinkedHashSet(ll);
        l.log(Level.INFO, ()->String.valueOf(e));
        e.clear();
        l.log(Level.INFO, ()->"size "+String.valueOf(e.size()));

    }
}
