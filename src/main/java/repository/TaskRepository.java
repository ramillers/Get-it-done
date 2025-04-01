package repository;

import dev.ramillers.Get.it.done.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//o jpa precisa saber a classe e o tipo do id doq estamos tratando
public interface TaskRepository extends JpaRepository<Task, Integer>{

}
