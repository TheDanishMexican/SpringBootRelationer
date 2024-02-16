package kea.projects.springbootrelationer;

import kea.projects.springbootrelationer.models.Order;
import kea.projects.springbootrelationer.models.OrderLine;
import kea.projects.springbootrelationer.models.Product;
import kea.projects.springbootrelationer.repositories.OrderLineRepository;
import kea.projects.springbootrelationer.repositories.OrderRepository;
import kea.projects.springbootrelationer.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private ProductRepository productRepository;
    private OrderLineRepository orderLineRepository;
    private OrderRepository orderRepository;

    public DataInitializer(ProductRepository productRepository, OrderLineRepository orderLineRepository,
                           OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderLineRepository = orderLineRepository;
        this.orderRepository = orderRepository;
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
        OrderLine line5 = new OrderLine(meat, 56);
        OrderLine line6 = new OrderLine(meat, 56);
        OrderLine line7 = new OrderLine(meat, 56);

        Order order1 = new Order(LocalDate.now(), true, List.of(line1, line2, line3));

        orderRepository.save(order1);
    }
}
