package ru.job4j.di;

public class StartUI {

    private final Store store;

    private final ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        store.getAll().forEach(System.out::println);
    }

    public String question() {
        return consoleInput.askStr("Введите Ваш вопрос:" + System.lineSeparator());
    }
}
