package cz.upce.fei.nnpiacv.Controller;

import cz.upce.fei.nnpiacv.Service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/")
    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
