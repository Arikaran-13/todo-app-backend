package com.example.todo.serviceImpl;

import com.example.todo.dto.TaskDto;
import com.example.todo.model.TaskEntity;
import com.example.todo.repository.TaskRepository;
import com.example.todo.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private final ModelMapper modelMapper;
   private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository,ModelMapper modelMapper) {
        this.taskRepository = taskRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public TaskDto createTaskService(TaskDto taskDto) {
        var entity = modelMapper.map(taskDto, TaskEntity.class);
        var task=  this.taskRepository.save(entity);
        return modelMapper.map(task,TaskDto.class);
    }
}
