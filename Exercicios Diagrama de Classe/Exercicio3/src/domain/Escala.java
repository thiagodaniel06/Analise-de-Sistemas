package domain;

public class Escala {
    private Passagem passagem;
    private ProgramacaoVoo programacaoVoo;
    private String poltrona;
    public Escala(Passagem passagem, ProgramacaoVoo programacaoVoo, String poltrona) {
        this.passagem = passagem;
        this.programacaoVoo = programacaoVoo;
        this.poltrona = poltrona;
    }
    public Passagem getPassagem() {
        return passagem;
    }
    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }
    public ProgramacaoVoo getProgramacaoVoo() {
        return programacaoVoo;
    }
    public void setProgramacaoVoo(ProgramacaoVoo programacaoVoo) {
        this.programacaoVoo = programacaoVoo;
    }
    public String getPoltrona() {
        return poltrona;
    }
    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }
    @Override
    public String toString() {
        return "Escala [passagem=" + passagem + ", programacaoVoo=" + programacaoVoo + ", poltrona=" + poltrona + "]";
    }
    
}
