package com.rest.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }


        for (ListIterator<Integer> l = list.listIterator(); l.hasNext();){
            l.remove();
        }
    }
}
