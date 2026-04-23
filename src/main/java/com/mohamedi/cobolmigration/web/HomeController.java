package com.mohamedi.cobolmigration.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// CM-78: Landing page / menu controller
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // TODO CM-78: return a Thymeleaf template name (e.g., "index")
        return "index";
    }
}
