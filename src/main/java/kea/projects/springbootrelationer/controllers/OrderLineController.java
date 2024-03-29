package kea.projects.springbootrelationer.controllers;

import kea.projects.springbootrelationer.models.OrderLine;
import kea.projects.springbootrelationer.repositories.OrderLineRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderlines")
public class OrderLineController {
    private OrderLineRepository orderLineRepository;

    public OrderLineController(OrderLineRepository orderLineRepository) {
        this.orderLineRepository = orderLineRepository;
    }

    @GetMapping
    public List<OrderLine> getAllOrderLines() {
        return orderLineRepository.findAll();
    }

    @PostMapping
    public OrderLine createOrderLine(@RequestBody OrderLine orderLine) {
        return orderLineRepository.save(orderLine);
    }
}
