package com.ltf.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class NamesContainer implements Container {
    private List<String> names = new ArrayList<String>();

    public boolean addName(String name) {
       return names.add(name);
    }


    @Override
    public Iterator getIterator() {
        return new NamesIterator();
    }

    private class NamesIterator implements Iterator{
        private int index;
        @Override
        public boolean hasNext() {
            return index < names.size();
        }

        @Override
        public Object next() {
            String name = null;
            if (hasNext()) {
                name = names.get(index);
                index++;

            }
            return name;
        }
    }
}
