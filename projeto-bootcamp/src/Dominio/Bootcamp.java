package Dominio;  // Define o pacote onde a classe Bootcamp está localizada

import java.time.LocalDate;  // Importa a classe LocalDate do pacote java.time
import java.util.HashSet;  // Importa a classe HashSet do pacote java.util
import java.util.LinkedHashSet;  // Importa a classe LinkedHashSet do pacote java.util
import java.util.Set;  // Importa a interface Set do pacote java.util

public class Bootcamp {  // Declaração da classe Bootcamp

    private String nome;  // Declaração do atributo nome, que armazena o nome do bootcamp
    private String descricao;  // Declaração do atributo descricao, que armazena a descrição do bootcamp
    private final LocalDate dataInicial = LocalDate.now();  // Declaração do atributo dataInicial, que armazena a data de início do bootcamp (definida como a data atual)
    private final LocalDate dataFim = dataInicial.plusDays(45);  // Declaração do atributo dataFim, que armazena a data de término do bootcamp (45 dias após a data de início)
    private Set<Dev> devsInscritos = new HashSet<>();  // Declaração do atributo devsInscritos, que é um conjunto de Dev utilizando HashSet
    private Set<Conteudo> conteudos = new LinkedHashSet<>();  // Declaração do atributo conteudos, que é um conjunto de Conteudo utilizando LinkedHashSet

    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo descricao
    public String getDescricao() {
        return descricao;
    }

    // Setter para o atributo descricao
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter para o atributo dataInicial
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    // Getter para o atributo dataFim
    public LocalDate getDataFim() {
        return dataFim;
    }

    // Getter para o atributo devsInscritos
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    // Setter para o atributo devsInscritos
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    // Getter para o atributo conteudos
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    // Setter para o atributo conteudos
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    // Sobrescrita do método hashCode para calcular o código hash do objeto
    @Override
    public int hashCode() {
        final int prime = 31;  // Constante utilizada para calcular o código hash
        int result = 1;  // Inicializa o resultado do cálculo do código hash
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());  // Calcula o código hash baseado no atributo nome
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());  // Calcula o código hash baseado no atributo descricao
        result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());  // Calcula o código hash baseado no atributo dataInicial
        result = prime * result + ((dataFim == null) ? 0 : dataFim.hashCode());  // Calcula o código hash baseado no atributo dataFim
        result = prime * result + ((devsInscritos == null) ? 0 : devsInscritos.hashCode());  // Calcula o código hash baseado no atributo devsInscritos
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());  // Calcula o código hash baseado no atributo conteudos
        return result;  // Retorna o código hash calculado
    }

    // Sobrescrita do método equals para comparar objetos Bootcamp
    @Override
    public boolean equals(Object obj) {
        if (this == obj)  // Verifica se os objetos são idênticos (mesma referência)
            return true;
        if (obj == null)  // Verifica se o objeto comparado é nulo
            return false;
        if (getClass() != obj.getClass())  // Verifica se os objetos pertencem à mesma classe
            return false;
        Bootcamp other = (Bootcamp) obj;  // Converte o objeto comparado para a classe Bootcamp
        if (nome == null) {  // Verifica se o nome é nulo
            if (other.nome != null)  // Se o nome do outro objeto não for nulo, são diferentes
                return false;
        } else if (!nome.equals(other.nome))  // Compara os nomes dos objetos Bootcamp
            return false;
        if (descricao == null) {  // Verifica se a descrição é nula
            if (other.descricao != null)  // Se a descrição do outro objeto não for nula, são diferentes
                return false;
        } else if (!descricao.equals(other.descricao))  // Compara as descrições dos objetos Bootcamp
            return false;
        if (dataInicial == null) {  // Verifica se a data inicial é nula
            if (other.dataInicial != null)  // Se a data inicial do outro objeto não for nula, são diferentes
                return false;
        } else if (!dataInicial.equals(other.dataInicial))  // Compara as datas iniciais dos objetos Bootcamp
            return false;
        if (dataFim == null) {  // Verifica se a data final é nula
            if (other.dataFim != null)  // Se a data final do outro objeto não for nula, são diferentes
                return false;
        } else if (!dataFim.equals(other.dataFim))  // Compara as datas finais dos objetos Bootcamp
            return false;
        if (devsInscritos == null) {  // Verifica se a lista de desenvolvedores inscritos é nula
            if (other.devsInscritos != null)  // Se a lista do outro objeto não for nula, são diferentes
                return false;
        } else if (!devsInscritos.equals(other.devsInscritos))  // Compara as listas de desenvolvedores inscritos dos objetos Bootcamp
            return false;
        if (conteudos == null) {  // Verifica se a lista de conteúdos é nula
            if (other.conteudos != null)  // Se a lista do outro objeto não for nula, são diferentes
                return false;
        } else if (!conteudos.equals(other.conteudos))  // Compara as listas de conteúdos dos objetos Bootcamp
            return false;
        return true;  // Retorna true se todos os atributos comparados forem iguais
    }
}
