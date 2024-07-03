package Dominio;  // Define o pacote onde a classe Dev está localizada

import java.util.LinkedHashSet;  // Importa a classe LinkedHashSet do pacote java.util
import java.util.Optional;  // Importa a classe Optional do pacote java.util
import java.util.Set;  // Importa a interface Set do pacote java.util

public class Dev {  // Declaração da classe Dev

    private String nome;  // Declaração do atributo nome, que armazena o nome do desenvolvedor
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();  // Declaração do atributo conteudosInscritos, que é um conjunto de Conteudo utilizando LinkedHashSet
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();;  // Declaração do atributo conteudosConcluidos, que é um conjunto de Conteudo utilizando LinkedHashSet
    
    // Método para inscrever o desenvolvedor em um bootcamp
    public void inscreverBootcamps(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());  // Adiciona todos os conteúdos do bootcamp aos conteúdos inscritos pelo desenvolvedor
        bootcamp.getDevsInscritos().add(this);  // Adiciona o próprio desenvolvedor à lista de inscritos do bootcamp
    }

    // Método para progredir nos conteúdos inscritos
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();  // Obtém o primeiro conteúdo da lista de conteúdos inscritos (se houver)
        if (conteudo.isPresent()) {  // Verifica se há algum conteúdo presente
            this.conteudosConcluidos.add(conteudo.get());  // Adiciona o conteúdo à lista de conteúdos concluídos
            this.conteudosInscritos.remove(conteudo.get());  // Remove o conteúdo da lista de conteúdos inscritos, pois foi concluído
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");  // Mensagem de erro caso não haja nenhum conteúdo inscrito
        }
    }

    // Método para calcular o total de XP obtido pelos conteúdos concluídos
    public double calcularTotalXp() {
        return this.conteudosConcluidos  // Retorna o resultado da soma dos XP de todos os conteúdos concluídos
            .stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo conteudosInscritos
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    // Setter para o atributo conteudosInscritos
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    // Getter para o atributo conteudosConcluidos
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    // Setter para o atributo conteudosConcluidos
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    // Sobrescrita do método hashCode para calcular o código hash do objeto
    @Override
    public int hashCode() {
        final int prime = 31;  // Constante utilizada para calcular o código hash
        int result = 1;  // Inicializa o resultado do cálculo do código hash
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());  // Calcula o código hash baseado no atributo nome
        result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());  // Calcula o código hash baseado no atributo conteudosInscritos
        result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());  // Calcula o código hash baseado no atributo conteudosConcluidos
        return result;  // Retorna o código hash calculado
    }

    // Sobrescrita do método equals para comparar objetos Dev
    @Override
    public boolean equals(Object obj) {
        if (this == obj)  // Verifica se os objetos são idênticos (mesma referência)
            return true;
        if (obj == null)  // Verifica se o objeto comparado é nulo
            return false;
        if (getClass() != obj.getClass())  // Verifica se os objetos pertencem à mesma classe
            return false;
        Dev other = (Dev) obj;  // Converte o objeto comparado para a classe Dev
        if (nome == null) {  // Verifica se o nome é nulo
            if (other.nome != null)  // Se o nome do outro objeto não for nulo, são diferentes
                return false;
        } else if (!nome.equals(other.nome))  // Compara os nomes dos objetos Dev
            return false;
        if (conteudosInscritos == null) {  // Verifica se a lista de conteúdos inscritos é nula
            if (other.conteudosInscritos != null)  // Se a lista do outro objeto não for nula, são diferentes
                return false;
        } else if (!conteudosInscritos.equals(other.conteudosInscritos))  // Compara as listas de conteúdos inscritos
            return false;
        if (conteudosConcluidos == null) {  // Verifica se a lista de conteúdos concluídos é nula
            if (other.conteudosConcluidos != null)  // Se a lista do outro objeto não for nula, são diferentes
                return false;
        } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))  // Compara as listas de conteúdos concluídos
            return false;
        return true;  // Retorna true se todos os atributos comparados forem iguais
    }
}
