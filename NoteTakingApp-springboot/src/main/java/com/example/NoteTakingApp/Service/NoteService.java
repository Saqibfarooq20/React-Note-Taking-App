package com.example.NoteTakingApp.Service;

import com.example.NoteTakingApp.Model.Note;
import com.example.NoteTakingApp.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository repository;

    public List<Note> getAllNote ()
    {
       return repository.findAll();
    }
    public Note get(long id)
    {
        return repository.findById(id).orElse(null);
    }
    public Note postNote (Note note)
    {
        return repository.save(note);
    }
    public Note putNote (Note note,long id)
    {
        Note existNote = repository.findById(id).orElse(null);
        if (existNote != null)
        {
          existNote.setTextArea(note.getTextArea());
        }

        return repository.save(existNote);
    }
    public void deleteNote (long id)
    {
         repository.deleteById(id);
    }

}
