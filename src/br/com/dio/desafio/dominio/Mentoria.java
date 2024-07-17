package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    //Atributos

    private LocalDate data;
    private int duracao;

    //Metodos

    @Override
    public double calcularXp() {
        return (XP_PADRAO * duracao);
    }

    //Getters e Setters

    public LocalDate getData() {
        return data;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    //toString

    @Override
    public String toString() {
        return "\nMentoria: \n    > Data = " + data 
            + "\n    > Titulo = " + this.getTitulo() 
            + "\n    > Descricao = " + this.getDescricao() 
            + "\n    > Duracao = " + duracao + " horas";
    }

    
}
