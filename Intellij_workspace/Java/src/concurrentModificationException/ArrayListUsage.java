package concurrentModificationException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListUsage {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<Integer>();
        // Adding 5 elements to the set
        for(int i=1;i<=5;i++) {
            numList.add(i);
        }

        // Creating new thread
        new Thread(() -> {
            try {
                // introducing some delay
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            // add new element to the set
            numList.add(6);
            System.out.println("" + numList);
        }).start();

        // get an iterator
        Iterator<Integer> itr = numList.iterator();
        while(itr.hasNext()){
            Integer i = itr.next();
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //itr.remove();
            System.out.println("" + i);
        }
    }
}