package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }
    public Item[] findByName(String key) {
        Item[] itemsWithThisName = new Item[items.length];
        for (int index = 0; index < size; index++) {
            if (items[index].equals(key)) {
                itemsWithThisName[size] = items[index];
                size++;
            }
        }
        return Arrays.copyOf(itemsWithThisName, size);
    }
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }
    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            items[index] = item;
            items[index].setId(id);
            rsl = true;
        }
        return rsl;
    }
    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index);
            items[size - 1] = null;
            size--;
            return true;
        }
        return false;
    }
}