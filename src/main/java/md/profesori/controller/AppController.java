package md.profesori.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * This is controller for page routes
 */
@Controller
public class AppController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/{link}")
    @ResponseBody
    public String compartment(@PathVariable("link") String link) {
        return "Ati accesat linkul " + link;
    }

}
