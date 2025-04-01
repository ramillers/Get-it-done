package dev.ramillers.Get.it.done;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.TaskService;
import repository.TaskRepository;

@Configuration
public class Config {

    @Bean
    public TaskService taskService(TaskRepository taskRepository) {
        return new TaskService(taskRepository);
    }
}
