package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    //Atributos

    private int cargaHoraria;

    //Metodos

    @Override
    public double calcularXp() {
        return (XP_PADRAO * cargaHoraria);
    }

    //Getters e Setters

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso: \n    > Titulo = " + this.getTitulo() 
            + "\n    > Descricao = " + this.getDescricao() 
            + "\n    > Carga Horaria = " + cargaHoraria + " horas";
    }

    
}
