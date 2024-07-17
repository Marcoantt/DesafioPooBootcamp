import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        //Criando o bootcamp
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp de Java");
        bootcampJava.setDescricao("Bootcamp para ensinar sobre a linguagem de programacao Java");

        //Criando os cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de POO");
        curso1.setDescricao("Curso para ensinar sobre o paradigma da Programacao Orientada a Objetos");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Collections Java");
        curso2.setDescricao("Curso para ensinar sobre a funcionalidade das Collections do Java");
        curso2.setCargaHoraria(8);

        //Criando as mentorias
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now().plusDays(15));
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria para explicar e tirar duvidas sobre a programacao na linguagem Java");
        mentoria1.setDuracao(2);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setData(LocalDate.now().plusDays(5));
        mentoria2.setTitulo("Mentoria de Gerenciamento de Tempo");
        mentoria2.setDescricao("Mentoria para auxiliar no gerenciamento de tempo");
        mentoria2.setDuracao(1);

        //Criando o Dev1
        Dev dev1 = new Dev();
        dev1.setNome("Andrew");

        //Atribuindo os cursos e mentoria ao Bootcamp
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria1);
        bootcampJava.getConteudos().add(mentoria2);

        //Atribuindo o bootcamp ao Dev e vice-versa
        bootcampJava.getDevsInscritos().add(dev1);
        dev1.inscreverBootcamp(bootcampJava);

        //-----------------------------------------//

        //Simulando a progressao do Dev1 no Bootcamp

        System.out.println("\nVocê se inscreveu no Bootcamp '" + bootcampJava.getNome() + "'\n"+bootcampJava);

        System.out.println(dev1.calcularTotalXp());
        //Neste ponto, e esperado que o resultado seja 0.0;
        
        dev1.progredir(curso1);
        System.out.println(dev1.calcularTotalXp());
        //Neste ponto, e esperado que o resultado seja 40.0;
        
        dev1.progredir(mentoria2);
        System.out.println(dev1.calcularTotalXp());
        //Neste ponto, e esperado que o resultado seja 50.0;

        dev1.progredir(curso2);
        System.out.println(dev1.calcularTotalXp());
        //Neste ponto, e esperado que o resultado seja 130.0;

        dev1.progredir(mentoria1);
        System.out.println(dev1.calcularTotalXp());
        //Neste ponto, e esperado que o resultado seja 150.0;

        System.out.println(dev1);

        dev1.progredir(mentoria1);
        //Neste ponto, e esperado que o resultado seja uma String dizendo que o usuario nao esta inscrito neste conteudo;

        //-----------------------------------------//

        //Criando o Dev2
        Dev dev2 = new Dev();
        dev2.setNome("Jorge");
        dev2.inscreverBootcamp(bootcampJava);
        
        //Simulando a progressao do Dev2 no Bootcamp

        dev2.progredir(mentoria2);
        System.out.println(dev2.calcularTotalXp());
        //Neste ponto, e esperado que o resultado seja 10.0;

        dev2.progredir(mentoria1);
        System.out.println(dev2.calcularTotalXp());
        //Neste ponto, e esperado que o resultado seja 30.0;

        dev2.progredir(curso2);
        System.out.println(dev2.calcularTotalXp());
        //Neste ponto, e esperado que o resultado seja 110.0;

        System.out.println(dev2);
    }
}
