package com.example.demo.RepositoryProduto;

import com.example.demo.ModelProduto.ModelProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProduto extends JpaRepository<ModelProduto, Long>{
}
