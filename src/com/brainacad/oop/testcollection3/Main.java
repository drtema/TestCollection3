package com.brainacad.oop.testcollection3;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Dr.tema on 10.03.17.
 */
public class Main {
    public static void main(String... a){
        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();

        for (int i = 0; i < 10; i++) {
            arrayList.add("number_" + i);
        }

        for (int i = 0; i < 10; i++) {
            linkedList.add((int)(Math.random()*linkedList.size()),"number_" + i);
        }

        Iterator<String> linkedListIterator= linkedList.iterator();
        Iterator<String> arrayListIterator = arrayList.iterator();

        while (arrayListIterator.hasNext()){
            System.out.println(arrayListIterator.next());
        }

        System.out.println();

        while (linkedListIterator.hasNext()){
            System.out.println(linkedListIterator.next());
        }

        
    }
}
