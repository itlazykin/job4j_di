package ru.job4j.di;

import ru.job4j.di.model.StartUI;
import ru.job4j.di.model.Store;

public class NoContextDI {
    public static void main(String[] args) {
        Store store = new Store();
        StartUI iu = new StartUI(store);
        iu.add("Den");
        iu.add("Lazykin");
        iu.print();
    }
}
