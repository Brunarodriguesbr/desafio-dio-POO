import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descricao curso java");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

     /*

    }

      */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruna = new Dev();
        devBruna.setNome("Bruna");
        devBruna.inscreverBootcamp(bootcamp);
        System.out.println(" Conteúdos Inscritos Bruna" + devBruna.getConteudosInscritos());

        devBruna.progredir();
        System.out.println("-");
        System.out.println(" Conteúdos Inscritos Bruna" + devBruna.getConteudosInscritos());
        System.out.println(" Conteúdos Concluidos Bruna" + devBruna.getConteudosConcluidos());
        System.out.println("XP:" + devBruna.calcularTotalXp());

        System.out.println("---------");


        Dev devCarol= new Dev();
        devCarol.setNome("Carol");
        devCarol.inscreverBootcamp(bootcamp);
        System.out.println(" Conteúdos Inscritos Carol" + devCarol.getConteudosInscritos());
        devCarol.progredir();
        devCarol.progredir();

        System.out.println("-");
        System.out.println(" Conteúdos Inscritos Carol" + devCarol.getConteudosInscritos());

        System.out.println(" Conteúdos Concluidos Bruna" + devBruna.getConteudosConcluidos());
        System.out.println("XP:" + devCarol.calcularTotalXp());








    }
    }

