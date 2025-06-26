package com.example.NoteTakingApp.Controller;

import com.example.NoteTakingApp.Model.Note;
import com.example.NoteTakingApp.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class NoteController {

   @Autowired
    private NoteService service;

   @GetMapping ("/getAll")
    public List<Note> getAll ()
   {
       return service.getAllNote();
   }

   @GetMapping("/get/{id}")
    public Note get (@PathVariable Long id)
   {
       return service.get(id);
   }

   @PostMapping("/create")
    public Note CreatePost (@RequestBody Note note)
   {
       return service.postNote(note);
   }
   @PutMapping("/update/{id}")
   public Note update (@RequestBody Note note, @PathVariable Long id)
   {
       return service.putNote(note,id);
   }
   @DeleteMapping("/delete/{id}")
    public void  deleteNote (@PathVariable Long id)
   {
       service.deleteNote(id);
   }
}
