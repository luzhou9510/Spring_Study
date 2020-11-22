package luzhou.unittest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/Test")
    public String sayTest() {
        return "Enter this method";
    }
}
