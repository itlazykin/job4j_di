package ru.job4j.di;

public class NoContextDI {
    public static void main(String[] args) {
        Store store = new Store();
        ConsoleInput consoleInput = new ConsoleInput();
        StartUI iu = new StartUI(store, consoleInput);
        iu.add("Den");
        iu.add("Lazykin");
        iu.print();
        iu.question();
    }
}
