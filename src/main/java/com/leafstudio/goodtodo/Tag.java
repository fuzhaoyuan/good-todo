package com.leafstudio.goodtodo;

import com.leafstudio.goodtodo.task.Task;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

//@Entity @Table
public class Tag {
    @Id @GeneratedValue
    private int tagId;
    @ManyToOne @JoinColumn(referencedColumnName = "taskId")
    private Task task;
    @Getter @Setter
    private String title;
    @Getter @Setter
    private Color color;
}
