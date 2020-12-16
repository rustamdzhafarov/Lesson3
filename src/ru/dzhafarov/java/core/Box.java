package ru.dzhafarov.java.core;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> box = new ArrayList<>();

    public Box() {

    }

    public float getWeight() {
        float weight = 0.0f;
        int i = 0;
        while (i < box.size()) {
            i++;
        }
        for (T o : box) {
            weight += o.getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox) {
        if (getWeight() == anotherBox.getWeight()) return true;
        else return false;
    }

    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }
}
