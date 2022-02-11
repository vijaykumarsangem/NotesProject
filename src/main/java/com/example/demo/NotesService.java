package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotesService {
	@Autowired
	NotesRepository notesrepo;

	public List<Note> getAllNotes() {
		return (List<Note>) notesrepo.findAll();
	}

	public void saveNote(Note notes) {
		notesrepo.save(notes);
	}

	public void delete(int id) {
		notesrepo.deleteById(id);
	}
}
