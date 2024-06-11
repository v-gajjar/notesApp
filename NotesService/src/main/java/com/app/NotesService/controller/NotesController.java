package com.app.NotesService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {

    @GetMapping
    public String getHome(){
        return "Home";
    }
}
