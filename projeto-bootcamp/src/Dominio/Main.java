package Dominio;  // Define o pacote onde a classe Main está localizada

import java.time.LocalDate;  // Importa a classe LocalDate do pacote java.time

public class Main {

    public static void main(String[] args) {
        // Cria um novo objeto Curso
        Curso curso1 = new Curso();
        // Define o título, descrição e carga horária do curso1
        curso1.setTitulo("Java Programming");
        curso1.setDescricao("Learn Java programming basics");
        curso1.setCargaHoraria(40);

        // Cria um novo objeto Mentoria
        Mentoria mentoria = new Mentoria();
        // Define o título, descrição e data da mentoria
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Trabalhando com funções em Java");
        mentoria.setData(LocalDate.now());  // Define a data atual como a data da mentoria

        // Cria um novo objeto Curso curso2
        Curso curso2 = new Curso();
        // Define o título, descrição e carga horária do curso2
        curso2.setTitulo("Advanced Java Programming");
        curso2.setDescricao("Advanced concepts in Java programming");
        curso2.setCargaHoraria(60);

        // Imprime informações sobre o curso1 e a mentoria
        System.out.println(curso1.toString());
        System.out.println(mentoria.toString());

        // Cria um novo objeto Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        // Define o nome e descrição do bootcamp
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer.");
        
        // Adiciona curso1, curso2 e mentoria aos conteúdos do bootcamp
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criando e configurando o objeto Dev devVitor dentro do método main
        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        // Inscreve o devVitor no bootcamp
        devVitor.inscreverBootcamps(bootcamp);

        // Imprime os conteúdos inscritos pelo devVitor
        System.out.println("\n--- Informações do Dev Vitor ---");
        System.out.println("Nome: " + devVitor.getNome());
        System.out.println("Conteúdos inscritos: " + devVitor.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devVitor.getConteudosConcluidos());
        System.out.println("XP Total: " + devVitor.calcularTotalXp());

        // Faz o devVitor progredir em seus conteúdos inscritos
        devVitor.progredir();
        devVitor.progredir();

        // Imprime os conteúdos concluídos e inscritos restantes pelo devVitor após progredir
        System.out.println("-");
        System.out.println("Conteúdos concluídos: " + devVitor.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + devVitor.getConteudosInscritos());
        System.out.println("XP Atualizado: " + devVitor.calcularTotalXp());

        System.out.println("\n-------------------");

        // Criando e configurando o objeto Dev devJoao dentro do método main
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        // Inscreve o devJoao no bootcamp
        devJoao.inscreverBootcamps(bootcamp);

        // Imprime os conteúdos inscritos pelo devJoao
        System.out.println("\n--- Informações do Dev João ---");
        System.out.println("Nome: " + devJoao.getNome());
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());

        // Faz o devJoao progredir em seus conteúdos inscritos
        devJoao.progredir();

        // Imprime os conteúdos inscritos e concluídos pelo devJoao após progredir
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP Atualizado: " + devJoao.calcularTotalXp());
    }
}