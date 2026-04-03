package com.example.demo.ControllerLivro;

import com.example.demo.ModelLivro.ModelLivro;
import com.example.demo.ServiceLivro.ServiceLivro;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class ControllerLivro {
    private final ServiceLivro serviceLivro;

    public ControllerLivro(ServiceLivro serviceLivro){
        this.serviceLivro = serviceLivro;
    }

    @PostMapping
    public ModelLivro criar(@RequestBody ModelLivro livro) {
        return ServiceLivro.salvar(livro);
    }

    @GetMapping
    public List<ModelLivro> listar() {
        return ServiceLivro.listarTodos();
    }

    @GetMapping("/{id}")
    public ModelLivro buscarPorId(@PathVariable Long id) {
        return serviceLivro.buscarLivro(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        ServiceLivro.deletar(id);
    }
}
