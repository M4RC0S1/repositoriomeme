package com.example.demo.ServiceProduto;

import com.example.demo.ModelProduto.ModelProduto;
import com.example.demo.RepositoryProduto.RepositoryProduto;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduto {
    private final RepositoryProduto repositoryProduto;

    public ServiceProduto (RepositoryProduto repositoryProduto){
        this.repositoryProduto = repositoryProduto;
    }

    public ModelProduto salvar(ModelProduto produto){
        return repositoryProduto.save(produto);
    }

    public List<ModelProduto> listarTodos(){
        return repositoryProduto.findAll();
    }

    public ModelProduto buscarProduto(Long id){
        return repositoryProduto.findById(id).orElseThrow(() -> new RuntimeException("Livro com ID " + id + " não encontrado"));
    }

    public void deletar(Long id){
        repositoryProduto.deleteById(id);
    }
}
