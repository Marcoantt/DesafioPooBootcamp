package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    //Atributos

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    //Metodos

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(Conteudo conteudo) {
        if (this.conteudosInscritos.contains(conteudo)) {
            System.out.println("\n'"+ nome +"' concluiu o conteudo '" + conteudo.getTitulo()+"'");
            this.conteudosInscritos.remove(conteudo);
            this.conteudosConcluidos.add(conteudo);
        } else {
            System.out.println("\n'"+ nome +"' tentou progredir no conteudo que nao esta inscrito: '" + conteudo.getTitulo() +"'");
        }
    }

    public double calcularTotalXp() {
        double soma = 0;
        if (!this.conteudosConcluidos.isEmpty()) {
            for (Conteudo conteudo : conteudosConcluidos) {
                soma += conteudo.calcularXp();
            }
        }
        System.out.println("\nXP Total:");
        return soma;
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public String toString() {
        return "Dev Inscrito:\n > Nome = " + nome 
        + "\n\n > Conteudos Inscritos = " + conteudosInscritos 
        + "\n\n > Conteudos Concluidos = " + conteudosConcluidos;
    }

    
}
