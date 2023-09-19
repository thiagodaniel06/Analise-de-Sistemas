import java.util.Date;

public class Consulta {
    private Date data;
    private String resumo;
    private Tratamento tratamento;
    private Veterinario veterinario;
    public Consulta(Date data, String resumo, Tratamento tratamento, Veterinario veterinario) {
        this.data = data;
        this.resumo = resumo;
        this.tratamento = tratamento;
        this.veterinario = veterinario;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public Tratamento getTratamento() {
        return tratamento;
    }
    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }
    public Veterinario getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    @Override
    public String toString() {
        return "Consulta [data=" + data + ", resumo=" + resumo + ", tratamento=" + tratamento + ", veterinario="
                + veterinario + "]";
    }
    

    
}
