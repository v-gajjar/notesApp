package com.app.NotesService.controller;

import com.app.NotesService.model.Note;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {

    @GetMapping
    public String getHome(){
        return "Home";
    }

    @GetMapping("/note")
    public Note getNote(){

        Note note = new Note();

        note.setId(Integer.toUnsignedLong(1));
        note.setTitle("A quick test note");
        note.setContent("Hello, World!");

        return note;
    }


}
