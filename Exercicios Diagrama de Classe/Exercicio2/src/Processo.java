import java.util.Date;

public class Processo {
    private Integer numero;
    private Date dataAbertura;
    private Date dataConclusão;
    private Vara vara;
    private Pessoa reclamante;
    private Pessoa reclamado;
    public Processo(Integer numero, Date dataAbertura, Date dataConclusão, Vara vara, Pessoa reclamante,
            Pessoa reclamado) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.dataConclusão = dataConclusão;
        this.vara = vara;
        this.reclamante = reclamante;
        this.reclamado = reclamado;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Date getDataAbertura() {
        return dataAbertura;
    }
    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    public Date getDataConclusão() {
        return dataConclusão;
    }
    public void setDataConclusão(Date dataConclusão) {
        this.dataConclusão = dataConclusão;
    }
    public Vara getVara() {
        return vara;
    }
    public void setVara(Vara vara) {
        this.vara = vara;
    }
    public Pessoa getReclamante() {
        return reclamante;
    }
    public void setReclamante(Pessoa reclamante) {
        this.reclamante = reclamante;
    }
    public Pessoa getReclamado() {
        return reclamado;
    }
    public void setReclamado(Pessoa reclamado) {
        this.reclamado = reclamado;
    }
    @Override
    public String toString() {
        return "Processo [numero=" + numero + ", dataAbertura=" + dataAbertura + ", dataConclusão=" + dataConclusão
                + ", vara=" + vara + ", reclamante=" + reclamante + ", reclamado=" + reclamado + "]";
    }
    
}
