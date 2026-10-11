package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Optional Tutorial 1 stretch-task endpoint.
 */
@RestController
public class InfoController {

    @GetMapping("/info")
    public String info() {
        return "Products API — Spring Boot application created for Tutorial 1.";
    }
}
