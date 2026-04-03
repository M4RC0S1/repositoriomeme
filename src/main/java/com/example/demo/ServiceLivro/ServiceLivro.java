package com.example.demo.ServiceLivro;

import com.example.demo.ModelLivro.ModelLivro;
import com.example.demo.RepositoryLivro.RepositoryLivro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLivro {
    private final RepositoryLivro repositoryLivro;

    public ServiceLivro(RepositoryLivro repositoryLivro){
        this.repositoryLivro = repositoryLivro;
    }

    public ModelLivro salvar(ModelLivro livro){
        return repositoryLivro.save(livro);
    }

    public List<ModelLivro> listarTodos() {
        return repositoryLivro.findAll();
    }

    public ModelLivro buscarLivro(Long id) {
        return repositoryLivro.findById(id).orElseThrow(() -> new RuntimeException("Livro com ID " + id + " não encontrado"));
    }

    public void deletar(Long id) {
        repositoryLivro.deleteById(id);
    }
}