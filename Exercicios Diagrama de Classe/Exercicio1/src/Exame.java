import java.util.Date;

public class Exame {
    private Integer codigo;
    private Date data; 
    private String tipo;
    private String resultados;
    private Consulta consulta;
    public Exame(Integer codigo, Date data, String tipo, String resultados, Consulta consulta) {
        this.codigo = codigo;
        this.data = data;
        this.tipo = tipo;
        this.resultados = resultados;
        this.consulta = consulta;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getResultados() {
        return resultados;
    }
    public void setResultados(String resultados) {
        this.resultados = resultados;
    }
    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    @Override
    public String toString() {
        return "Exame [codigo=" + codigo + ", data=" + data + ", tipo=" + tipo + ", resultados=" + resultados
                + ", consulta=" + consulta + "]";
    }
    
}
