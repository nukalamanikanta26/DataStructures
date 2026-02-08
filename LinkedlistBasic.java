package com.manikanta.Collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedlistBasic {
    public static void main(String[] args) {

        //Creation of list

        LinkedList<Integer> ll = new LinkedList<>();

        //Adding Elements into List

        ll.add(34);
        ll.add(65);
        ll.add(22);
        ll.add(56);
        ll.add(87);

        System.out.println(ll);

        //remove elements or clear
        ll.remove(4);
        System.out.println(ll);

        //Retrival of Elements

        System.out.println(ll.get(3));

        //verifivation of elemnts in list

        System.out.println(ll.contains(34));

        //setElements

        ll.set(0,64);
        System.out.println(ll.getFirst());

        ll.addFirst(55);
        System.out.println(ll);

        Collections.sort(ll);
        System.out.println(ll);
        //Add Duplicates or not
        ll.add(22);
        System.out.println(ll);
        System.out.println(ll.size());
        ll.add(null);

        ll.set(5,66);
        System.out.println(ll);

        for(int i=0; i<ll.size();i++){
            System.out.print(ll.get(i)+ " ");
        }
    }
}