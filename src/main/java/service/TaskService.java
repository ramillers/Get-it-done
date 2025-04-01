package service;

import dev.ramillers.Get.it.done.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    //LISTAR
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    //CRIAR
    public Task save(Task task) {
        return taskRepository.save(task);
    }
    //DELETAR (pelo id, e não retorna nada)
    public void delete(int id) {
        taskRepository.deleteById(id);
    }
    //ATUALIZAR


}
