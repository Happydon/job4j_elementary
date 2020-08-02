package ru.job4j.poly;

public interface Transport {
    void ride();

    void passenger(int amount);

    int refill(int quantity);
}
