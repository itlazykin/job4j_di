package lifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lifecycle.model.Product;

@Configuration
public class Config {

    @Bean(name = "myProduct",
            initMethod = "initMethod",
            destroyMethod = "destroyMethod"
    )
    public Product getProduct() {
        return new Product("Good Product", 2.5);
    }
}