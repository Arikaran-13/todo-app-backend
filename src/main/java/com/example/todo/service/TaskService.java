package com.example.todo.service;

import com.example.todo.dto.TaskDto;

import java.util.List;

public interface TaskService {

    public TaskDto createTaskService(TaskDto taskDto);
    List<TaskDto> getAllTask();
}
