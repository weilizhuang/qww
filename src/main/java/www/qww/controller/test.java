package www.qww.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class test {

    @RequestMapping("/test")
    @ResponseBody
    public String updateAlgorithmInfo() {
        return "test";
    }
}
