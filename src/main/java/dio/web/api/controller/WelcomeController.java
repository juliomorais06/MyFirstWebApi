package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//cada controller pode estar relacionado a um serviço ou a um contexto da aplicação
//um controller é similar ao proxy, ele dá um direcionamento para uma funcionalicade já existente na aplicação
@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Welcome to My Spring Boot Web API";
    }
}
