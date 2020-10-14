package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"home","/","homepage",""})
public class HomePageController {


    @GetMapping
    public String handleHomepage() {
        return "homepage";
    }
}
