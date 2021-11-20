package testKnowledge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestListSort {

    public static void main(String[] args) {
        List l = new ArrayList<>();
        l.add(10);
        l.add(50);
        l.add(30);
        l.add(40);
        l.add(20);

        Comparator cmp = Collections.reverseOrder();

        Collections.sort(l,cmp);

        System.out.println(l);

    }



}
