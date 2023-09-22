import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllor {

    @GetMapping("/")
    public String index() {
        return  "Hello this is a simple backend for a web application";
    }

}