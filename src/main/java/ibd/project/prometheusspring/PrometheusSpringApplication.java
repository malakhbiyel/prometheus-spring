package ibd.project.prometheusspring;

import ibd.project.prometheusspring.entities.Product;
import ibd.project.prometheusspring.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrometheusSpringApplication {

        public static void main(String[] args) {
            SpringApplication.run(PrometheusSpringApplication.class, args);
        }

        @Bean
        CommandLineRunner commandLineRunner(ProductRepository productRepository){
            return args -> {
                productRepository.save(Product.builder().name("Computer").price(23000).build());
                productRepository.save(Product.builder().name("Smart Phone").price(1200).build());
                productRepository.save(Product.builder().name("Printer").price(300).build());
                productRepository.findAll().forEach(System.out::println);
            };
        }
}


