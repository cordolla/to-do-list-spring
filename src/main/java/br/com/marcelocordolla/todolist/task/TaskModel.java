package br.com.marcelocordolla.todolist.task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "tb_task")
public class TaskModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(length = 50)
    private String title;

    @Column(length = 200)
    private String description;


    private LocalDateTime startAt;
    private LocalDateTime endAt;


    private String priority;

    private UUID userId;

    @CreationTimestamp
    private LocalDateTime createdAt;


}
