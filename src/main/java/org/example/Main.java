package org.example;

//Добавить Comparable и/или Comparator к приложению, написанному на семинаре


import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(List.of(new Cat("barsik"), new Cat("murzik"), new Cat("murka"), new Cat("barsik")));
        Iterator catsIterator = cats.iterator();
        while (catsIterator.hasNext()){
            Cat cat = (Cat) catsIterator.next();
            System.out.println(cat.getName());
        }

        System.out.println(cats.getCatList().get(0).compareTo(cats.getCatList().get(1)));
        System.out.println(cats.getCatList().get(0).compareTo(cats.getCatList().get(3)));
        System.out.println(cats.getCatList().get(1).compareTo(cats.getCatList().get(2)));
    }
}