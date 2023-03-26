package com.krishnan.taskmanager.dto;

import com.krishnan.taskmanager.entities.NoteEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateResponseNoteDTO {
    private Integer taskId;
    private NoteEntity note;
}
