package annotation;

import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "annotation")
@PropertySource("classpath:application.properties")
public class Config {

    @Bean
    @Primary
    @Order(11)
    public Dog getAlfaDog() {
        return new Dog("AlfaDog");
    }

    @Bean(name = "SecondDog")
    @Order(3)
    public Dog getDog() {
        return new Dog("SecondDog");
    }

    @Bean
    @Order(5)
    public Dog someDog() {
        return new Dog("Dog");
    }
}