package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {
	@Autowired
	NotesService notesserv;

	@PostMapping("/notespost")
	private String saveNotes(@RequestBody Note notes) {
		notesserv.saveNote(notes);
		return "saved";
	}

	@GetMapping("/notesget")
	private List<Note> getNotess() {
		return notesserv.getAllNotes();
	}

	@DeleteMapping("/notesdelete/{id}")
	private void deleteNotes(@PathVariable("id") int id) {
		notesserv.delete(id);
	}
}
