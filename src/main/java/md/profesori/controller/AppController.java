package md.profesori.controller;

import md.profesori.entities.Professor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * This is controller for page routes
 */
@Controller
public class AppController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/{category}")
    public String categoryView(@PathVariable("category") String category) {
        Professor p = new Professor();

        return "categoryView";
    }
}
