package br.com.marcelocordolla.todolist.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskRepository taskRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody TaskModel taskModel){
        var task = this.taskRepository.findByTitle(taskModel.getTitle());

        if (task != null){
            return ResponseEntity.status(400).body("Task ja existe");
        }

        var taskCriated = this.taskRepository.save(taskModel);
        return ResponseEntity.status(200).body("Task cadastrado com sucesso");


    }
}
