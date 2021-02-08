package com.gabensoft.helloworld2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class BasicController {

    @GetMapping("/test")
    public String hello() {
        log.info("Entrando al controlador");
        return "index";
    }
}
