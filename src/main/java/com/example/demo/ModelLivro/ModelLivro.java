package com.example.demo.ModelLivro;

import jakarta.persistence.*;

@Entity(name = "Livro")
@Table(name = "tb_livro")
public class ModelLivro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo_livro")
    private String titulo;

    @Column(name = "nome_autor")
    private String autor;

    private Integer anoPublicacao;

    public ModelLivro(String titulo, Long id, String autor, Integer anoPublicacao) {
        this.titulo = titulo;
        this.id = id;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
