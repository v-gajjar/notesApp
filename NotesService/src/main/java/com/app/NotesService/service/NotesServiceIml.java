package com.app.NotesService.service;


import com.app.NotesService.model.Note;
import com.app.NotesService.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class NotesServiceIml implements NotesService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Note getNote() {
        return (Note) noteRepository.findAll().getFirst();
    }
}
