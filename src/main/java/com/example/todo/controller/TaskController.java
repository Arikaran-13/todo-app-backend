package com.example.todo.controller;

import com.example.todo.dto.TaskDto;
import com.example.todo.service.TaskService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/todo")
@CrossOrigin("*")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/create")
    public TaskDto createTask(@RequestBody TaskDto taskDto){
        return this.taskService.createTaskService(taskDto);
    }

    @GetMapping("/all")
    public List<TaskDto> getAllTodoTasks(){
        return this.taskService.getAllTask();
    }
}
