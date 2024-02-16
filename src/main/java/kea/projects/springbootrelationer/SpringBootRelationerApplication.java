package kea.projects.springbootrelationer;

import kea.projects.springbootrelationer.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRelationerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRelationerApplication.class, args);
    }

}
