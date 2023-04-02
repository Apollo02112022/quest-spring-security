package com.challenge.shield.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
public class ShieldController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String champions() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String director() {
        return "Biarritz, Bordeaux, La Loupe, Lille, Lyon, Nantes, Orléans, Paris, Reims, Strasbourg, Toulouse";
    }

}