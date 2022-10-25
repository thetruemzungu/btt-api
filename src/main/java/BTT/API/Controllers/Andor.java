package BTT.API.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Andor {
    @GetMapping("/Andor")
    public String getAndor() {
     return "Andor is intense!";
    }
}
