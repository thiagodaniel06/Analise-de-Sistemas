public class Tratamento {
    private Integer codigo;
    private String sintomas;
    private Animal animal;
    public Tratamento(Integer codigo, String sintomas, Animal animal) {
        this.codigo = codigo;
        this.sintomas = sintomas;
        this.animal = animal;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getSintomas() {
        return sintomas;
    }
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    @Override
    public String toString() {
        return "Tratamento [codigo=" + codigo + ", sintomas=" + sintomas + ", animal=" + animal + "]";
    }
    
}
