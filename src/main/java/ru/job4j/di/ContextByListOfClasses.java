package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextByListOfClasses {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Store.class, StartUI.class);
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Den");
        ui.add("Lazykin");
        ui.print();
    }
}
