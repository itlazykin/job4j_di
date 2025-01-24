package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        Store store = context.getBean(Store.class);
        store.add("Den Lazykin");
        Store another = context.getBean(Store.class);
        another.getAll().forEach(System.out::println);
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Den Lazykin");
        ui.add("Nasty Lazykina");
        ui.question();
        StartUI anotherUi = context.getBean(StartUI.class);
        anotherUi.add("anotherUi");
        anotherUi.print();
        anotherUi.question();
    }
}
