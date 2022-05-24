package org.uujava.test;

public class CounterImpl implements Counter {

    private int counter;

    @Override
    public long next() {
        return counter++;
    }
}
