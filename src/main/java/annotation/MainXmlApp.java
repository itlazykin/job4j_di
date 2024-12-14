package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
Устаревший способ конфигурации контекста.
Для реализации необходимо создать сеттеры на все поля классов(в этом случае на Dog, Cat, Bird и Man).
В каталоге src/main/resources создать файл с XML-конфигурацией - app-context-xml.xml
 */
public class MainXmlApp {
    public static void main(String[] args) {
        ApplicationContext ct = new ClassPathXmlApplicationContext("classpath:app-context-xml.xml");
        Man man = ct.getBean(Man.class);
        man.print();
    }
}