package com.app.NotesService.controller;

import com.app.NotesService.model.Note;
import com.app.NotesService.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {

    @Autowired
    private NotesService notesService;

    @GetMapping
    public String getHome(){
        return "Home";
    }

    @GetMapping("/note")
    public Note getNote() {
        return notesService.getNote();
    }

}
