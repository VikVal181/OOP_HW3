package org.example;

import java.util.Iterator;
import java.util.List;

public class ListOfCatIterator implements Iterator<Cat> {
    private List<Cat> catListIteartor;
    private int counter;
    public ListOfCatIterator(List<Cat> catList){
        catListIteartor = catList;
        counter = 0;

    }
    @Override
    public boolean hasNext() {
        if (counter < catListIteartor.size() -1) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Cat next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return catListIteartor.get(counter);
    }
}
