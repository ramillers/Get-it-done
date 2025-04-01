package dev.ramillers.Get.it.done.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor

@Entity
public class Task {
    @Id //p dizer q será gerado automático, n precisarei passar o "id" manual
    @GeneratedValue(strategy = GenerationType.IDENTITY) //vai gerar task 1, 2, 3
    private int id;
    private String name;
    private String descricao;
    private boolean status;
    private LocalDateTime dataCriacao;
}
