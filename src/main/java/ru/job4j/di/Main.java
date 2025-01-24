package ru.job4j.di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(StartUI.class);
        StartUI ui = context.get(StartUI.class);
        ui.add("Den Lazykin");
        ui.add("Nasty Lazykina");
        ui.print();
        ui.question();
    }
}
