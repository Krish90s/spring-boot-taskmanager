package com.krishnan.taskmanager.controllers;

import com.krishnan.taskmanager.dto.CreateNoteDTO;
import com.krishnan.taskmanager.dto.CreateResponseNoteDTO;
import com.krishnan.taskmanager.entities.NoteEntity;
import com.krishnan.taskmanager.service.NoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks/{taskId}/notes")
public class NotesController {

    public NoteService noteService;

    public NotesController(NoteService noteService){
        this.noteService = noteService;
    }

    @GetMapping
    public ResponseEntity<List<NoteEntity>> getNotes(@PathVariable("taskId") Integer taskId) {
        var notes = noteService.getNotesForTask(taskId);
        return ResponseEntity.ok(notes);
    }

    @PostMapping
    public ResponseEntity<CreateResponseNoteDTO> addNote(
            @PathVariable("taskId") Integer taskId,
            @RequestBody CreateNoteDTO body) {
        var note = noteService.addNoteForTask(taskId, body.getTitle(), body.getBody());

        return ResponseEntity.ok(new CreateResponseNoteDTO(taskId, note));
    }
}
