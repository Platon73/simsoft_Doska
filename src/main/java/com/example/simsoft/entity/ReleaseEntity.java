package com.example.simsoft.entity;

import javax.persistence.*;

//релиз
@Entity
public class ReleaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startTime; //дата начала
    private String endTime; //дата окончания

    @OneToOne
    @JoinColumn(name = "todo_id")
    private TodoEntity todo;

    public ReleaseEntity() {
    }

    public TodoEntity getTodo() {
        return todo;
    }

    public void setTodo(TodoEntity todo) {
        this.todo = todo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
