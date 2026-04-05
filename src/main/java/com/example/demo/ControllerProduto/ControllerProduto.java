package com.example.demo.ControllerProduto;

import com.example.demo.ModelProduto.ModelProduto;
import com.example.demo.ServiceProduto.ServiceProduto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ControllerProduto {
    private final ServiceProduto serviceProduto;

    public ControllerProduto(ServiceProduto serviceProduto){
        this.serviceProduto = serviceProduto;
    }

    @GetMapping
    public List<ModelProduto> listar() {
        return ServiceProduto.listarTodos();
    }

    @GetMapping("/{id}")
    public ModelProduto buscarPorId(@PathVariable Long id) {
        return serviceProduto.buscarProduto(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        ServiceProduto.deletar(id);
    }
}
