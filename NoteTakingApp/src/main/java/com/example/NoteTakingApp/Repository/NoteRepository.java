package com.example.NoteTakingApp.Repository;

import com.example.NoteTakingApp.Model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}