package nl.peteranema.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping(value = "/")
    public String sayHello() {
        return "Hello world!";
    }

    @GetMapping(value = "/peter")
    public String sayPeter() {
        return "Hello Peter!";
    }

    @GetMapping(value = "/info")
    public String info() {
        return "This is my frist great Webservice endpoint!!!";
    }

}
