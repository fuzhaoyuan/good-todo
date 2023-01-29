package com.leafstudio.goodtodo;

import com.leafstudio.goodtodo.task.Task;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//@Entity @Table
public class Step {
    @Id @GeneratedValue
    private int stepId;
    @ManyToOne @JoinColumn(referencedColumnName = "taskId")
    private Task task;
    @Getter @Setter
    private String title;
}
