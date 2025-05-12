package br.com.marcelocordolla.todolist.task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
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


    @Getter
    private LocalDateTime startAt;
    @Getter
    private LocalDateTime endAt;


    private String priority;

    @Setter
    private UUID userId;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public void setTitle(String title) throws Exception {
        if (title.length() > 50) {
            throw new Exception("o campo title deve ter no maximo 50 caracteres");
        }
        this.title = title;
    }


}
