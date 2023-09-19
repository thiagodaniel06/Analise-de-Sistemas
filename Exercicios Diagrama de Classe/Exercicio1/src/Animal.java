public class Animal {
    private Integer codigo;
    private String nome;
    private String sexo;
    private Integer idade;
    private Cliente cliente ;
    private Especie especie;
    public Animal(Integer codigo, String nome, String sexo, Integer idade, Cliente cliente) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cliente = cliente;
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
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    @Override
    public String toString() {
        return "Animal [codigo=" + codigo + ", nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", cliente="
                + cliente + "]";
    }
    public Especie getEspecie() {
        return especie;
    }
    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
    
    
}
