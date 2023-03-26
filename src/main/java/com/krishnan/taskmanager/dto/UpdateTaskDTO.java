package com.krishnan.taskmanager.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateTaskDTO {
    String title;
    String description;
    String deadline;
    Boolean completed;
}
