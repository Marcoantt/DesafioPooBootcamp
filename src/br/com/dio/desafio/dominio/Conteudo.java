package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    //Atributos

    //Sempre que um curso ou mentoria e completada, o bootcamp oferece uma 
    //quantia base de experiencia com base na carga horaria;
    protected final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    //Metodos

    public abstract double calcularXp();

    //Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
