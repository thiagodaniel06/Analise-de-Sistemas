package domain;

import java.util.Date;

public class ProgramacaoVoo {
    private Voo voo;
    private Date dataPartida;
    private Date dataChegada;
    private String aviao;
    private Integer quantidadePassageiros;
    public ProgramacaoVoo(Voo voo, Date dataPartida, Date dataChegada, String aviao, Integer quantidadePassageiros) {
        this.voo = voo;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.aviao = aviao;
        this.quantidadePassageiros = quantidadePassageiros;
    }
    public Voo getVoo() {
        return voo;
    }
    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    public Date getDataPartida() {
        return dataPartida;
    }
    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }
    public Date getDataChegada() {
        return dataChegada;
    }
    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }
    public String getAviao() {
        return aviao;
    }
    public void setAviao(String aviao) {
        this.aviao = aviao;
    }
    public Integer getQuantidadePassageiros() {
        return quantidadePassageiros;
    }
    public void setQuantidadePassageiros(Integer quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }
    @Override
    public String toString() {
        return "ProgramacaoVoo [voo=" + voo + ", dataPartida=" + dataPartida + ", dataChegada=" + dataChegada
                + ", aviao=" + aviao + ", quantidadePassageiros=" + quantidadePassageiros + "]";
    }
    
    
}
