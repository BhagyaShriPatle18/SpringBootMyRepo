package com.csi.controller;

        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ApplicationController {

    @GetMapping("/")
    public String sayHello()
    {
        return "Welcome to Fintech CSI Pune";

    }

    @GetMapping ("/services")
    public String sayServices(){
        return "Software Engineering";
    }
}
