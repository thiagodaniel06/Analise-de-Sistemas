public class Veterinario {
private Integer codigo; 
private String nome;
private String crmu;
public Veterinario(Integer codigo, String nome, String crmu) {
    this.codigo = codigo;
    this.nome = nome;
    this.crmu = crmu;
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
public String getCrmu() {
    return crmu;
}
public void setCrmu(String crmu) {
    this.crmu = crmu;
}
@Override
public String toString() {
    return "Veterinario [codigo=" + codigo + ", nome=" + nome + ", crmu=" + crmu + "]";
}

}
