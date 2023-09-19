package domain;

public class Cidade {
    private Integer codigo;
    private String nome;
    private Integer populacao;
    public Cidade(Integer codigo, String nome, Integer populacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.populacao = populacao;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getPopulacao() {
        return populacao;
    }
    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }
    @Override
    public String toString() {
        return "Cidade [codigo=" + codigo + ", nome=" + nome + ", populacao=" + populacao + "]";
    }
    
}


