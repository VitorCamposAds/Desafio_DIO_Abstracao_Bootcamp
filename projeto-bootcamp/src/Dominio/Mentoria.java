package Dominio;  // Define o pacote onde a classe Mentoria está localizada

import java.time.LocalDate;  // Importa a classe LocalDate do pacote java.time

public class Mentoria extends Conteudo {  // Declaração da classe Mentoria que herda da classe Conteudo
    
    private LocalDate data;  // Declaração do atributo data, que armazena a data da mentoria

    @Override
    public double calcularXp() {  // Sobrescrita do método calcularXp da classe Conteudo
        return XP_PADRAO + 20d;  // Retorna o XP padrão da classe base mais 20
    }
    
    // Construtor padrão da classe Mentoria (não realiza nenhuma operação especial)

    public Mentoria () {

    }

    // Getter para o atributo data
    public LocalDate getData() {
        return data;
    }

    // Setter para o atributo data
    public void setData(LocalDate data) {
        this.data = data;
    }

    // Sobrescrita do método toString para formatar a representação da Mentoria como string
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";  // Retorna uma string formatada com título, descrição e data da mentoria
    }

}