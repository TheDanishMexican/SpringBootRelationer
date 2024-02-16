package kea.projects.springbootrelationer;

import kea.projects.springbootrelationer.models.Product;
import kea.projects.springbootrelationer.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private ProductRepository productRepository;

    public DataInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void run(String...args) {
        Product toast = new Product("brød", "meget tørt", 99.99, "412413423");
        Product tomat = new Product("tomat", "meget juicy", 12.43, "9034850394");
        Product meat = new Product("meat", "meget kød agtigt", 33.21, "123464521");

        productRepository.save(meat);
        productRepository.save(tomat);
        productRepository.save(toast);
    }
}
