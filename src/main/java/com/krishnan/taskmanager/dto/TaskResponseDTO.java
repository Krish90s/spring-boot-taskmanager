package com.krishnan.taskmanager.dto;

import com.krishnan.taskmanager.entities.NoteEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TaskResponseDTO {
    private int id;
    private String title;
    private String description;
    private Date deadline;
    private boolean completed;
    private List<NoteEntity> notes;


}
