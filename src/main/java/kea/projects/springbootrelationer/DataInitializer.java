package kea.projects.springbootrelationer;

import kea.projects.springbootrelationer.models.OrderLine;
import kea.projects.springbootrelationer.models.Product;
import kea.projects.springbootrelationer.repositories.OrderLineRepository;
import kea.projects.springbootrelationer.repositories.ProductRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private ProductRepository productRepository;
    private OrderLineRepository orderLineRepository;

    public DataInitializer(ProductRepository productRepository, OrderLineRepository orderLineRepository) {
        this.productRepository = productRepository;
        this.orderLineRepository = orderLineRepository;
    }

    public void run(String...args) {
        Product toast = new Product("brød", "meget tørt", 99.99, "412413423");
        Product tomat = new Product("tomat", "meget juicy", 12.43, "9034850394");
        Product meat = new Product("meat", "meget kød agtigt", 33.21, "123464521");

        productRepository.save(meat);
        productRepository.save(tomat);
        productRepository.save(toast);

        OrderLine line1 = new OrderLine(toast, 99);
        OrderLine line2 = new OrderLine(tomat, 25);
        OrderLine line3 = new OrderLine(meat, 56);
        OrderLine line4 = new OrderLine(meat, 56);

        orderLineRepository.save(line1);
        orderLineRepository.save(line2);
        orderLineRepository.save(line3);
        orderLineRepository.save(line4);
    }
}
