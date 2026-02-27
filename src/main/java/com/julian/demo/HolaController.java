

package com.julian.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/")
    public String mensaje() {
        return "Bienvenido Julian 🚀 Este es mi primer proyecto Spring Boot";
    }
}