package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
    }

    @Override
    public void passenger(int amount) {
    }

    @Override
    public int refill(int quantity) {
        return quantity * 41;
    }
}
