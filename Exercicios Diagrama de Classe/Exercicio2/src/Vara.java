public class Vara {
    private Integer codigo;
    private String nome;
    private Tribunal tribunal;
    public Vara(Integer codigo, String nome, Tribunal tribunal) {
        this.codigo = codigo;
        this.nome = nome;
        this.tribunal = tribunal;
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
    public Tribunal getTribunal() {
        return tribunal;
    }
    public void setTribunal(Tribunal tribunal) {
        this.tribunal = tribunal;
    }
    @Override
    public String toString() {
        return "Vara [codigo=" + codigo + ", nome=" + nome + ", tribunal=" + tribunal + "]";
    }
    
}
