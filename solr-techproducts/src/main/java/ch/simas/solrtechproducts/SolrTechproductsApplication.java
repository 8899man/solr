package ch.simas.solrtechproducts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SolrTechproductsApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SolrTechproductsApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        List<Product> products = repository.findByNameContains("Enterprise");

        products.forEach(System.out::println);
    }
}
