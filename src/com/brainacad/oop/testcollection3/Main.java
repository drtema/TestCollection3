package com.brainacad.oop.testcollection3;

import java.util.*;

/**
 * Created by Dr.tema on 10.03.17.
 */
public class Main {
    static void printElements(Collection collection){
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String... a){
        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();

        for (int i = 0; i < 10; i++) {
            arrayList.add("number_" + i);
        }

        for (int i = 0; i < 10; i++) {
            linkedList.add((int)(Math.random()*linkedList.size()),"num_" + i);
        }

        printElements(arrayList);

        System.out.println();

        printElements(linkedList);

        ListIterator<String> listIterator = linkedList.listIterator();
        ListIterator<String> listIterator1 = arrayList.listIterator();

        while (listIterator.hasNext()){
            listIterator.next();
            listIterator.add(listIterator1.next());
        }

        System.out.println();

        printElements(linkedList);

        while (listIterator.hasPrevious()){
            listIterator.previous();
            listIterator.add(listIterator1.previous());
        }

        System.out.println();

        printElements(linkedList);
    }
}
