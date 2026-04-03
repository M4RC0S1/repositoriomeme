package com.example.demo.RepositoryLivro;

import com.example.demo.ModelLivro.ModelLivro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryLivro extends JpaRepository <ModelLivro, Long> {
}
