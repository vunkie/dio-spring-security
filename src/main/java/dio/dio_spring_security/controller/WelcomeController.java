package dio.dio_spring_security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to My DIO Spring Boot Web API Example";
    }
    @GetMapping("/users")
    public String users() {
        return "Authorized user, Welcome!";
    }
    @GetMapping("/managers")
    public String managers() {
        return "Authorized manager, Welcome!";
    }
}