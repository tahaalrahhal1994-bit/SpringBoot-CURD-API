package com.taha.backend.Configuration;

import com.taha.backend.entity.Product;
import com.taha.backend.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfig {


@Bean
        CommandLineRunner commandLineRunner(

                ProductRepository repository
        ){
            return args -> {
                Product one = new Product("Taha", 10, 10);
                Product two = new Product("Motasem", 4,2);

                repository.saveAll(
                        List.of(one, two)
                );
            };
        }
}
