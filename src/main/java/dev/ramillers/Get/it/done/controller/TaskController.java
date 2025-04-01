package dev.ramillers.Get.it.done.controller;

import dev.ramillers.Get.it.done.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.TaskService;

import java.util.List;

@Controller
@RestController //o spring sabe q tudo isso é um controller
@RequestMapping("/task") //irei mapear as rotas (dizer quais são)
public class TaskController {
    //injeção de depêndencias
        private final TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    //requisições
    @GetMapping//listar as tasks cadastradas
    public List <Task> getAll() {
        return taskService.getAll();
    }

    @PostMapping
    //iremos passar os atributos no request  body da Taks (nome, data de criação, etc)
    public Task create(@RequestBody Task task) {
        return taskService.save(task);
    }
}
