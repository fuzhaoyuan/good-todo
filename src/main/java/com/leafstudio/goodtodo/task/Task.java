package com.leafstudio.goodtodo.task;

import com.leafstudio.goodtodo.Priority;
import com.leafstudio.goodtodo.Step;
import com.leafstudio.goodtodo.Tag;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity @Table
public class Task {
    @Id @GeneratedValue
    private int taskId;
    @Getter @Setter
    private String title;
    @Getter @Setter
    private boolean complete;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private Date date;
    @Getter
    private Priority priority;
    @Transient
    private List<Tag> tagList;
    @Transient
    private List<Step> stepList;
//    private int progress;
//    private int totalPoints;


}
